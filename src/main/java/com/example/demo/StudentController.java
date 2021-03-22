package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController
{

  @Autowired
  private StudentRepository studentRepository;

  @GetMapping("insert")
  public void insert(){
    Student student = new Student();
    student.setId("Eng2015001");
    student.setName("Saran");
    student.setGender(Student.Gender.MALE);

    studentRepository.save(student);
  }

  @GetMapping("get")
  public Student get(){
    return studentRepository.findById("Eng2015001").get();
  }

  @GetMapping("delete")
  public void delete(){
    studentRepository.deleteById("Eng2015001");
  }
}
