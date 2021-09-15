package com.example.friends_friends.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.friends_friends.model.Details;
import com.example.friends_friends.service.DetailsService;

@RestController
public class DetailsController {

	private DetailsService detailsService;

	@Autowired
	public DetailsController(DetailsService detailsService) {
	
		this.detailsService = detailsService;
	}
	
	//Display data
	@GetMapping("/display")
	public List <Details> getDetails(){
		return detailsService.getDetails();
	}
	
	//Insert data
	@PostMapping("/insert")
	public void insertFriend(@RequestBody Details details) {
		detailsService.insertData(details);
	}
	
	//update data
		@PutMapping("/update")
		public void updateFriend(@RequestBody Details details) {
			detailsService.updateData(details);
		}
		
	//Delete data
	@DeleteMapping("/delete/{id}")
	public void deleteData(@PathVariable(name = "id") Integer id) {
		detailsService.deleteData(id);
	}
}
