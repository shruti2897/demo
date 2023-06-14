package com.serviceimplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Employee;
import com.repository.HomeRepository;
import com.serviceinterface.ServiceI;

@Service
public class HomeserviceImpl implements ServiceI{

	@Autowired
	HomeRepository hr;
	

	public void save(Employee e) {
		
		hr.save(e);
		
	}

}
