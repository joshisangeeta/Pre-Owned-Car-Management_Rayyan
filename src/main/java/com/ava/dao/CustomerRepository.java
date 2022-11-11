package com.ava.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ava.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {


//	@Query("Select c from Customer c where c.car.brand like :brand%")
//	List<Customer> getAllByBrand(@Param("brand") String brand);
	

}
