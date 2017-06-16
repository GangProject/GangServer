package com.gang.domain.Core.TopResponseDto;

import com.gang.domain.Core.TopResponseDto.Leagues.Leagues;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by iljun on 2017-06-16.
 */
@Getter
@Setter
public class LeaguesDto {

    private List<Leagues> leagues;
    private Long resultCount;
}
