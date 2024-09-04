package bai2.service.student;


import bai2.Student;
import bai2.repository.student.IStudentRepository;
import bai2.repository.student.StudentRepository;

import java.util.Collections;
import java.util.List;

public class StudentService implements IStudentService {
    private IStudentRepository istudentrepository = new StudentRepository();


    @Override
    public List<Student> findAll() {
        return istudentrepository.FindAll();
    }

    @Override
    public void addStudent(Student student) {
         istudentrepository.addStudent(student);
    }


    @Override
    public Student findStudentById(String code) {
        return istudentrepository.findStudentById(code);
    }

    @Override
    public Student deleteStudentById(String code) {
        return istudentrepository.deleteStudentById(code);
    }

    @Override
    public Student updateStudent(String code,Student student) {
        return istudentrepository.updateStudentById(code,student);
    }

}
