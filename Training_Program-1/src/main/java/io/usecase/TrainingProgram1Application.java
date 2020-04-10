package io.usecase;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.usecase.model.DemoUser;
import io.usecase.repository.DemoUserRepository;

@SpringBootApplication
public class TrainingProgram1Application {
	   @Autowired
	    private DemoUserRepository repository;

	    @PostConstruct
	    public void initUsers() {
	        List<DemoUser> users = Stream.of(
	                new DemoUser(101, "javatechie", "password", "javatechie@gmail.com"),
	                new DemoUser(102, "user1", "pwd1", "user1@gmail.com"),
	                new DemoUser(103, "user2", "pwd2", "user2@gmail.com"),
	                new DemoUser(104, "user3", "pwd3", "user3@gmail.com")
	                
	        ).collect(Collectors.toList());
	        repository.saveAll(users);
	    }

	    public static void main(String[] args) {
	        SpringApplication.run(TrainingProgram1Application.class, args);
	    }

	}
