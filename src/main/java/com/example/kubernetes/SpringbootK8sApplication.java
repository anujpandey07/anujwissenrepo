package com.example.kubernetes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootK8sApplication {

	@GetMapping(value = "/name")
	public String getMessage() {

		return "My name is Anuj";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootK8sApplication.class, args);
	}

}
