package com.gang.api;

import com.gang.api.common.ResponseDto;
import com.gang.domain.FeedBack.FeedBackListDto;
import com.gang.domain.FeedBack.FeedBackService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by iljun on 2017-04-07.
 */
@RestController
@RequestMapping("/api/feedBack")
@Slf4j
@Api(value = "피드백 API", description = "피드백 API", basePath= "/api/feedBack")
public class FeedBackController {

    @Autowired
    private FeedBackService feedBackService;

    @ApiOperation(value = "피드백 List" , notes = "피드백 List")
    @RequestMapping(value = "" , method = RequestMethod.GET)
    public FeedBackListDto list (@ApiParam(value="피드백 페이지 번호")
                                     @RequestParam(value= "currentPage", required = false, defaultValue = "1") int currentPage){
        try{
            return feedBackService.findList(currentPage);
        }catch(Exception e){
            log.error("feedback List " + e.getMessage(),e);
        }
        return FeedBackListDto.empty();
    }

    @ApiOperation(value = "피드백 save", notes = "피드백 save")
    @RequestMapping(value = "save", method = RequestMethod.POST)
    public ResponseDto save(@ApiParam(value = "닉네임")
                                @RequestParam(value = "name") String name,
                            @ApiParam(value = "패스워드")
                                @RequestParam(value = "password") String password,
                            @ApiParam(value = "피드백 본문")
                                @RequestParam(value = "content") String content){
        try{
            feedBackService.feedBackSave(name,password,content);
            return ResponseDto.ofSuccess("저장 성공");
        }catch(Exception e){
            log.error("feedback save" + e.getMessage(),e);
        }
        return ResponseDto.ofFail("저장 실패");
    }

    @ApiOperation(value = "피드백 remove", notes= "피드백 remove")
    @RequestMapping(value = "remove", method = RequestMethod.GET)
    public ResponseDto remove(@ApiParam(value = "피드백 id")
                              @RequestParam(value= "id") Long id){
        try{
            feedBackService.feedBackRemove(id);
            return ResponseDto.ofSuccess("성공");
        }catch(Exception e){
            log.error("feedBack remove " + e.getMessage() , e);
        }
        return ResponseDto.ofFail("실패");
    }

    @ApiOperation(value = "피드백 update", notes = "피드백 update")
    @RequestMapping(value = "update", method = RequestMethod.POST)
    public ResponseDto update(@ApiParam(value = "피드백 id")
                              @RequestParam(value = "id") Long id,
                              @ApiParam(value = "패스워드")
                              @RequestParam(value = "password") String password,
                              @ApiParam(value = "피드백 본문")
                              @RequestParam(value = "content") String content
                              ){
        String message=null;
        try{
            message = feedBackService.feedBackUpdate(id,password,content);
            return ResponseDto.ofSuccess(message);
        }catch(Exception e){
            log.error("feedBack update " + e.getMessage(), e);
        }
        return ResponseDto.ofFail(message);
    }
}
