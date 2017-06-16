package com.gang.domain.Core.TopResponseDto.Leagues;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by iljun on 2017-06-16.
 */
@Getter
@Setter
public class Leagues {

    private String division;
    private Long id;
    private Long leaguePoints;
    private Long losses;
    private String name;
    private Long summonerId;
    private String tier;
    private Long winingRate;
    private Long wins;
}
