package bai2.service.teacher;

import bai2.Teacher;

import java.util.List;

public interface ITeacherService {
    List<Teacher> findAll();
    void addTeacher(Teacher teacher);
    Teacher findTeacherById(String code);
    void deleteTeacherById(Teacher teacher);
    Teacher updateTeacherById(String code, Teacher teacher);
}
