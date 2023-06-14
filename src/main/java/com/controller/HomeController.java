package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Employee;
import com.serviceinterface.ServiceI;

@RestController
public class HomeController {
	
	@Autowired
	ServiceI hs;
	
	@PostMapping("/save")
	public String savedata(@RequestBody Employee e)
	{
		hs.save(e);
		
		return "saved";
	}

}
