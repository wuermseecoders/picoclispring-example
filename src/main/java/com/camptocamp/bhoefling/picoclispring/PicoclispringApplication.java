package com.camptocamp.bhoefling.picoclispring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PicoclispringApplication {

    private PicoclispringApplication() {

    }

    public static void main(String[] args) {
        System.exit(SpringApplication.exit(SpringApplication.run(PicoclispringApplication.class, args)));
    }
}
