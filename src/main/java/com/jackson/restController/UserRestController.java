package com.jackson.restController;


import com.jackson.entity.Article;
import com.jackson.entity.User;
import com.jackson.model.Color;
import com.jackson.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/user")
@RestController
public class UserRestController {

    @Autowired
    UserService userService;


    @GetMapping(value = "/allUsers")
    public List<User> getAllUsers(){

        return userService.getAll();
    }


    @GetMapping(value = "/getAge/{age}")
    public List <User> getUserAgeGreaterThan (@PathVariable ("age") Short age){

        return  userService.getUserAgeGreaterThen(age);
    }



    @RequestMapping(value = "/getByColor/{color}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<User>> getUSersByColor(
            @PathVariable("color") Color color) {

        if (color == null ) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

       /* if(!Color.isExist(color.name())) {
            System.out.println("NOT EXIST!");
        }*/

        List<User> users = this.userService.findUsersByArticleColor(color);

        if (users == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(users, HttpStatus.OK);
    }



    @PostMapping("/add")
    public void add(@RequestBody User user) {

        userService.addUser(user);
    }

}
