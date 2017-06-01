package com.gang.domain.GameInfo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by iljun on 2017-06-01.
 */
@Getter
@Setter
@Builder
public class GameInfo {
    private String leftTeam;
    private String rightTeam;
    private String status;
    private String time;

    public static GameInfo of(String leftTeam, String rightTeam, String status, String time){
        return GameInfo.builder()
                .leftTeam(leftTeam)
                .rightTeam(rightTeam)
                .status(status)
                .time(time)
                .build();
    }

    public static GameInfo of(){
        return GameInfo.builder()
                .leftTeam("")
                .rightTeam("")
                .status("")
                .time("")
                .build();
    }
}
