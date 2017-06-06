package com.gang.api;

import com.gang.domain.Log.Log;
import com.gang.domain.Log.LogService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by iljun on 2017-06-06.
 */
@RestController
@RequestMapping("/api/log")
@Api(value = "Error Log API", description = "Error Log API", basePath= "/api/log")
public class LogController {

    @Autowired
    private LogService logService;

    @ApiOperation(value = "log List", notes = "log List")
    @RequestMapping("list")
    public List<Log> list(){
        return logService.list();
    }

    @ApiOperation(value = "log delete", notes = "log delete")
    @RequestMapping(value = "delete",method = RequestMethod.GET)
    public void delete(
            @ApiParam(value = "log id")
            @RequestParam("id") Long id){
        logService.delete(id);
    }

}
