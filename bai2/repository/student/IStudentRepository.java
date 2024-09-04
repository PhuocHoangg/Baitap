package bai2.repository.student;

import bai2.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> FindAll();
    void addStudent(Student student);
    Student findStudentById(String code);
    Student deleteStudentById(String code);
    Student updateStudentById(String code, Student student);
}
