package com.gang.domain.FeedBack;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.gang.domain.commons.Created;
import lombok.*;

import javax.persistence.*;

/**
 * Created by iljun on 2017-03-11.
 */
@Getter
@Setter
@Builder
@Entity
@Table( name = "feedBack")
@NoArgsConstructor
@AllArgsConstructor
public class FeedBack extends Created{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column( name = "Feedback_id")
    private Long id;

    @Column( name ="content")
    private String content;
}
