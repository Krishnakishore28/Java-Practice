package com.example.car.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.car.entity.Car;
import com.example.car.entity.ModelIntTrans;
import com.example.car.entity.ModelTrans;
import com.example.car.service.BrandService;

@Controller
public class HomeController {
	@Autowired
	private BrandService service;
	
	@GetMapping("/home")
	public String home() {
		return "home";
	}
	@GetMapping("/brandhome")
	public String brand() {
		return "brandhome";
	}
	@GetMapping("price")
	public String price() {
		return "price";
	}
	@PostMapping("/brandlist")
	public String brandlist(Model model,ModelTrans brand) {
		//System.out.println(brand);
		model.addAttribute("cars", service.byBrand(brand.getName()));
		//System.out.println(service.byBrand(brand.getName()));
		return "brandlist";
	}
	@PostMapping("/bookedcar")
	public String carBooked(Model model,ModelIntTrans id) {
		Car car=service.getById(id.getId());
		model.addAttribute("brand", car.getBrand());
		model.addAttribute("model", car.getModel());
		return "carbooked";
	}
	@PostMapping("pricesort")
	public String priceSort(Model model,ModelIntTrans id) {
		List<Car> cars=service.byPrice(id.getId());
		model.addAttribute("cars", cars);
		return "brandlist";
	}
}
