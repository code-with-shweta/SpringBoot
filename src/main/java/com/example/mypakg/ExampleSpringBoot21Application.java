package com.example.mypakg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
public class ExampleSpringBoot21Application {

	@RequestMapping
	public String index() {
		return "good mrng";
	}
	public static void main(String[] args) {
		SpringApplication.run(ExampleSpringBoot21Application.class, args);
	}

}
