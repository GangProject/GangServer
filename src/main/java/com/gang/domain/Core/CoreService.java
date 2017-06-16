package com.gang.domain.Core;

import com.gang.api.common.ResponseDto;
import com.gang.domain.Core.ResponseGame.GameEntity.GameEntity;
import com.gang.domain.Core.ResponseGame.GameInfo;
import com.gang.domain.Core.ResponseGame.MMR.MMR;
import com.gang.domain.Core.ResponseGame.Ranked.Ranked;
import com.gang.domain.Core.ResponseGame.ResponseGame;
import com.gang.domain.Core.TopResponseDto.Leagues.Leagues;
import com.gang.domain.Core.TopResponseDto.LeaguesDto;
import com.gang.domain.Core.TopResponseDto.RankedList;
import com.gang.domain.Core.TopResponseDto.TopResponseDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

import static org.springframework.social.facebook.api.Page.PriceRange.$;

/**
 * Created by iljun on 2017-06-13.
 */
@Service
@Slf4j
public class CoreService {

    @Value("${core.url}")
    private String url;

    @Autowired
    private RestTemplate restTemplate;

    public ResponseDto mmrSearch(String name){
        StringBuilder builder = new StringBuilder();
        builder.append(url);
        builder.append("summoner/soloMmr");
        builder.append("?name=");
        builder.append(name);
        MMR mmr = restTemplate.getForObject(builder.toString(),MMR.class);

        return ResponseDto.ofSuccess(mmr.getMessage().toString(),mmr);
    }

    public ResponseDto currentGameSearch(String name){
        StringBuilder builder = new StringBuilder();
        builder.append(url);
        builder.append("/recent/dbGame?name=");
        builder.append(name);

        ResponseGame[] responseGame= restTemplate.getForObject(builder.toString(),ResponseGame[].class);

        //builder.delete(0,builder.length());

        //builder.append(url);
        //builder.append("/ranked/info?name=");
        //builder.append(name);

        //Ranked ranked = restTemplate.getForObject(builder.toString(),Ranked.class);

        return ResponseDto.ofSuccess("success",responseGame);
    }

    public ResponseDto reload(String name){
        return ResponseDto.ofEmpty();
    }

    public ResponseDto detailGame(long gid){
        return ResponseDto.ofEmpty();
    }

    public ResponseDto BestChampAndUser(String name){
        StringBuilder builder = new StringBuilder();
        builder.append(url);
        builder.append("/rankedStats/info?name=");
        builder.append(name);

        RankedList ranked = restTemplate.getForObject(builder.toString(), RankedList.class);

        builder.delete(0,builder.length());

        builder.append(url);
        builder.append("/summoner/info?name=");
        builder.append(name);

        LeaguesDto leaguesDto = restTemplate.getForObject(builder.toString(), LeaguesDto.class);

        return ResponseDto.ofSuccess("성공",new TopResponseDto(ranked,leaguesDto));
    }
}
