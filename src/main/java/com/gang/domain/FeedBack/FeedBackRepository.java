package com.gang.domain.FeedBack;

import com.gang.domain.commons.GangRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by iljun on 2017-04-07.
 */
@Repository
public interface FeedBackRepository extends GangRepository<FeedBack, Long>, FeedBackRepositoryCustom{
}
