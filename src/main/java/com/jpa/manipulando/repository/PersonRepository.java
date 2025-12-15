package com.jpa.manipulando.repository;

import com.jpa.manipulando.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
