package com.gang.domain.Article;

import com.gang.domain.commons.GangRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Created by iljun on 2017-03-17.
 */
@Repository
public interface ArticleRepository extends GangRepository<Article, Long> {
}
