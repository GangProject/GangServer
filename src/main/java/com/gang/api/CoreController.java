package com.gang.api;

import com.gang.api.common.ResponseDto;
import com.gang.domain.Core.CoreService;
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
 * Created by iljun on 2017-06-12.
 */
@RestController
@RequestMapping("api/core")
@Slf4j
@Api(value = "Core API", description = "Core API", basePath = "/api/core")
public class CoreController {

    @Autowired
    private CoreService coreService;

    @ApiOperation(value = "솔랭 MMR검색", notes="솔랭 MMR검색")
    @RequestMapping(value = "MMRSearch" ,method = RequestMethod.GET)
    public ResponseDto mmrSearch(@RequestParam("name") String name){
        return coreService.mmrSearch(name);
    }

    @ApiOperation(value = "소환사 검색", notes = "소환사 검색")
    @RequestMapping(value = "currentGameSearch", method = RequestMethod.GET)
    public ResponseDto currentGameSearch(@ApiParam(value="소환사 명")
                                             @RequestParam("name") String name){
        return coreService.currentGameSearch(name);
    }

    @ApiOperation(value = "전적 갱신", notes = "전적 갱신")
    @RequestMapping(value="reload", method = RequestMethod.GET)
    public ResponseDto reload(@ApiParam(value="소환사 명")
                                @RequestParam("name") String name){
        return coreService.reload(name);
    }

    @ApiOperation(value = "게임 상세정보", notes = "게임 상세정보")
    @RequestMapping(value = "detailGame", method = RequestMethod.GET)
    public ResponseDto detailGame(@ApiParam(value = "gameId")
                                  @RequestParam("gid") long gid){
        return coreService.detailGame(gid);
    }

    @ApiOperation(value = "베스트챔프 API", notes = "베스트 챔프 API")
    @RequestMapping(value = "bestChamp", method = RequestMethod.GET)
    public ResponseDto bestChamp(@ApiParam(value = "name")
                                 @RequestParam("name") String name){
        return coreService.BestChampAndUser(name);
    }
}
