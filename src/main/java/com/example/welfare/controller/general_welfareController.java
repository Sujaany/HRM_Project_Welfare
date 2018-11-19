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

import com.example.welfare.entity.general_welfare;
import com.example.welfare.service.general_welfareService;


@RestController
public class general_welfareController {
	@Autowired
	private general_welfareService generalService;

@GetMapping("/general")
public List<general_welfare> viewgeneral_welfare() {
return generalService.getgeneral_welfare();
}

@PostMapping("/general")
public void creategeneral_welfare(@RequestBody general_welfare general) {
	generalService.creategeneral_welfare(general);
}

@PutMapping("/general/{id}")
public void updategeneral_welfare(@RequestBody general_welfare general, @PathVariable Integer id) {
	generalService.updategeneral_welfare(general, id);

}

@DeleteMapping("/general/{id}")
public void deletegeneral_welfare(@PathVariable Integer id) {
	generalService.deletegeneral_welfare(id);
	
}
}



