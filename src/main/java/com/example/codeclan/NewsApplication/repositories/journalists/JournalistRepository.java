package com.example.codeclan.NewsApplication.repositories.journalists;

import com.example.codeclan.NewsApplication.models.Journalist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JournalistRepository extends JpaRepository<Journalist, Long> {
}
