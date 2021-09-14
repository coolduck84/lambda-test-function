package com.pc.lambda.model;

import lombok.Data;

@Data
public class JsonRequest {
	
	private String firstName;
	private String lastName;
	private boolean proceedFurther;
	private EmployeeDetails empDetails;
}
