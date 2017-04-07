package com.gang.domain.FeedBack;

import org.springframework.data.jpa.repository.support.QueryDslRepositorySupport;

import java.util.List;

/**
 * Created by iljun on 2017-04-07.
 */
public class FeedBackRepositoryImpl extends QueryDslRepositorySupport implements FeedBackRepositoryCustom{
    private QFeedBack qFeedBack = QFeedBack.feedBack;

    public FeedBackRepositoryImpl(){
        super(FeedBack.class);
    }

    @Override
    public List<FeedBack> findList(int currentPage){
        return from(qFeedBack)
                .offset((currentPage-1)*10)
                .limit(currentPage * 10)
                .fetch();
    }

    @Override
    public int totalCount(){
        return (int)from(qFeedBack)
                .fetchCount();
    }
}
