package com.justicenyaga.SpringJDBC.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.justicenyaga.SpringJDBC.models.Student;
import com.justicenyaga.SpringJDBC.repo.StudentRepo;

@Service
public class StudentService {
  @Autowired
  private StudentRepo repo;

  public void addStudent(Student s) {
    repo.save(s);
  }

  public List<Student> getStudents() {
    return repo.findAll();
  }
}
