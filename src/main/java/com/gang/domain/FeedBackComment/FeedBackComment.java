package com.gang.domain.FeedBackComment;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.gang.domain.FeedBack.FeedBack;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Created by iljun on 2017-03-11.
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table( name = "feedbak_comment")
public class FeedBackComment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "feedback_comment_id")
    private Long id;

    @Column(name = "content")
    private String content;

    @JoinColumn(name = "feedback_id")
    @ManyToOne
    private FeedBack feedBack;
}
