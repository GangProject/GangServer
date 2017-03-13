package com.gang.api;

import com.gang.api.common.ResponseDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by iljun on 2017-03-11.
 */
@Slf4j
@Api(value = "test API", description = "test API", basePath= "/api/hello")
@RestController
@RequestMapping("/api/hello")
public class HelloController {
    @ApiOperation(value = "hello api", notes = "hello api")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseDto index(){
        return ResponseDto.ofSuccess("Success");
    }

}
