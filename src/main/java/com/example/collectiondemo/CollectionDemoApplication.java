package com.example.collectiondemo;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class CollectionDemoApplication {

	@Autowired
	String one;

	/**
	 * Remove the String type parameter from List, and it works as expected.
	 */
	@Autowired
	List<String> two;

	@Autowired
	@Qualifier("two")
	List<String> goodWithQualifier;

	@Autowired
	String three;

	public static void main(String[] args) {
		SpringApplication.run(CollectionDemoApplication.class, args);
	}

	@PostConstruct
	void init() {
		System.out.println("one = " + one);
		System.out.println("two = " + two);
		System.out.println("goodWithQualifier = " + goodWithQualifier);
		System.out.println("three = " + three);
	}
}
