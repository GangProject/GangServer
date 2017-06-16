package com.gang.domain.Core.ResponseGame.Ranked;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by iljun on 2017-06-12.
 */
@Getter
@Setter
public class Stats {
    private Long avgAssist;
    private Long avgCs;
    private Long avgKill;
    private Long avgDeath;
    private Long id;
    private Long kda;
    private String name;
    private Long played;
    private String tier;
    private Long winningRate;
}
