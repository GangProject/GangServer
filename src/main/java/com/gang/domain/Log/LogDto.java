package com.gang.domain.Log;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * Created by iljun on 2017-06-06.
 */
@Getter
@Setter
@Builder
public class LogDto {

    private String ip;
    private String url;
    private String body;
    private LocalDateTime createdAt;
    private String createBy;

    public static LogDto of(Log log){
        return LogDto.builder()
                .ip(log.getIp())
                .url(log.getUrl())
                .body(log.getBody())
                .createBy(log.getCreatedBy())
                .createdAt(log.getCreatedAt())
                .build();
    }
}
