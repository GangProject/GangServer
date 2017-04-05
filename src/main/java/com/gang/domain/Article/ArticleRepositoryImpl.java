package com.gang.domain.Article;

import org.springframework.data.jpa.repository.support.QueryDslRepositorySupport;

import java.util.List;

/**
 * Created by iljun on 2017-04-05.
 */
public class ArticleRepositoryImpl extends QueryDslRepositorySupport implements ArticleRepositoryCustom {
    private QArticle qArticle = QArticle.article;

    public ArticleRepositoryImpl(){
        super(Article.class);
    }

    @Override
    public List<Article> articleList(int currentPage){
        return from(qArticle)
                .limit(currentPage*10)
                .fetch();
    }
}
