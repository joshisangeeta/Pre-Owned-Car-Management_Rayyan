package com.ava.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ava.dao.CarInfoRepository;
import com.ava.dao.SellerRepository;
import com.ava.model.Seller;

@Service
public class SellerServiceImplementation implements SellerService {
	
	@Autowired
	SellerRepository sellerRepo;
	
	@Autowired
	CarInfoRepository repo;
	
	@Override
	public Seller insertSeller(Seller seller) {
		// TODO Auto-generated method stub
		return sellerRepo.save(seller);
	}
	
	@Override	
	public List<Seller> getAllSellers() {
		return sellerRepo.findAll();
	}
	
	@Override
	public void removeSellerById(int sellerId) {
		sellerRepo.deleteById(sellerId);
	}
	

}
