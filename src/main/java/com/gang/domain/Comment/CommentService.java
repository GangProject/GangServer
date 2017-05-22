package com.gang.domain.Comment;

import com.gang.domain.Article.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.WebServiceRef;
import java.util.List;

/**
 * Created by iljun on 2017-04-11.
 */
@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private ArticleService articleService;

    public void save(Long articleId, String content){
        commentRepository.save(Comment.of(articleService.findById(articleId),content));
    }

    public void delete(Long articleId){
        commentRepository.deleteByArticleId(articleId);
    }

    public List<Comment> findByArticleId(Long articleId){
        return commentRepository.findByArticleId(articleId);
    }

    public int countByArticleId(Long articleId){
        return commentRepository.countByArticleId(articleId);
    }
}
