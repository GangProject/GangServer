package com.gang.api;

import com.gang.domain.Log.LogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * Created by iljun on 2017-06-05.
 */
@ControllerAdvice
public class MyExceptionHandler {

    @Autowired
    private LogService logService;

    @ExceptionHandler(value = { Exception.class} )
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public String handlerException(Exception e){
        System.out.println("ExceptionContollerAdvice" + e.getMessage());
        String errorMsg = logService.logError(e);
        return e.getMessage();
    }
}
