package com.gang.repository;

import com.gang.GangApplication;
import com.gang.domain.Article.Article;
import com.gang.domain.Article.ArticleDto;
import com.gang.domain.Article.ArticleService;
import com.gang.domain.Comment.Comment;
import com.gang.domain.Comment.CommentRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureWebMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

/**
 * Created by iljun on 2017-04-11.
 */
@DataJpaTest
@RunWith(SpringRunner.class)
@SpringBootTest(classes = GangApplication.class)
@WebAppConfiguration
@AutoConfigureWebMvc
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class CommentRepositoryTest {

    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private ArticleService articleService;

    private Comment comment;
    private Article article;

    @Before
    public void sestup() throws Exception{
        article = articleService.saveArticle(ArticleDto.of("test","test"));
        comment = Comment.of(article,"test");
    }

    @Test
    public void saveTest() throws Exception{
        Comment createdComment = commentRepository.save(comment);
        Comment findByComment = commentRepository.findOne(createdComment.getId());

        assertThat(createdComment.getContent() ,is(findByComment.getContent()));
        assertThat(createdComment.getArticleId(), is(findByComment.getArticleId()));
    }

    @Test
    public void deleteTest() throws Exception{
        commentRepository.save(comment);
        commentRepository.save(comment);
        commentRepository.save(comment);

        commentRepository.deleteByArticleId(article.getId());

        assertThat(commentRepository.countByArticleId(article.getId()), is(0));
    }

}
