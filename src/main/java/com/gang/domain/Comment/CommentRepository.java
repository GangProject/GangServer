package com.gang.domain.Comment;

import com.gang.domain.commons.GangRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by iljun on 2017-04-11.
 */
@Repository
public interface CommentRepository extends GangRepository<Comment, Long>{
    void deleteByArticleId(Long articleId);
    int countByArticleId(Long articleId);
    List<Comment> findByArticleId(Long articleId);
}
