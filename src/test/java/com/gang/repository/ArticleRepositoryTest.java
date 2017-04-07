package com.gang.repository;

import com.gang.GangApplication;
import com.gang.domain.Article.Article;
import com.gang.domain.Article.ArticleRepository;
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
 * Created by iljun on 2017-03-17.
 */
@RunWith(SpringRunner.class)
@DataJpaTest
@SpringBootTest(classes=GangApplication.class)
@WebAppConfiguration
@AutoConfigureWebMvc
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class ArticleRepositoryTest {
    @Autowired
    private ArticleRepository articleRepository;

    private Article article;

    @Before
    public void setUp() throws Exception{
        article = Article.of("test3_title","test3_content");
    }

    @Test
    public void saveTest() throws Exception{
        Article Created = articleRepository.save(article);
        Article findArticle = articleRepository.findOne(Created.getId());

        assertThat(Created.getTitle(), is(findArticle.getTitle()));
        assertThat(Created.getContent(), is(findArticle.getContent()));
    }

    @Test
    public void deleteTest() throws Exception{
        Article Created = articleRepository.save(article);
        Article findArticle = articleRepository.findOne(Created.getId());

        assertThat(Created.getTitle(), is(findArticle.getTitle()));
        assertThat(Created.getContent(), is(findArticle.getContent()));

        articleRepository.delete(findArticle.getId());
        //TODO 삭제여부 검색

    }
}
