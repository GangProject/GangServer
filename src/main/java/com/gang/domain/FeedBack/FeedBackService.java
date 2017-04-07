package com.gang.domain.FeedBack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by iljun on 2017-04-07.
 */
@Service
public class FeedBackService {

    @Autowired
    private FeedBackRepository feedBackRepository;

    public FeedBackListDto findList(int currentPage){
        return FeedBackListDto.of(feedBackRepository.findList(currentPage),currentPage,feedBackRepository.totalCount());
    }

    public void feedBackSave(String name, String password, String content){
        feedBackRepository.save(FeedBack.of(content,name,password));
    }

    @Transactional(readOnly = false)
    public void feedBackRemove(Long id){
        feedBackRepository.delete(feedBackRepository.findOne(id));
    }

    public String feedBackUpdate(Long id, String password, String content) {
        FeedBack feedBack = feedBackRepository.findOne(id);
        if (password.equals(feedBack.getPassword())) {
            feedBack.setContent(content);
            feedBackRepository.save(feedBack);
            return "성공";
        }
        return "비밀번호 불일치";
    }
}