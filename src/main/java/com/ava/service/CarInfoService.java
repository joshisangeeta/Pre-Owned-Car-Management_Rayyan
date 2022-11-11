package com.ava.service;

import java.util.List;

import com.ava.model.CarInfo;

public interface CarInfoService {

	List<CarInfo> getAllCarInfo();

	CarInfo insertCarInfo(CarInfo info);

	List<CarInfo> findAllByBrand(String brand);

	void removeCarInfoById(int id);

	List<CarInfo> findAllByModel(String model);

	List<CarInfo> findAllByPrice(float price);

	CarInfo updateCarById(CarInfo info, int carId);

	

}
