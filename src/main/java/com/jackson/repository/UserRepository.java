package com.jackson.repository;

import com.jackson.entity.User;
import com.jackson.model.Color;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    List<User> findByAgeIsGreaterThan(Short age);
    List<User> findUsersByArticleColor(Color color);

    List<User> findUsersByArticleColor(String s);

}
