package net.guides.springboot2.springboot2jpacrudexample.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import net.guides.springboot2.springboot2jpacrudexample.model.Student;
import net.guides.springboot2.springboot2jpacrudexample.repository.StudentJpaDao;

@Service
@Transactional
public class StudentServiceImpl implements StudentService{

	@Autowired
    private StudentJpaDao studentJpaDao;
	
	@Override
	public List<Student> getAllStudent() {
		return studentJpaDao.findAll();
	}

	@Override
	public Student findStudentById(Integer id) {
		return studentJpaDao.findById(id).get(); 
	}


	@Override
	public Student createStudent(Student student) {
		return studentJpaDao.save(student);
	}

	@Override
	public Student deleteStudent(Student id) {
		studentJpaDao.delete(id);
		 return id;
	}
	
}
