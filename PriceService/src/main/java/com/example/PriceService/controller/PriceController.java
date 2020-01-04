
package com.example.CarSearchService.controller;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.CarSearchService.model.Car;
import com.example.CarSearchService.service.CarSearchService;
@RefreshScope
@RestController
public class CarSearchController {
	@Autowired
	CarSearchService carSearchService;
	@RequestMapping("/car/find/{id}")
	public Car findById(@PathVariable Long id) {
		return carSearchService.findById(id);
	}
	@RequestMapping("/car/findall")
	public Collection < Car > findAll() {
		return carSearchService.findAll();
	}
}