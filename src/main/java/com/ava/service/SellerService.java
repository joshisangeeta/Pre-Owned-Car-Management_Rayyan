package com.ava.service;

import java.util.List;

import com.ava.model.Seller;

public interface SellerService {

	Seller insertSeller(Seller seller);

	List<Seller> getAllSellers();

	void removeSellerById(int sellerId);



}
