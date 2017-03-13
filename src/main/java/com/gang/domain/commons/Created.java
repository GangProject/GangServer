package com.gang.domain.commons;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

/**
 * Created by iljun on 2017-03-11.
 */
@Getter
@Setter
@MappedSuperclass
@EntityListeners({ CreatedAuditorAware.class })
public class Created {
    @Column(name="createdAt")
    private LocalDateTime createdAt;

    @Column(name="createdBy")
    private String createdBy;
}
