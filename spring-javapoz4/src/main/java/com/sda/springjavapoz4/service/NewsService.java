package com.sda.springjavapoz4.service;

import com.sda.springjavapoz4.model.News;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class NewsService {

    private List<News> allNews;

    @PostConstruct
    public void init() {
        this.allNews = new ArrayList<>();
        News news = new News();
        news.setTitle("Lorem Ipsum");
        news.setDescription("Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ab ad animi, architecto, atque consequatur, debitis explicabo impedit maiores officia quae qui suscipit vel voluptas");
        news.setAuthor(UserService.getExampleUser());
        news.setDate(LocalDate.now());
        this.allNews.add(news);
        this.allNews.add(news);
        this.allNews.add(news);
        this.allNews.add(news);
        this.allNews.add(news);
        this.allNews.add(news);
    }

    public List<News> getAllNews(){
        return allNews;
    }

    public News getNews(int id) {
        return allNews.get(id);

    }
}
