package com.gang.domain.Comment;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by iljun on 2017-04-11.
 */
@Getter
@Setter
@Builder
public class CommentDto {
    private Long articleId;
    private String content;

    public static CommentDto of(Long articleId, String content){
        return CommentDto.builder()
                .articleId(articleId)
                .content(content)
                .build();
    }
}
