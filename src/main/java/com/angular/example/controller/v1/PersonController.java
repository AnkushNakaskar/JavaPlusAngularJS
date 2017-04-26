package com.angular.example.controller.v1;

import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.angular.example.bean.v1.PersonResponse;
import com.angular.example.entity.Person;
import com.angular.example.service.PersonService;
import com.angular.example.service.impl.PersonServiceImpl;

@RestController
@RequestMapping("/persons")
public class PersonController {

	@Autowired
	public PersonServiceImpl personService;

	@RequestMapping("/{companyName}/company/employees")
	public ResponseEntity<PersonResponse> fetchListOfEmployees(@PathVariable String companyName) {
		PersonResponse<List<Person>> response = new PersonResponse<>();
		List<Person> listOfEmployees = personService.fetchAllPersons(companyName);
		response.setEntity(listOfEmployees);
		if(CollectionUtils.isEmpty(listOfEmployees)){
			return new ResponseEntity<PersonResponse>(response, HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<PersonResponse>(response, HttpStatus.OK);
	}

	@RequestMapping("/employees")
	public ResponseEntity<PersonResponse> fetchListOfEmployees() {
		PersonResponse<List<Person>> response = new PersonResponse<>();
		List<Person> listOfEmployees = personService.fetchAllPersons();
		response.setEntity(listOfEmployees);
		if(CollectionUtils.isEmpty(listOfEmployees)){
			return new ResponseEntity<PersonResponse>(response, HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<PersonResponse>(response, HttpStatus.OK);
	}

}
