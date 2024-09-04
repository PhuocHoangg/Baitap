package bai2;

import java.time.LocalDate;

public class Teacher extends Person {
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public Teacher(String code, String name, LocalDate localdate, String classes, double salary) {
        super(code, name, localdate, classes);
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Teacher{" +  super.toString() +
                "salary=" + salary +
                '}';
    }
}
