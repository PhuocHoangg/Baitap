package bai2.controller;

import bai2.Teacher;
import bai2.service.teacher.ITeacherService;
import bai2.service.teacher.TeacherService;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

    public class TeacherController{
        private final Scanner sc = new Scanner(System.in);
        private ITeacherService teacherService=new TeacherService();
        public void displayTeacher(){
            List<Teacher> teacherss=teacherService.findAll();
            for(Teacher teacher:teacherss){
                System.out.println(teacher);
            }
        }
        public void addTeacher(){
            System.out.println("Nhap vao code");
            String code = sc.nextLine();
            System.out.println("Nhap vao ten");
            String name = sc.nextLine();
            System.out.println("Nhap vao ngay sinh");
            LocalDate birthday = LocalDate.parse(sc.nextLine());
            System.out.println("Nhap vao lop");
            String classes = sc.nextLine();
            System.out.println("Nhap vao luong");
            double grade = sc.nextDouble();
            Teacher teacher=new Teacher(code,name,birthday,classes,grade);
            teacherService.addTeacher(teacher);
        }
        public void deleteTeacherById (){
            System.out.println("Nhap vao code");
            String code = sc.nextLine();
            Teacher teacher = teacherService.findTeacherById(code);
            if(teacher!=null){
                teacherService.deleteTeacherById(teacher);
            } else {
                System.out.println("Khong tim thay code giang vien!");
            }
        }
        public Teacher updateTeacherById (){
            System.out.println("Nhap vao code");
            String code2 = sc.nextLine();
            System.out.println("Nhap vao ten");
            String name = sc.nextLine();
            System.out.println("Nhap vao ngay sinh");
            LocalDate birthday2 = LocalDate.parse(sc.nextLine());
            System.out.println("Nhap vao lop");
            String classes = sc.nextLine();
            System.out.println("Nhap vao luong");
            double grade = sc.nextDouble();
            Teacher teacher=new Teacher(code2,name,birthday2,classes,grade);
            teacherService.updateTeacherById(code2,teacher);
            return null;
        }
        public Teacher getTeacherById (String code){
            return teacherService.findTeacherById(code);
        }
    }

