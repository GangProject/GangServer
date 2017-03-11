package com.gang.domain.commons;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.time.LocalDateTime;

/**
 * Created by iljun on 2017-03-11.
 */
public class ModifiedAuditorAware {
    @PrePersist
    @PreUpdate
    public void setModified(Modified modified) {
        modified.setModifiedAt(LocalDateTime.now());
        modified.setModifiedBy(GangConstant.SYSTEM);
    }
}
