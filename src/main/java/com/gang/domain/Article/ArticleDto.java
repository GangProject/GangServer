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
    private String content;
    private String title;


    public static ArticleDto of(Article article){
        return ArticleDto.builder()
                .id(article.getId())
                .content(article.getContent())
                .title(article.getTitle())
                .build();
    }

    public static ArticleDto of(String content, String title){
        return ArticleDto.builder()
                .content(content)
                .title(title)
                .build();
    }


}
