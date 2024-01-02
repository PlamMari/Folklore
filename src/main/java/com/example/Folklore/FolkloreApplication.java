package com.example.Folklore;

import com.example.Folklore.entities.FolkloreEntity;
import com.example.Folklore.repositories.FolkloreEntityRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FolkloreApplication {

	public static void main(String[] args) {

		SpringApplication.run(FolkloreApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(FolkloreEntityRepository repository) {
		return args -> {
			repository.save(new FolkloreEntity(1L, "title", "country", "some description", "a story", "tags"));
		};
	}

}
