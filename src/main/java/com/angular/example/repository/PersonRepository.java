package com.angular.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.angular.example.entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
	Person findById(Long id);

	List<Person> findByCompanyName(String companyName);
}
