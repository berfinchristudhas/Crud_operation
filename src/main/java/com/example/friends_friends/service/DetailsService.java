package com.example.friends_friends.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.friends_friends.model.Details;
import com.example.friends_friends.repository.DetailsRepository;

@Service
public class DetailsService {
	
	@Autowired
	public DetailsService(DetailsRepository detailsRepo) {
		this.detailsRepo = detailsRepo;
	}

	private final DetailsRepository detailsRepo;


	//Display data
	public List<Details> getDetails() {
		return detailsRepo.findAll();
		
	} 
	
	//Insert new data
	public void insertData (Details details){
		detailsRepo.save(details);
	}
	
	//Update data
	public void updateData(Details details) {
		detailsRepo.save(details);
	}
	
	//Delete data
	public void deleteData(Integer id) {
		detailsRepo.deleteById(id);;
}
	}
