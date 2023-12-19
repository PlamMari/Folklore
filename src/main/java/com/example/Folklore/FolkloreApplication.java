package com.example.Folklore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FolkloreApplication {

	public static void main(String[] args) {

		SpringApplication.run(FolkloreApplication.class, args);
	}

//	@Bean
//	CommandLineRunner commandLineRunner(FolkloreEntityRepository repository) {
//		return -> args {
//			repository.save(new FolkloreEntity(1L, "title", "country", "some description", "a story", "tags"));
//		};
//	}

}
