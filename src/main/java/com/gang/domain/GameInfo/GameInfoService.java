package com.gang.domain.GameInfo;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Service;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by iljun on 2017-06-01.
 */
@Service
public class GameInfoService {

    public List<GameInfo> todayGame() throws IOException{
        String url = "http://m.sports.naver.com/esports/index.nhn";
        Document doc = Jsoup.connect(url).get();
        Elements els = doc.select("#_match_box_cms_tmp").select("ul.game_list").select("a");
        String regx = "lol";
        Pattern pattern = Pattern.compile(regx);
        List<GameInfo> list = new ArrayList<GameInfo>();

        for(Element el : els){
            Matcher matcher = pattern.matcher(el.attr("href"));
            if(matcher.find()){
                String leftTeam = el.select("span>b").get(0).text();
                String rightTeam = el.select("span>b").get(1).text();
                String status = el.select("strong>span").text();
                String time = el.select("strong>i").text();
                list.add(GameInfo.of(leftTeam,rightTeam,status,time));
            }
        }
        return list;
    }
}
