package com.jackson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


@SpringBootApplication
public class Main {

    public static void main(String[] args) {

//        SpringApplication.run(Main.class,args);


        List<Integer> l = new ArrayList<>();
        l.addAll(0, Arrays.asList(3,2,4,1,45));
        l.forEach(System.out::println);

    }

    private static void print() {

        System.out.println("lol");

    }

    /*@Bean
    CommandLineRunner initDatabase(UserRepository repository) {

        User s1 = new User("testUserOne", (short) 20, new Article("text",Color.BLUE,new HashSet<>(

                Arrays.asList(new "testUserOne", (short) 20, new Article("text",Color.BLUE,new HashSet<>)
        )));

        return args -> {
            repository.save(new User("testUserOne", (short) 20, new Article("text for article 1", Color.BLUE, new HashSet<>(


            ))));
        };
    }
    */
}
