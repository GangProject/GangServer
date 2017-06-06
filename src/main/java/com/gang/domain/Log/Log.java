package com.gang.domain.Log;

import com.gang.domain.commons.Created;
import lombok.*;

import javax.persistence.*;

/**
 * Created by iljun on 2017-06-06.
 */
@Table(name = "Log")
@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Log extends Created{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Log_id")
    private Long id;

    @Column(name = "ip")
    private String ip;

    @Column(name= "url")
    private String url;

    @Column(name = "body")
    private String body;

    public static Log of(LogDto logDto){
        return Log.builder()
                .ip(logDto.getIp())
                .url(logDto.getUrl())
                .body(logDto.getBody())
                .build();
    }

    public static Log of(String ip, String url, String body){
        return Log.builder()
                .ip(ip)
                .url(url)
                .body(body)
                .build();
    }
}
