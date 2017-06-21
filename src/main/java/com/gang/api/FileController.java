package com.gang.api;

import com.gang.domain.File.FileService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by iljun on 2017-06-21.
 */
@RestController
@RequestMapping("/api/file")
@Slf4j
@Api(value = "파일 API", description = "파일 API", basePath= "/api/file")
public class FileController {

    @Autowired
    private FileService;

    @RequestMapping("/insert")
    @ApiOperation(value = "file insert" , notes = "file insert")
    public void insertFile(){

    }
}
