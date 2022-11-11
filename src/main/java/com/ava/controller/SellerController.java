package com.ava.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ava.model.Seller;
import com.ava.service.CarInfoService;
import com.ava.service.SellerService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class SellerController {
	
	@Autowired
	SellerService sellerService;
	
	@Autowired
	CarInfoService carInfoService;

	@PostMapping(path="/sellers")
	public Seller insertSeller (@RequestBody Seller seller) {
		return sellerService.insertSeller(seller);
	}
	
	@GetMapping(path="/sellers")
	public List<Seller> getAllSellers(){
		return sellerService.getAllSellers();
	}
	
	@DeleteMapping("/sellers/{sellerId}")
	public void removeSellerById(@PathVariable int sellerId) {
		sellerService.removeSellerById(sellerId);
	}
	
}
