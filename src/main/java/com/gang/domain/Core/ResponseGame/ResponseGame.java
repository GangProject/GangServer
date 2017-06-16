package com.gang.domain.Core.ResponseGame;

import com.gang.domain.Core.ResponseGame.GameEntity.GameEntity;
import com.gang.domain.Core.ResponseGame.PlayerEntity.PlayerEntity;
import com.gang.domain.Core.ResponseGame.Ranked.Ranked;
import lombok.*;

import java.util.List;

/**
 * Created by iljun on 2017-06-12.
 */
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResponseGame {

    private GameEntity gameEntity;
    private List<PlayerEntity> playerEntity;

    public static ResponseGame of(GameEntity gameEntity, List<PlayerEntity> playerEntity){
        return ResponseGame.builder()
                .gameEntity(gameEntity)
                .playerEntity(playerEntity)
                .build();
    }
}
