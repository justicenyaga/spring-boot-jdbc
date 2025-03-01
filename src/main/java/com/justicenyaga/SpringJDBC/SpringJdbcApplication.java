package com.justicenyaga.SpringJDBC;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.justicenyaga.SpringJDBC.models.Student;
import com.justicenyaga.SpringJDBC.services.StudentService;

@SpringBootApplication
public class SpringJdbcApplication {
  public static void main(String[] args) {
    ApplicationContext context = SpringApplication.run(SpringJdbcApplication.class, args);

    StudentService service = context.getBean(StudentService.class);

    Student s = context.getBean(Student.class);
    s.setRollno(105);
    s.setName("Kelvin");
    s.setMarks(34);

    // service.addStudent(s);

    List<Student> students = service.getStudents();
    System.out.println(students);
  }
}
