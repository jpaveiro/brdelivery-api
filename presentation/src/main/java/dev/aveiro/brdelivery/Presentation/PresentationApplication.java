package dev.aveiro.brdelivery.Presentation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "dev.aveiro.brdelivery")
@EntityScan(basePackages = "dev.aveiro.brdelivery.infrastructure.tables")
@EnableJpaRepositories(basePackages = "dev.aveiro.brdelivery.infrastructure.repositories.jpa")
public class PresentationApplication {

	public static void main(String[] args) {
		SpringApplication.run(PresentationApplication.class, args);
	}

}
