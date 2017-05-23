package com.gang.domain.Article;

import com.gang.domain.Comment.Comment;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by iljun on 2017-04-14.
 */
@Getter
@Setter
@Builder
public class ArticleDetailDto {
    private Long id;
    private String title;
    private String content;
    private LocalDateTime lastModifiedTime;
    private List<Comment> commentList;

    public static ArticleDetailDto of(Article article ,List<Comment> comment){
        return ArticleDetailDto.builder()
                .id(article.getId())
                .title(article.getTitle())
                .content(article.getContent())
                .lastModifiedTime(article.getModifiedAt())
                .commentList(comment)
                .build();
    }
}
