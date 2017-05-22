package com.gang.domain.Article;

import lombok.Setter;
import lombok.Builder;
import lombok.Getter;

/**
 * Created by iljun on 2017-05-22.
 */
@Getter
@Setter
@Builder
public class ListDto {
    private Article article;
    private int commentCount;

    public static ListDto of(Article article, int commentCount){
        return ListDto.builder()
                .article(article)
                .commentCount(commentCount)
                .build();
    }
}
