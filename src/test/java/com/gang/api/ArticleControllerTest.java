package com.gang.api;

import com.gang.api.ArticleController;
import com.gang.domain.Article.Article;
import com.gang.domain.Article.ArticleDto;
import com.gang.domain.Article.ArticleService;
import net.minidev.json.JSONObject;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by iljun on 2017-03-31.
 */
@RunWith(SpringRunner.class)
@SpringBootTest//@ContextConfiguration대신에 사용 springboot에서 제공해주는 annotation
@AutoConfigureMockMvc
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class ArticleControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ArticleService articleService;

    private Article article;

    @Before
    public void setUp() throws Exception{
        article = Article.of("test","test");
        article = articleService.saveArticle(ArticleDto.of(article));
    }

    @Test
    public void articleSaveTest() throws Exception{
        mockMvc.perform(post("/api/article/save")//요청하는 url
                .accept(MediaType.APPLICATION_JSON)
                .contentType(MediaType.APPLICATION_JSON)
                .param("title",article.getTitle())
                .param("content",article.getContent()))
                .andExpect(status().isOk())//요청결과가 200이다
                .andReturn();
    }

    @Test
    public void articleListTest() throws Exception{
        mockMvc.perform(get("/api/article")
                .accept(MediaType.APPLICATION_JSON)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();
    }

    @Test
    public void articleReadTest() throws Exception{
        mockMvc.perform(get("/api/article/read")
                .accept(MediaType.APPLICATION_JSON)
                .contentType(MediaType.APPLICATION_JSON)
                .param("articleId", String.valueOf(article.getId())))
                .andExpect(status().isOk())
                .andReturn();
    }
}
