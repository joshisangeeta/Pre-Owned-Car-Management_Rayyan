package com.ava.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ava.model.CarInfo;
import com.ava.service.CarInfoService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class CarInfoController {
	
	@Autowired
	CarInfoService carinfoService;
	
	@GetMapping(path="/cars")
	public List<CarInfo> getAllCarInfo(){
		return carinfoService.getAllCarInfo();
	}
	
	@GetMapping(path="/cars/b/{brand}")
	public List<CarInfo> findAllByBrand(@PathVariable String brand) {
		return carinfoService.findAllByBrand(brand);
	}
	
	@GetMapping(path="/cars/m/{model}")
	public List<CarInfo> findAllByModel(@PathVariable String model) {
		return carinfoService.findAllByModel(model);
	}
	
	@GetMapping(path="/cars/{price}")
	public List<CarInfo> findAllByPrice(@PathVariable float price) {
		return carinfoService.findAllByPrice(price);
	}
	
	@PostMapping(path="/cars")
	public CarInfo insertCarInfo (@RequestBody CarInfo info) {
		return carinfoService.insertCarInfo(info);
	}
	
	@DeleteMapping("/cars/{carId}")
    public void removeCarInfoById(@PathVariable int carId) {
	   carinfoService.removeCarInfoById(carId);
    }
	
	@PutMapping("/cars/{carId}")
	public CarInfo updatCarById (@RequestBody CarInfo info, @PathVariable int carId) {
		return carinfoService.updateCarById(info,carId);
	}
	
	

}
