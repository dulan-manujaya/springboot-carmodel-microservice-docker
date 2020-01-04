
package com.example.PriceService.controller;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.PriceService.model.Price;
import com.example.PriceService.service.PriceService;
@RefreshScope
@RestController
public class PriceController {
	@Autowired
	PriceService priceService;
	@RequestMapping("/price/find/{id}")
	public Price findById(@PathVariable Long id) {
		return priceService.findById(id);
	}
	@RequestMapping("/price/findall")
	public Collection < Price > findAll() {
		return priceService.findAll();
	}
}