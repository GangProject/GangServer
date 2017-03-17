package com.gang.domain.Article;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by iljun on 2017-03-17.
 */
@Slf4j
@Service
public class ArticleService {
    @Autowired
    private ArticleRepository articleRepository;

    @Transactional(readOnly = false)
    public Article saveArticle(ArticleDto articleDto){
        return articleRepository.save(Article.of(articleDto));
    }

    public List<Article> findAllArticleList(){
        return articleRepository.findAll();
    }
}
