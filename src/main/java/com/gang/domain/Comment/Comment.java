package com.gang.domain.Comment;

import com.gang.domain.Article.Article;
import com.gang.domain.commons.Created;
import lombok.*;

import javax.persistence.*;

/**
 * Created by iljun on 2017-03-11.
 */
@Getter
@Setter
@Builder
@Entity
@Table( name = "Comment")
@AllArgsConstructor
@NoArgsConstructor
public class Comment extends Created{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column( name = "Comment_id")
    private Long id;

    @Column( name = "content")
    private String content;

    @Column( name ="article_id")
    private Long articleId;

    public static Comment of(Article article, String content){
        return Comment.builder()
                .articleId(article.getId())
                .content(content)
                .build();
    }
}
