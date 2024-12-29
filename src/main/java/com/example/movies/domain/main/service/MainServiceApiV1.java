package com.example.movies.domain.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class MainServiceApiV1 {

    private static final String API_KEY = "9a483ed53cfbcbeb024deb547945e664";
    private static final String  BASE_URL = "https://kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json";

    @Autowired
    private RestTemplate restTemplate;

    public String getMovieRanking(String targetDate){
        String apiUrl = BASE_URL+ "?key=" + API_KEY + "&targetDt="+targetDate;

        String response = restTemplate.getForObject(apiUrl, String.class); //RestTemplate을 사용하여 주어진 URL로 GET 요청

        return response;
    }
}
