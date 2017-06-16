package com.gang.domain.Core.ResponseGame.GameEntity;

import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;

/**
 * Created by iljun on 2017-06-12.
 */
@Getter
@Setter
public class GameEntity {
    private Integer assist;
    private String champion;
    private String createDate;
    private Long damage;
    private Long date;
    private Long deth;
    private String gameMode;
    private BigInteger gameid;
    private Integer gold;
    private Integer id;
    private String item0;
    private String item1;
    private String item2;
    private String item3;
    private String item4;
    private String item5;
    private String item6;
    private Integer kill;
    private Integer map;
    private String spell1;
    private String spell2;
    private String subType;
    private Integer summonerid;
    private Integer teamId;
    private Long ward;
    private boolean win;
}
