package com.gang.api;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

/**
 * Created by iljun on 2017-04-07.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class FeedBackControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void feedBackListTest() throws Exception{
        mockMvc.perform(get("/api/feedBack")
                .accept(MediaType.APPLICATION_JSON)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();
    }

    @Test
    public void feedBackSaveTest() throws Exception{
        mockMvc.perform(post("/api/feedBack/save")
                .accept(MediaType.APPLICATION_JSON)
                .contentType(MediaType.APPLICATION_JSON)
                .param("name","name")
                .param("content","content")
                .param("password","password"))
                .andExpect(status().isOk())
                .andReturn();
    }

    @Test
    public void feedBackRemoveTest() throws Exception{
        mockMvc.perform(get("/api/feedBack/remove")
                .accept(MediaType.APPLICATION_JSON)
                .contentType(MediaType.APPLICATION_JSON)
                .param("id","1"))
                .andExpect(status().isOk())
                .andReturn();
    }

    @Test
    public void feedBackUpdateTest() throws Exception{
        mockMvc.perform(post("/api/feedBack/update")
                .accept(MediaType.APPLICATION_JSON)
                .contentType(MediaType.APPLICATION_JSON)
                .param("id","1")
                .param("password","test")
                .param("content","update"))
                .andExpect(status().isOk())
                .andReturn();
    }
}
