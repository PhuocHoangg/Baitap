package bai2.service.student;

import bai2.Student;

import java.util.List;

public interface IStudentService {
    List<Student> findAll();
    void addStudent(Student student);
    Student findStudentById(String code);
    Student deleteStudentById(String code);
    Student updateStudent(String code,Student student);


}
