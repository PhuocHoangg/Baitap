package bai2.repository.student;

import bai2.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentRepository implements IStudentRepository {
    private static final Scanner sc = new Scanner(System.in);
    private static final List<Student> students = new ArrayList<Student>();

    static {
        students.add(new Student("Phuoc Hoang", "123", LocalDate.parse("2005-08-15"), "123123"));
        students.add(new Student("Phuoc Hoang", "123", LocalDate.parse("2005-08-15"), "123123"));
    }

    @Override
    public List<Student> FindAll() {
        return students;
    }

    @Override
    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public Student findStudentById(String code) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentcode().equals(code)) return students.get(i);
        }
        return null;
    }

    @Override
    public Student deleteStudentById(String code) {
        students.remove(findStudentById(code));
        return null;
    }

    @Override
    public Student updateStudentById(String code, Student student) {
        int index = 0;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentcode().equals(code)) students.get(i);
            index = i;
        }
            students.set(index,student);
        return null;
    }
}

