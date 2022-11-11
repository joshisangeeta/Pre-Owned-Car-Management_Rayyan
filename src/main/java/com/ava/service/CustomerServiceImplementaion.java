package com.ava.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ava.dao.CarInfoRepository;
import com.ava.dao.CustomerRepository;
import com.ava.model.CarInfo;
import com.ava.model.Customer;

@Service
public class CustomerServiceImplementaion implements CustomerService {
	
	@Autowired
	CustomerRepository customerRepo;
	
	@Autowired
	CarInfoRepository carInfoRepo;
	
	@Override
	public List<Customer> getAllCustomers() {
		return customerRepo.findAll();
	}
	
//	@Override
//	public List<Customer> getAllByBrand(String brand) {
//		// TODO Auto-generated method stub
//		return customerRepo.getAllByBrand(brand);
//	}
	
	@Override
	public Customer insertCustomer(Customer customer,int carId) {
		CarInfo car = carInfoRepo.findById(carId).get();
		car.setBooked("yes");
		carInfoRepo.save(car);
		return customerRepo.save(customer);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
