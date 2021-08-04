package com.expenses.expensemanager;

import com.expenses.expensemanager.document.Category;
import com.expenses.expensemanager.repo.CategoryRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;

@SpringBootApplication
@Slf4j
public class ExpenseManagerApplication implements CommandLineRunner {

	@Autowired
	public CategoryRepo categoryRepo;

	public static void main(String[] args)  {
		SpringApplication.run(ExpenseManagerApplication.class, args);

	}


	@Override
	public void run(String... args) throws Exception {
		log.info("Inside run");
		Category cat = new Category("","Food", "Eating stuff", LocalDateTime.now(), LocalDateTime.now());
		Mono<Category> catMono = categoryRepo.save(cat);
		catMono.subscribe();

		Flux<Category> catFlux  = categoryRepo.findAll();
		catFlux.
				subscribe(s -> System.out.println(s));

	}
}
