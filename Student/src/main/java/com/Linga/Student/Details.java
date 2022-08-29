package com.Linga.Student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Details {
	@GetMapping("/getMessage")
	public String getMessage() {
		return "Student Details";
	}
	

}
