package com.example.codeclan.NewsApplication.components;
import com.example.codeclan.NewsApplication.models.*;
import com.example.codeclan.NewsApplication.repositories.articles.ArticleRepository;
import com.example.codeclan.NewsApplication.repositories.categories.CategoryRepository;
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

    @Autowired
    CategoryRepository categoryRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {

        DateFormat df1 = new SimpleDateFormat("dd-MM-yyyy HH:mm");
        String newDate1 = "19-10-2018 12:30";
        Date date1 = null;
        try {
            date1 = df1.parse(newDate1);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        DateFormat df2 = new SimpleDateFormat("dd-MM-yyyy HH:mm");
        String newDate2 = "19-10-2018 07:45";
        Date date2 = null;
        try {
            date2 = df2.parse(newDate2);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        DateFormat df3 = new SimpleDateFormat("dd-MM-yyyy HH:mm");
        String newDate3 = "19-10-2018 09:00";
        Date date3 = null;
        try {
            date3 = df3.parse(newDate3);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        DateFormat df4 = new SimpleDateFormat("dd-MM-yyyy HH:mm");
        String newDate4 = "19-10-2018 14:45";
        Date date4 = null;
        try {
            date4 = df4.parse(newDate4);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        DateFormat df5 = new SimpleDateFormat("dd-MM-yyyy HH:mm");
        String newDate5 = "19-10-2018 18:30";
        Date date5 = null;
        try {
            date5 = df5.parse(newDate5);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // JOURNALISTS

        Journalist journalist1 = new Journalist("Jane Duncan", "Political Editor", "Glasgow", "07790556033", "janeduncan@live.co.uk", "/images/staff1.jpg");
        journalistRepository.save(journalist1);

        Journalist journalist2 = new Journalist("Fiona Wilson", "Tech Editor", "Glasgow", "07000000000", "fionasemail@address.com", "/images/staff2.jpg");
        journalistRepository.save(journalist2);

        Journalist journalist3 = new Journalist("Ricky Corrigan", "Sports Editor", "Glasgow", "07000000000", "rickysemail@address.com", "/images/staff3.jpg");
        journalistRepository.save(journalist3);

        Journalist journalist4 = new Journalist("Christian Geib", "Business Editor", "Glasgow", "07000000000", "christiansemail@address.com", "/images/staff4.jpg");
        journalistRepository.save(journalist4);

        // CATEGORIES

        Category politicsCategory = new Category(CategoryType.POLITICS);
        categoryRepository.save(politicsCategory);

        Category businessCategory = new Category(CategoryType.BUSINESS);
        categoryRepository.save(businessCategory);

        Category techCategory = new Category(CategoryType.TECHNOLOGY);
        categoryRepository.save(techCategory);

        Category ukNewsCategory = new Category(CategoryType.UK);
        categoryRepository.save(ukNewsCategory);

        // ARTICLES

        Article article1 = new Article(date1, Region.SCOTLAND, "Phasellus in molestie dolor, posuere pellentesque nisi.", "Article", "/images/image.jpg", journalist1);
        articleRepository.save(article1);
        article1.addCategory(politicsCategory);
        article1.setJournalist(journalist1);
        articleRepository.save(article1);

        Article article2 = new Article(date2, Region.LONDON, "Lorem ipsum dolor sit amet, consectetur adipiscing elit.", "Article", "/images/image.jpg", journalist1);
        articleRepository.save(article2);
        article2.addCategory(ukNewsCategory);
        article2.setJournalist(journalist1);
        articleRepository.save(article2);

        Article article3 = new Article(date3, Region.SOUTHEAST, "Phasellus placerat tellus ut rhoncus consequat.", "Article", "/images/image.jpg", journalist1);
        articleRepository.save(article3);
        article3.addCategory(politicsCategory);
        article3.addCategory(ukNewsCategory);
        article3.setJournalist(journalist1);
        articleRepository.save(article3);

        Article article4 = new Article(date4, Region.WALES, "Integer consectetur tellus sed ipsum hendrerit consectetur. ", "Article", "/images/image.jpg", journalist2);
        articleRepository.save(article4);
        article4.addCategory(techCategory);
        article4.addCategory(businessCategory);
        article4.setJournalist(journalist2);
        articleRepository.save(article4);

        Article article5 = new Article(date5, Region.WESTMIDLANDS, "Ut fermentum nisi et placerat varius. Aliquam et.", "Article", "/images/image.jpg", journalist2);
        articleRepository.save(article5);
        article5.addCategory(techCategory);
        article5.addCategory(ukNewsCategory);
        article5.setJournalist(journalist2);
        articleRepository.save(article5);

    }
}
