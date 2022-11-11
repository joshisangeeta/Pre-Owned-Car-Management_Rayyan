package com.ava.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ava.model.Seller;

@Repository
public interface SellerRepository extends JpaRepository<Seller, Integer> {

}
