package com.gang;

import com.gang.api.ArticleController;
import com.gang.domain.Article.ArticleResponseDto;
import net.minidev.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by iljun on 2017-03-31.
 */
@RunWith(SpringRunner.class)
@SpringBootTest//@ContextConfiguration대신에 사용 springboot에서 제공해주는 annotation
@AutoConfigureMockMvc
public class ArticleControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void articleSaveTst() throws Exception{
        ArticleResponseDto dto = new ArticleResponseDto();
        dto.setTitle("titleTest");
        dto.setContent("contentTest");
        mockMvc.perform(post("/api/article/save")//요청하는 url
                .accept(MediaType.APPLICATION_JSON)
                .contentType(MediaType.APPLICATION_JSON)
                .content(dto.toString()))
                .andExpect(status().isOk())//요청결과가 200이다
                .andReturn();
    }
}
