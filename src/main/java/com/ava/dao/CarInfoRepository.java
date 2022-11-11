package com.ava.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ava.model.CarInfo;



@Repository
public interface CarInfoRepository extends JpaRepository<CarInfo, Integer>{
	
	//@Query(value = "SELECT DISTINCT p.* from carinfo p inner join customer c on p.id=c.id_carinfo where u.brand = ?1", nativeQuery = true)
	List<CarInfo> findAllByBrand(String brand);
	List<CarInfo> findAllByModel(String model);
	List<CarInfo> findAllByPrice(float price);

}
