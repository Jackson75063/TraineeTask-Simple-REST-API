/*package com.jackson.service;

import com.jackson.entity.Article;
import com.jackson.entity.User;
import com.jackson.model.Color;

import java.util.List;

public interface UserService {


    void addUser(User user);
    void deleteUserById(Long id);

    List<User> getAll();

    User findUserById(Long id);
    //    List<User> getUserAgeGreaterThen(Long age);
    List<Article> getByColor(Color color);


    //delete
    //    List<User> getUniqueNamesWhereArticleGreaterThenThree(Long aLong);


//    List<User> getUniqueNamesWhereArticleGreaterThen(Long aLong);
}*/
package com.jackson.service;

import com.jackson.entity.User;
import com.jackson.model.Color;

import java.util.List;

public interface UserService {


    void addUser(User user);
    void deleteUserById(Long id);
    User findUserById(Long id);


    List<User> getAll();
    List<User> getUserAgeGreaterThen(Short age);
    List<User> findUsersByArticleColor(Color color);
//    List<User> findUsersByNameAndArticleIsGreaterThanEqual(Short count);
}
