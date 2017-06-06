package com.gang.domain.Article;

import com.gang.domain.Comment.QComment;
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
                .offset((currentPage-1) * 10)
                .limit(currentPage*10)
                .orderBy(qArticle.id.desc())
                .fetch();
    }

    @Override
    public int totalCount(){
        return (int)from(qArticle)
                .fetchCount();
    }

}
