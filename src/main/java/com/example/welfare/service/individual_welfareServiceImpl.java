package com.example.welfare.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.welfare.entity.individual_welfare;
import com.example.welfare.repository.individual_welfareRepository;


@Service
public class individual_welfareServiceImpl implements individual_welfareService {
	
	@Autowired
	private individual_welfareRepository individualRepository;

	@Override
	public List<individual_welfare> getindividual_welfare() {
		return individualRepository.findAll();
	}

	@Override
	public void createindividual_welfare(individual_welfare individual) {
		individualRepository.save(individual);	
	}

	@Override
	public void updateindividual_welfare(individual_welfare individual, Integer id) {
		individual_welfare existindividual_welfare =individualRepository.getOne(id);
		
		if(existindividual_welfare.getId() !=null) {
			individual.setId(id);
			individualRepository.save(individual);
		}
	}

	@Override
	public void deleteindividual_welfare(Integer id) {
		individualRepository.deleteById(id);
		
		
	}
	

}
