package com.example.welfare.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.welfare.entity.general_welfare;
import com.example.welfare.repository.general_welfareRepository;


@Service
public class general_welfareServiceImpl implements general_welfareService{

	@Autowired
	private general_welfareRepository generalRepository;

	@Override
	public List<general_welfare> getgeneral_welfare() {
		return generalRepository.findAll();
	}

	@Override
	public void creategeneral_welfare(general_welfare general) {
		generalRepository.save(general);	
	}

	@Override
	public void updategeneral_welfare(general_welfare general, Integer id) {
		general_welfare existgeneral_welfare =generalRepository.getOne(id);
		
		if(existgeneral_welfare.getId() !=null) {
			general.setId(id);
			generalRepository.save(general);
		}
	}

	@Override
	public void deletegeneral_welfare(Integer id) {
		generalRepository.deleteById(id);
		
		
	}
	

}