package com.qa.daigorsecondproject.data.entity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Staff {
	
	private int id;
	
	@NotNull
	@NotBlank
	@Size(min = 4, max = 24, message = "Field name must contain 4 to 24 characters")
	private String name;
	
	private String jobTitle;

}