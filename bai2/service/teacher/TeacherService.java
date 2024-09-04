package bai2.service.teacher;

import bai2.Teacher;
import bai2.repository.student.IStudentRepository;
import bai2.repository.teacher.ITeacherRepository;
import bai2.repository.teacher.TeacherRepository;

import java.util.Collections;
import java.util.List;

public class TeacherService implements ITeacherService {
    private ITeacherRepository iTeacherRepository =new TeacherRepository();

    @Override
    public List<Teacher> findAll() {
        return iTeacherRepository.findAll();
    }

    @Override
    public void addTeacher(Teacher teacher) {
        iTeacherRepository.addTeacher(teacher);

    }

    @Override
    public Teacher findTeacherById(String code) {
        return iTeacherRepository.findTeacherById(code);
    }

    @Override
    public void deleteTeacherById(Teacher teacher) {
        iTeacherRepository.deleteTeacherById(teacher);
    }

    @Override
    public Teacher updateTeacherById(String code, Teacher teacher) {
        return iTeacherRepository.updateTeacherById(code, teacher);
    }
}
