package com.gang.repository;

import com.gang.GangApplication;
import com.gang.domain.FeedBack.FeedBack;
import com.gang.domain.FeedBack.FeedBackRepository;
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

import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
/**
 * Created by iljun on 2017-04-07.
 */
@RunWith(SpringRunner.class)
@DataJpaTest
@SpringBootTest(classes=GangApplication.class)
@WebAppConfiguration
@AutoConfigureWebMvc
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class FeedBackRepositoryTest {

    @Autowired
    private FeedBackRepository feedBackRepository;

    private FeedBack feedBack;

    @Before
    public void setUp() throws Exception{
        feedBack = FeedBack.of("content","name","password");
    }

    @Test
    public void saveTest()throws Exception{
        FeedBack created = feedBackRepository.save(feedBack);
        FeedBack findFeedBack = feedBackRepository.findOne(created.getId());

        assertThat(created.getContent(), is(findFeedBack.getContent()));
        assertThat(created.getId(), is(findFeedBack.getId()));
        assertThat(created.getName(), is(findFeedBack.getName()));
        assertThat(created.getPassword(), is(findFeedBack.getPassword()));
    }

    @Test
    public void findListTest() throws Exception{
        List<FeedBack> list = feedBackRepository.findList(1);
        for(int i=0; i<list.size(); i++){
            FeedBack target = feedBackRepository.findOne(list.get(i).getId());
            assertThat(target, is(list.get(i)));
        }
    }
}
