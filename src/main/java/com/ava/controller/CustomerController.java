package com.ava.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ava.model.Customer;
import com.ava.service.CarInfoService;
import com.ava.service.CustomerService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@Autowired
	CarInfoService carinfoservice;
	
	@GetMapping(path="/customers")
	public List<Customer> getAllCustomers(){
		return customerService.getAllCustomers();
	}
	
	@PostMapping(path="/customers/{carId}")
	public Customer insertCustomer (@RequestBody Customer customer,@PathVariable int carId ) {
		
		Customer c = customerService.insertCustomer(customer,carId);
		
		return c;
	}
	
}
