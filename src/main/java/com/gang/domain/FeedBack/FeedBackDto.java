package com.gang.domain.FeedBack;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by iljun on 2017-04-07.
 */
@Getter
@Setter
@Builder
public class FeedBackDto {

    private String content;
    private String name;
    private String password;

    public static FeedBackDto of(String content, String name, String password){
        return FeedBackDto.builder()
                .content(content)
                .name(name)
                .password(password)
                .build();
    }
}
