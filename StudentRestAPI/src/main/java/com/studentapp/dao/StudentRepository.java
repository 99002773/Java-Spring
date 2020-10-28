package com.studentapp.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.studentapp.exceptions.StudentNotFoundException;
import com.studentapp.model.Student;
@Repository
public interface StudentRepository extends MongoRepository<Student, Integer>{
	//derived queries
	List<Student> findByAddressCity(String city) throws StudentNotFoundException;
	List<Student> findByDepartment(String dept) throws StudentNotFoundException;
	//Jpql
	@Query("{'age':{$lt: ?0}}")
	List<Student> findByAge(int age);
}
