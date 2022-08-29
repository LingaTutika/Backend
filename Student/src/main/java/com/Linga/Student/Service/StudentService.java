package com.Linga.Student.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.Linga.Student.Repository.StudentRepository;
import com.Linga.Student.model.Student;

@Service
public class StudentService {
	@Autowired
	private StudentRepository studentrepository;
	public Student registerStudent(Student student) {
		return studentrepository.save(student);
		
	}
	public List<Student> getStudents(){
		return (List<Student>) studentrepository.findAll();
	}
    public void deleteStudent(Integer Id) {
    	studentrepository.deleteById(Id);
    	
    }
    public Student updateStudent(Student student) {
    	Integer StudentId = student.getStudentId();
    	Student std = studentrepository.findById(StudentId).get();
    	std.setName(student.getName());
    	std.setEmail(student.getEmail());
    	std.setPhoneNumber(student.getPhoneNumber());
    	
    	
    	return studentrepository.save(std);
    }

}
