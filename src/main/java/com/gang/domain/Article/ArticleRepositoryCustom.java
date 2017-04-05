package com.gang.domain.Article;

import java.util.List;

/**
 * Created by iljun on 2017-04-05.
 */
public interface ArticleRepositoryCustom {
    List<Article> articleList(int currnetPage);
}
