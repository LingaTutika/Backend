package com.Linga.Student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Linga.Student.Service.StudentService;
import com.Linga.Student.model.Student;


@RestController
@CrossOrigin(allowedHeaders="*",origins="*")
public class StudentController {
	 @Autowired
	private StudentService studentService;
	
	@PostMapping("/registerStudent")
	public Student registerStudent(@RequestBody Student student) {
		return studentService.registerStudent(student);		
	}
	@GetMapping("/getStudent")
	public List<Student> getStudent(){
		return studentService.getStudents();
	}
	@DeleteMapping("/deleteStudent")
    public void deleteStudent(@RequestParam Integer Id) {
		studentService.deleteStudent(Id); 
    	
    }
	@PutMapping("/updateStudent")
	public Student updateStudent(@RequestBody Student student) {
		return studentService.updateStudent(student) ;
	}

}
