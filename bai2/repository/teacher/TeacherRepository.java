package bai2.repository.teacher;


import bai2.Teacher;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherRepository implements  ITeacherRepository{
    private static final Scanner sc=new Scanner(System.in);
    private static final List<Teacher> teachers=new ArrayList<Teacher>();
    static{
        teachers.add(new Teacher("2000","Phuoc Hoang", LocalDate.parse("2005-08-15"),"C25",10000));
        teachers.add(new Teacher("1000","Phuoc Hoang", LocalDate.parse("2005-08-15"),"C250",5000));
    }
    @Override
    public List<Teacher> findAll() {
        return teachers;
    }

    @Override
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    @Override
    public Teacher findTeacherById(String code) {
        for (int i = 0; i < teachers.size(); i++) {
            if (teachers.get(i).getStudentcode().equals(code)) return teachers.get(i);
        }
        return null;
    }

    @Override
    public void deleteTeacherById(Teacher teacher) {
        teachers.remove(teacher);
    }

    @Override
    public Teacher updateTeacherById(String code, Teacher teacher) {
        int index = 0;
        for (int i = 0; i < teachers.size(); i++) {
            if (teachers.get(i).getStudentcode().equals(code)) teachers.get(i);
            index = i;
        }
        teachers.set(index,teacher);
        return null;
    }
}

