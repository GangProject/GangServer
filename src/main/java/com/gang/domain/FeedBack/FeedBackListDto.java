package com.gang.domain.FeedBack;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by iljun on 2017-04-07.
 */
@Getter
@Setter
@Builder
public class FeedBackListDto {
    List<FeedBack> list;
    int currentPage;
    int totalPage;

    public static FeedBackListDto of(List<FeedBack> list, int currentPage,int totalPage){
        return FeedBackListDto.builder()
                .list(list)
                .currentPage(currentPage)
                .totalPage(totalPage)
                .build();
    }

    public static FeedBackListDto empty(){
        return FeedBackListDto.builder()
                .list(null)
                .currentPage(0)
                .totalPage(0)
                .build();
    }
}
