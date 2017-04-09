package com.gang.domain.FeedBack;

import lombok.*;

import java.util.List;

/**
 * Created by iljun on 2017-04-07.
 */
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FeedBackListDto {
    private List<FeedBack> list;
    private int currentPage;
    private int totalPage;

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
