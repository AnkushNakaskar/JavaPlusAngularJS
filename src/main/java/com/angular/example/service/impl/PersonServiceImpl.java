package com.angular.example.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.angular.example.entity.Person;
import com.angular.example.repository.PersonRepository;
import com.angular.example.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonRepository personRepo;

	@Override
	public List<Person> fetchAllPersons() {
		return personRepo.findAll();
	}

	@Override
	public List<Person> fetchAllPersons(String companyName) {
		List<Person> listOfEmplyees =new ArrayList<Person>();
		listOfEmplyees.addAll(personRepo.findByCompanyName(companyName));
		return listOfEmplyees;
	}

}
