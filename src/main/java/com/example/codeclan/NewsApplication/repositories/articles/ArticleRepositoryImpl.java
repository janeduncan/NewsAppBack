package com.example.codeclan.NewsApplication.repositories.articles;

import com.example.codeclan.NewsApplication.models.Article;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class ArticleRepositoryImpl implements ArticleRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Article> getArticlesByCategory(String category){
        List<Article> results = null;
        Session session = entityManager.unwrap(Session.class);
        try {
            Criteria cr = session.createCriteria(Article.class);
            cr.createAlias("categories", "categories");
            cr.add(Restrictions.eq("categories.name", category).ignoreCase());
            results = cr.list();
        } catch (HibernateException ex){
            ex.printStackTrace();
        } finally {
            session.close();
        }
        return results;
    }

}
