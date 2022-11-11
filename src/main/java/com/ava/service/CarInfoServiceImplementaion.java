package com.ava.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ava.dao.CarInfoRepository;
import com.ava.model.CarInfo;


@Service
public class CarInfoServiceImplementaion implements CarInfoService {
	
	@Autowired
	CarInfoRepository repo;
	
	@Override
	public List<CarInfo> getAllCarInfo(){
		return repo.findAll();
	}
	
	@Override
	public CarInfo insertCarInfo(CarInfo info) {
		// TODO Auto-generated method stub
		return repo.save(info);
	}
	
	@Override
	public List<CarInfo> findAllByBrand(String brand) {
		return repo.findAllByBrand(brand);
	}
	
	@Override
	public List<CarInfo> findAllByModel(String model) {
	   return repo.findAllByModel(model);
	}
	
	@Override 
	public List<CarInfo> findAllByPrice(float price) {
		return repo.findAllByPrice(price);
	}
	
	@Override
	public void removeCarInfoById(int carId) {
		repo.deleteById(carId);
	}
	
	@Override
	public CarInfo updateCarById(CarInfo info,int carId) {
		CarInfo toUpdate = repo.findById(carId).get();
		toUpdate.setBrand(info.getBrand());
		toUpdate.setModel(info.getModel());
		toUpdate.setPrice(info.getPrice());
		toUpdate.setNo_of_years(info.getNo_of_years());
		toUpdate.setColor(info.getColor());
//		toUpdate.setBooked(info.getBooked());
		return repo.save(toUpdate);
	
		}
	

}
