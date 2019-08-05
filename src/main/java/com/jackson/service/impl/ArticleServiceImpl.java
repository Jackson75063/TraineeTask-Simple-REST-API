package com.jackson.service.impl;

import com.jackson.entity.Article;
import com.jackson.repository.ArticleRepository;
import com.jackson.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    ArticleRepository articleRepository;

    @Override
    public void addArticle(Article article) {
        articleRepository.save(article);
    }

    @Override
    public void delArticle(Long id) {
        articleRepository.deleteById(id);
    }

    @Override
    public Article getOneById(Long id) {

        return articleRepository.getOne(id);
    }

    @Override
    public List<Article> getAll() {
        return articleRepository.findAll();
    }
}
