package com.example.tutorialapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TutorialApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(TutorialApiApplication.class, args);
        System.out.print("Bonjour mon fils delmas");
    }

}
