package com.gang.domain.FeedBack;

import java.util.List;

/**
 * Created by iljun on 2017-04-07.
 */
public interface FeedBackRepositoryCustom {
    List<FeedBack> findList(int currentPage);

    int totalCount();
}
