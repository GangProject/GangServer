package com.gang.api.common;

import ch.qos.logback.core.joran.spi.NoAutoStart;
import lombok.*;

/**
 * Created by iljun on 2017-03-16.
 */
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HelloResponseDto {
    private String data;

    public static HelloResponseDto of(){
        return HelloResponseDto.builder()
                .data("hello")
                .build();
    }
}
