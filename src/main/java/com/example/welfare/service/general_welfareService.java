package com.example.welfare.service;

import java.util.List;

import com.example.welfare.entity.general_welfare;



public interface general_welfareService {
	
	public List<general_welfare> getgeneral_welfare();

	public void creategeneral_welfare(general_welfare general);

	public void updategeneral_welfare(general_welfare general, Integer id);

	public void deletegeneral_welfare(Integer id);

}
