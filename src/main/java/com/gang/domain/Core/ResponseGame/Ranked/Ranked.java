package com.gang.domain.Core.ResponseGame.Ranked;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by iljun on 2017-06-12.
 */
@Getter
@Setter
public class Ranked {
    private Long resultCount;
    private List<Stats> statsList;

}
