package com.gang.domain.Core.ResponseGame;

import com.gang.domain.Core.ResponseGame.GameEntity.GameEntity;
import com.gang.domain.Core.ResponseGame.PlayerEntity.PlayerEntity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by iljun on 2017-06-12.
 */
@Getter
@Setter
public class GameInfo {

    private GameEntity gameEntity;
    private List<PlayerEntity> playerEntityList;

}
