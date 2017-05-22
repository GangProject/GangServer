package com.gang.domain.Article;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by iljun on 2017-05-22.
 */
@Getter
@Setter
@Builder
public class ArticleResponseDto {
    Long id;
    String message;

    public static ArticleResponseDto of(Article article,String message){
        return ArticleResponseDto.builder()
                .id(article.getId())
                .message(message)
                .build();
    }

    public static ArticleResponseDto of(){
        return ArticleResponseDto.builder()
                .id(null)
                .message("fail")
                .build();
    }
}
