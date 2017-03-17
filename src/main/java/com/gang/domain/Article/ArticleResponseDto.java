package com.gang.domain.Article;

import lombok.*;

/**
 * Created by iljun on 2017-03-17.
 */
@Getter
@Builder
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ArticleResponseDto {
    private Long id;
    private String title;
    private String content;

    public static ArticleResponseDto of(ArticleDto articleDto){
        return ArticleResponseDto.builder()
                .id(articleDto.getId())
                .title(articleDto.getTitle())
                .content(articleDto.getContent())
                .build();
    }
}
