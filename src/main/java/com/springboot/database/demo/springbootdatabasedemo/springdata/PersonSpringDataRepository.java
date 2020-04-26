package com.springboot.database.demo.springbootdatabasedemo.springdata;

import com.springboot.database.demo.springbootdatabasedemo.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonSpringDataRepository extends JpaRepository<Person, Integer> {


}
