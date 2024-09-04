package bai2.controller;

import bai2.Student;
import bai2.Teacher;
import bai2.service.student.IStudentService;
import bai2.service.student.StudentService;
import bai2.service.teacher.ITeacherService;
import bai2.service.teacher.TeacherService;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class StudentController {
    private static final Scanner sc = new Scanner(System.in);
    private IStudentService studentService=new StudentService();
    public void displayStudent(){
        List<Student> studentss=studentService.findAll();
        for(Student student:studentss){
            System.out.println(student);
        }
    }
    public void addStudent(){
        System.out.println("Nhap vao ten");
        String name = sc.nextLine();
        System.out.println("Nhap vao lop");
        String classes = sc.nextLine();
        System.out.println("Nhap vao ngay sinh");
        LocalDate birthday = LocalDate.parse(sc.nextLine());
        System.out.println("Nhap vao ma hoc sinh");
        String code = sc.nextLine();
        Student student=new Student(name,classes,birthday,code);
        studentService.addStudent(student);
     }
    public Student deleteStudentById (String code){
        studentService.deleteStudentById(code);
        return null;
    }
    public Student updateStudentById (){
        System.out.println("Nhap vao ten");
        String name2 = sc.nextLine();
        System.out.println("Nhap vao lop");
        String classes2 = sc.nextLine();
        System.out.println("Nhap vao ngay sinh");
        LocalDate birthday2 = LocalDate.parse(sc.nextLine());
        System.out.println("Nhap vao ma hoc sinh");
        String code2 = sc.nextLine();
        Student student=new Student(name2,classes2,birthday2,code2);
        studentService.updateStudent(code2,student);
        return null;
    }
    public Student getStudentById (String code){
        return studentService.findStudentById(code);
    }

}
