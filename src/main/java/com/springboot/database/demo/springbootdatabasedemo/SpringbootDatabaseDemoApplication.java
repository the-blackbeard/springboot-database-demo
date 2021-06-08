package com.springboot.database.demo.springbootdatabasedemo;

import com.springboot.database.demo.springbootdatabasedemo.entity.Person;
import com.springboot.database.demo.springbootdatabasedemo.jdbc.PersonJdbcDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

//@SpringBootApplication
public class SpringbootDatabaseDemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonJdbcDao personJdbcDao;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDatabaseDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//logger.info("All users -> {}", personJdbcDao.findAll());
		//logger.info("User id 10001 -> {}", personJdbcDao.findById(10001));
		//logger.info("Deleting user id 10001 -> {}", personJdbcDao.deleteById(10002));
		//logger.info("inserting user with id 10005 -> {}",
		//		personJdbcDao.insert(new Person(10005, "Tara", "Delhi", new Date())));
		//ogger.info("updating user with id 1003 -> {}",
		//		personJdbcDao.updatePerson(new Person(1003, "Rahul", "Delhi", new Date())));

	}
}
