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
public class ArticleDto {
    private Long id;
    private String title;
    private String content;

    public static ArticleDto of(Article article){
        return ArticleDto.builder()
                .id(article.getId())
                .title(article.getTitle())
                .content(article.getContent())
                .build();
    }

    public static ArticleDto of(String title, String content){
        return ArticleDto.builder()
                .title(title)
                .content(content)
                .build();
    }


}
