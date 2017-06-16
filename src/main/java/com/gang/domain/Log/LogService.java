package com.gang.domain.Log;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by iljun on 2017-06-06.
 */
@Service
public class LogService {

    @Autowired
    private LogRepository logRepository;

    public String logError(Exception e){
        String errorMsg = save(e);
        return errorMsg;
    }

    private String save(Exception e){
        String msg=null;
        try{
            HttpServletRequest request = ((ServletRequestAttributes)(RequestContextHolder.getRequestAttributes())).getRequest();

            String ip = request.getHeader("X-FORWARD-FOR");
            if(ip==null)
                ip = request.getRemoteAddr();
            Log log = Log.of(ip,getFullURL(request),ExceptionUtils.getStackTrace(e));

            logRepository.save(log);

            msg = e.getMessage();
        }catch(Exception e2){
            e.printStackTrace(System.out);
            e2.printStackTrace(System.out);
        }
        return msg;
    }

    static String getFullURL(HttpServletRequest request) {
        StringBuffer requestURL = request.getRequestURL();
        String queryString = request.getQueryString();
        if (queryString == null)
            return requestURL.toString();
        return requestURL.append('?').append(queryString).toString();
    }

    public List<Log> list(){
        return logRepository.findAll();
    }

    public void delete(Long id){
        logRepository.delete(id);
    }
}
