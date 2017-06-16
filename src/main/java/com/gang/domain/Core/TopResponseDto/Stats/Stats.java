package com.gang.domain.Core.TopResponseDto.Stats;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by iljun on 2017-06-16.
 */
@Getter
@Setter
public class Stats {

    private Long avgAssist;
    private Long avgCs;
    private Long avgDamageDealt;
    private Long avgDeath;
    private Long avgGoldEarned;
    private Long avgKill;
    private Long id;
    private Long kda;
    private Long lost;
    private String name;
    private Long played;
    private String tier;
    private Long totalDoubleKills;
    private Long totalMaxChampionsKilled;
    private Long totalMaxNumDeaths;
    private Long totalPentaKills;
    private Long totalQuadraKills;
    private Long totalTripleKills;
    private Long win;
    private Long winningRate;
}