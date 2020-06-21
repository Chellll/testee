package com.example.mazito_game.modelFake;

import java.util.ArrayList;
import java.util.List;

public class NewsGenerator {

    private static String[] description = {
            "В onCreateViewHolder получаем ",
            "wHolder получаем employee из items и передаем его в bind метод холдера, тем самым запуская биндинг, который заполнит View данными из employee.", "StartAndroid публикуются ссылки на новые статьи с сайта startandroid.ru и интересные материалы с хабра, medium.com и т.п",
            "ения проблем производительности и для ваших пожеланий по содержанию курса по этой теме "
    };

    private static String[] date = {
            "November'11",
            "February'23",
            "May'12"
    };

    public static List<News> generateData(){
        List<News> news = new ArrayList<>();

        for(int i = 0; i < 20; i++){
            News news1 = new News();

            news1.setName("Новость " + i);
            news1.setDate(date[i%3]);
            news1.setDescription(description[i%3]);
            if(i % 3 == 0){
                news1.setType(CategoryNews.FRIENDS);
            } else if(i % 3 == 1) {
                news1.setType(CategoryNews.TOURNAMENT);
            } else if(i % 3 == 2) {
                news1.setType(CategoryNews.UPDATE);
            }
            news.add(news1);

        }

        return news;
    }

}
