package bai2;

import java.time.LocalDate;

public class Student extends Person {

    public Student(String name, String classes, LocalDate localdate, String code) {
        super(name, classes, localdate, code);
    }

    @Override
    public String toString() {
        return "Student{" + super.toString()+
                '}';
    }
}

