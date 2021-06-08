package com.springboot.database.demo.springbootdatabasedemo;

import com.springboot.database.demo.springbootdatabasedemo.entity.Person;
import com.springboot.database.demo.springbootdatabasedemo.jpa.PersonJpaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

//@SpringBootApplication
public class JpaDatabaseDemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonJpaRepository personJpaRepository;

	public static void main(String[] args) {
		SpringApplication.run(JpaDatabaseDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("All users -> {}", personJpaRepository.findById(10001));
		logger.info("All users -> {}", personJpaRepository.findAll());


		/*
		logger.info("inserting user with id 10006 -> {}",
				personJpaRepository.insert(new Person(10005, "Tara Singh", "Agra", new Date())));
		logger.info("updating user with id 1003 -> {}",
				personJpaRepository.update(new Person(10003, "Rahul", "Delhi", new Date())));
		personJpaRepository.deleteById(10004);
		//logger.info("User id 10001 -> {}", personJdbcDao.findById(10001));
		//logger.info("Deleting user id 10001 -> {}", personJdbcDao.deleteById(10002));
		 */

	}
}
