package com.example.welfare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.welfare.entity.individual_welfare;

import com.example.welfare.service.individual_welfareService;


@RestController
public class individual_welfareController {

	@Autowired
	private individual_welfareService individualService;

@GetMapping("/individual")
public List<individual_welfare> viewindividual_welfare() {
return individualService.getindividual_welfare();
}

@PostMapping("/individual")
public void createindividual_welfare(@RequestBody individual_welfare individual) {
	individualService.createindividual_welfare(individual);
}

@PutMapping("/individual/{id}")
public void updateindividual_welfare(@RequestBody individual_welfare individual, @PathVariable Integer id) {
	individualService.updateindividual_welfare(individual, id);

}

@DeleteMapping("/individual/{id}")
public void deleteindividual_welfare(@PathVariable Integer id) {
	individualService.deleteindividual_welfare(id);
	
}
}




