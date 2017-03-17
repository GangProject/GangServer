package com.gang.ArticleTest;

import com.gang.config.GangApplication;
import com.gang.config.MvcConfig;
import com.gang.domain.Article.Article;
import com.gang.domain.Article.ArticleDto;
import com.gang.domain.Article.ArticleRepository;
import com.gang.domain.Article.ArticleService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import lombok.*;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import javax.annotation.Resource;
import javax.transaction.Transactional;
/**
 * Created by iljun on 2017-03-17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = GangApplication.class)
@WebIntegrationTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@ActiveProfiles(profiles = "test")
public class ArticleTest {

    @Autowired
    @Qualifier("articleRepository")
    private ArticleRepository articleRepository;

    @Resource(name = "articleService")
    private ArticleService articleService;

    @Test
    public void testCreateArticle() throws Exception{
        Article article = Article.of("test_title","test_content");
        Article createArticle = articleRepository.save(article);
        Assert.assertEquals(article,createArticle);
    }

}
