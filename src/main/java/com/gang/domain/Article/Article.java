package com.gang.domain.Article;

import javax.persistence.*;

import com.gang.domain.commons.Modified;
import lombok.*;
/**
 * Created by iljun on 2017-03-11.
 */
@Entity
@Getter
@Setter
@Table( name = "article")
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

}
