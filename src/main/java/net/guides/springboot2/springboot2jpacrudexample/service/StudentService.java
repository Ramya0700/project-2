package net.guides.springboot2.springboot2jpacrudexample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import net.guides.springboot2.springboot2jpacrudexample.model.Student;


@Service
public interface StudentService {

	public List<Student> getAllStudent();
    public Student findStudentById(Integer id);
    public Student deleteStudent(Student id);
    public Student createStudent(Student student);
}
