package com.example.codeclan.NewsApplication.controllers;
import com.example.codeclan.NewsApplication.models.Journalist;
import com.example.codeclan.NewsApplication.repositories.journalists.JournalistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/journalists")
public class JournalistController {

    @Autowired
    JournalistRepository journalistRepository;

    @GetMapping
    public List<Journalist> getAllArticles(){
        return journalistRepository.findAll();
    }

}
