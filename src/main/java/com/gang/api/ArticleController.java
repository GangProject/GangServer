package com.gang.api;

import com.gang.api.common.ResponseDto;
import com.gang.domain.Article.ArticleDto;
import com.gang.domain.Article.ArticleRequestDto;
import com.gang.domain.Article.ArticleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by iljun on 2017-03-31.
 */
@Slf4j
@Api(value = "게시물 API", description = "게시물 API", basePath= "/api/article")
@RestController
@RequestMapping("/api/article")
public class ArticleController {

    @Autowired
    public ArticleService articleService;

    @ApiOperation(value = "게시물 작성", notes = "게시물 작성")
    @RequestMapping(value = "save", method = RequestMethod.POST)
    public ResponseDto saveArticle(ArticleRequestDto articleRequestDto){
        try{
            articleService.saveArticle(ArticleDto.of(articleRequestDto));
            return ResponseDto.ofSuccess("success");
        }catch(Exception e){
            log.info(e.getMessage());
        }
        return ResponseDto.ofEmpty();
    }
}
