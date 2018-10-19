package com.example.codeclan.NewsApplication.components;
import com.example.codeclan.NewsApplication.models.Article;
import com.example.codeclan.NewsApplication.models.ArticleCategory;
import com.example.codeclan.NewsApplication.models.Journalist;
import com.example.codeclan.NewsApplication.repositories.articles.ArticleRepository;
import com.example.codeclan.NewsApplication.repositories.journalists.JournalistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    ArticleRepository articleRepository;

    @Autowired
    JournalistRepository journalistRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {

        DateFormat df = new SimpleDateFormat("dd-MM-yy");
        String newDate = "25-05-19";
        Date date = null;
        try {
            date = df.parse(newDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Journalist journalist1 = new Journalist("Jane", "Duncan", "Political editor");
        journalistRepository.save(journalist1);

        Journalist journalist2 = new Journalist("Fiona", "Wilson", "Tech editor");
        journalistRepository.save(journalist2);

        Journalist journalist3 = new Journalist("Ricky", "Corrigan", "Sports editor");
        journalistRepository.save(journalist3);

        Journalist journalist4 = new Journalist("Christian", "Geib", "Business editor");
        journalistRepository.save(journalist4);

        Article article1 = new Article(date, ArticleCategory.POLITICS, "Facebook hires Nick Clegg as head of global affairs", journalist1);
        articleRepository.save(article1);

        Article article2 = new Article(date, ArticleCategory.TECHNOLOGY, "Chinese search firm Baidu joins global AI ethics body", journalist2);
        articleRepository.save(article2);

        Article article3 = new Article(date, ArticleCategory.SPORTS, "The 10 most improved players in the Premier League", journalist3);
        articleRepository.save(article3);

        Article article4 = new Article(date, ArticleCategory.BUSINESS, "Scottish Power to invest in solar for first time", journalist4);
        articleRepository.save(article4);

    }
}
