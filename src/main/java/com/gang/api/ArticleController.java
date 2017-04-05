package com.gang.api;

import com.gang.api.common.ResponseDto;
import com.gang.domain.Article.ArticleDto;
import com.gang.domain.Article.ArticleListDto;
import com.gang.domain.Article.ArticleRequestDto;
import com.gang.domain.Article.ArticleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public ResponseDto saveArticle(@RequestParam(value="title") String title, @RequestParam(value="content") String content){
        try{
            articleService.saveArticle(ArticleDto.of(title,content));
            return ResponseDto.ofSuccess("success");
        }catch(Exception e){
            log.info(e.getMessage());
        }
        return ResponseDto.ofEmpty();
    }

    @ApiOperation(value="게시물 삭제", notes = "게시물 삭제")
    @RequestMapping(value = "delete" , method = RequestMethod.GET)
    public ResponseDto deleteArticle(@RequestParam(value="id") Long id){
        try{
            articleService.delete(id);
            return ResponseDto.ofSuccess("success");
        }catch(Exception e){
            log.info(e.getMessage());
        }
        return ResponseDto.ofEmpty();
    }

    @ApiOperation(value= "게시판 리스트", notes = "게시판 리스트")
    @RequestMapping(value = "" , method = RequestMethod.GET)
    public ArticleListDto list(@ApiParam(value = "현제 게시물 페이지 번호")
                                     @RequestParam(value="currentPage",required = false, defaultValue = "1") int currentPage){
        try{
            return articleService.findArticleList(currentPage);
        }catch(Exception e){
            log.info(e.getMessage());
        }
        return ArticleListDto.empty();
    }
}
