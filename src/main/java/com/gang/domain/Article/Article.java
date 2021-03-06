package com.gang.domain.Article;

import javax.persistence.*;

import com.gang.domain.Comment.Comment;
import com.gang.domain.commons.Modified;
import lombok.*;

import java.util.List;

/**
 * Created by iljun on 2017-03-11.
 */
@Entity
@Getter
@Setter
@Table( name = "\"Article\"")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Article extends Modified{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Article_id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "content")
    @Lob
    private String content;

    @Column(name = "writer")
    private String writer;

    public static Article of(String title, String content){
        return Article.builder()
                .title(title)
                .content(content)
                .build();
    }

    public static Article of(ArticleDto articleDto,String writer){
        return Article.builder()
                .title(articleDto.getTitle())
                .content(articleDto.getContent())
                .writer(writer)
                .build();
    }

}
