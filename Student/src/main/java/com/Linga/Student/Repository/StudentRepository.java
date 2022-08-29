package com.Linga.Student.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Linga.Student.model.Student;
 
 
@Repository
public interface StudentRepository extends CrudRepository<Student,Integer> {

}
