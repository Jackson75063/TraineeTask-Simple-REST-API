package com.jackson.restController;


import com.jackson.entity.Article;
import com.jackson.entity.User;
import com.jackson.model.Color;
import com.jackson.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/art")
@RestController
public class ArticleRestController {

    @Autowired
    ArticleService articleService;

    @GetMapping(value = "/allArticles")
    public List<Article> getAll(){

        return articleService.getAll();
    }

    @PostMapping("/addArticle")
    void addArticle(@RequestBody  Article article){
        this.articleService.addArticle(article);
    }

    @DeleteMapping("/delArt/{id}")
    void delArticle(@PathVariable("id") Long id){

        articleService.delArticle(id);
    }

    @GetMapping("/get/{id}")
    Article getOneById(@PathVariable("id") Long id){
        return articleService.getOneById(id);
    }

}
