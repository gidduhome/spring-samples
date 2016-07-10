package com.thinline.mongo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
public class UserConfiguration implements CommandLineRunner {
	@Autowired
	private UserRepository repository;
    public static void main(String[] args) {
        SpringApplication.run(UserConfiguration.class, args);
    }
    
    @Override
	public void run(String... args) throws Exception {

		repository.deleteAll();

		// save a couple of customers
		repository.save(new User("Pranay", "Giddaluri"));
		repository.save(new User("Vanaja", "Giddaluri"));

		// fetch all customers
		System.out.println("Users found with findAll():");
		System.out.println("-------------------------------");
		for (User user : repository.findAll()) {
			System.out.println(user);
		}
		System.out.println();

		// fetch an individual customer
		System.out.println("User found with findByFirstName('Pranay'):");
		System.out.println("--------------------------------");
		System.out.println(repository.findByFirstName("Pranay"));

		System.out.println("Users found with findByLastName('Giddaluri'):");
		System.out.println("--------------------------------");
		for (User user : repository.findByLastName("Giddaluri")) {
			System.out.println(user);
		}
    }
}