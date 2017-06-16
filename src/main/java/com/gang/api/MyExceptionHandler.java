package com.gang.api;

import com.gang.api.common.ResponseDto;
import com.gang.domain.Log.LogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * Created by iljun on 2017-06-05.
 */
//@ControllerAdvice
public class MyExceptionHandler {
/*
    @Autowired
    private LogService logService;

    @ExceptionHandler(value = { Exception.class} )
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public ResponseDto handlerException(Exception e){
        String errorMsg = logService.logError(e);
        return ResponseDto.ofFail(errorMsg);
    }
*/
}
