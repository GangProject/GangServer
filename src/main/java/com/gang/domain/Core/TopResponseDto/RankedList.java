package com.gang.domain.Core.TopResponseDto;

import com.gang.domain.Core.TopResponseDto.Stats.Stats;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by iljun on 2017-06-16.
 */
@Getter
@Setter
public class RankedList {

    private Long resultCount;
    private List<Stats> stats;
}
