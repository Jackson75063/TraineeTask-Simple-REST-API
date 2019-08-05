package com.jackson.service;

import com.jackson.entity.Article;

import java.util.List;

public interface ArticleService {

    void addArticle(Article article);
    void delArticle(Long id);
    Article getOneById(Long id);
    List<Article> getAll();


}
