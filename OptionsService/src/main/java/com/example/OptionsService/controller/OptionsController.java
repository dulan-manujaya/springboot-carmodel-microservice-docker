
package com.example.OptionsService.controller;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.OptionsService.model.Options;
import com.example.OptionsService.service.OptionsService;
@RefreshScope
@RestController
public class OptionsController {
	@Autowired
	OptionsService optionsService;
	@RequestMapping("/options/find/{id}")
	public Options findById(@PathVariable Long id) {
		return optionsService.findById(id);
	}
	@RequestMapping("/options/findall")
	public Collection < Options > findAll() {
		return optionsService.findAll();
	}
}