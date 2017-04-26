package com.angular.example.service;

import java.util.List;

import com.angular.example.entity.Person;

public interface PersonService {
	public List<Person> fetchAllPersons();

	public List<Person> fetchAllPersons(String companyName);
	
	
}
