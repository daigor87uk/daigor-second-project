package com.qa.daigorsecondproject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.daigorsecondproject.service.StaffService;

@RestController
@RequestMapping(path = "/staff")
public class StaffController {	
	
	private StaffService staffService;
	@Autowired
	public StaffController(StaffService staffService) {
		this.staffService = staffService;
	}
	
}