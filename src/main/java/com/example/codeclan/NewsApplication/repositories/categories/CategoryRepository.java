package com.example.codeclan.NewsApplication.repositories.categories;

import com.example.codeclan.NewsApplication.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
