package com.example.welfare.service;

import java.util.List;


import com.example.welfare.entity.individual_welfare;

public interface individual_welfareService {
	
	public List<individual_welfare> getindividual_welfare();

	public void createindividual_welfare(individual_welfare individual);

	public void updateindividual_welfare(individual_welfare individual, Integer id);

	public void deleteindividual_welfare(Integer id);


}
