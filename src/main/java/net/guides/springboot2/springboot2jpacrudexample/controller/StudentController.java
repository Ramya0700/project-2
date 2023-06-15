package net.guides.springboot2.springboot2jpacrudexample.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import net.guides.springboot2.springboot2jpacrudexample.model.Student;
import net.guides.springboot2.springboot2jpacrudexample.service.StudentServiceImpl;

//@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class StudentController {
	
	@Autowired
    private StudentServiceImpl studentService;

    @GetMapping("/get/people")
    public List<Student> getAllStudent(){
        return (List<Student>) studentService.getAllStudent();
    }

    @GetMapping("/people/{id}")
    public Student getStudentById(@PathVariable Integer id){
        return studentService.findStudentById(id);
    }

    @PostMapping("/people")
    public Student createStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }

    @DeleteMapping("/del/people/{id}")
	public String deleteStudentById(@PathVariable(value = "id") Integer id)  {
    	Student student = studentService.findStudentById(id);
    	studentService.deleteStudent(student);
		return "Employee Deleted Successfully";
	}
	
}
