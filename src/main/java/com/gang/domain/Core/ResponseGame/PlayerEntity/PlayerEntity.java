package com.gang.domain.Core.ResponseGame.PlayerEntity;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by iljun on 2017-06-12.
 */
@Getter
@Setter
public class PlayerEntity {
    private Integer championId;
    private Long gameid;
    private Integer id;
    private Integer playerid;
    private String playername;
    private Integer teamid;
}
