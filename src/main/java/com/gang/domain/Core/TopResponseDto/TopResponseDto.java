package com.gang.domain.Core.TopResponseDto;

import com.gang.domain.Core.TopResponseDto.Leagues.Leagues;
import com.gang.domain.Core.TopResponseDto.Stats.Stats;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by iljun on 2017-06-16.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TopResponseDto {

    private RankedList ranked;
    private LeaguesDto leaguesDto;
}
