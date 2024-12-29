package com.example.movies.domain.apimodel.kobis.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class KobisBoxOffice {

    @JsonProperty("boxOfficeResult")
    private BoxOfficeResult boxOfficeResult;

    /**
     * BoxOfficeResult 클래스는 박스오피스 결과 정보를 포함합니다.
     */
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class BoxOfficeResult {

        @JsonProperty("boxofficeType")
        private String boxofficeType;

        @JsonProperty("showRange")
        private String showRange;

        @JsonProperty("dailyBoxOfficeList")
        private List<DailyBoxOffice> dailyBoxOfficeList;

        /**
         * DailyBoxOffice 클래스는 각 영화의 일별 박스오피스 정보를 포함합니다.
         */
        @Getter
        @Setter
        @NoArgsConstructor
        @AllArgsConstructor
        @Builder
        public static class DailyBoxOffice {

            @JsonProperty("rank")
            private int rank;
            @JsonProperty("movieNm")
            private String movieName; // 필드 이름 변경

            private String movieCode;    // 영화 코드 (KOBIS 고유 코드)
            private String salesAmount;  // 매출액
            private String audienceCount; // 관객 수

        }

    }



}
