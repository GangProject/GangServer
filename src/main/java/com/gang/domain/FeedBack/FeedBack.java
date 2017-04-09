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
@Table( name = "\"Feedback\"")
@NoArgsConstructor
@AllArgsConstructor
public class FeedBack extends Created{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column( name = "Feedback_id")
    private Long id;

    @Column( name ="content")
    private String content;

    @Column( name= "name")
    private String name;

    @Column( name="password")
    private String password;

    public static FeedBack of(FeedBackDto feedBackDto){
        return FeedBack.builder()
                .content(feedBackDto.getContent())
                .name(feedBackDto.getName())
                .password(feedBackDto.getPassword())
                .build();
    }

    public static FeedBack of(String content, String name, String password){
        return FeedBack.builder()
                .content(content)
                .name(name)
                .password(password)
                .build();
    }
}
