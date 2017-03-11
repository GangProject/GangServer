package com.gang.domain.commons;

import javax.persistence.PrePersist;
import java.time.LocalDateTime;

/**
 * Created by iljun on 2017-03-11.
 */
public class CreatedAuditorAware {
    @PrePersist
    public void setCreated(Created created){
        created.setCreateAt(LocalDateTime.now());
        created.setCreateBy(GangConstant.SYSTEM);
    }
}
