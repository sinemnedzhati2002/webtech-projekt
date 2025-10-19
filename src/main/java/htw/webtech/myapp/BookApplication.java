package htw.webtech.myapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class BookApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookApplication.class, args);
	}

    @Bean
    org.springframework.boot.CommandLineRunner seed(BookRepository repository) {
        return args -> {
            if (repository.count() == 0) {
                repository.save(new Book("Clean Code", "Robert C. Martin", "Tech", 5, LocalDate.of(2024, 5, 1)));
                repository.save(new Book("Der Prozess", "Franz Kafka", "Klassiker", 4, null));
            }
        };
    }
}
