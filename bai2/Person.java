package bai2;

import java.time.LocalDate;

public class Person {
    private  String name;
    private String classes;
    private LocalDate localdate;
    private  String code;
    public Person(){

    }
    public Person(String name, String classes, LocalDate localdate, String code ) {
        this.name = name;
        this.classes = classes;
        this.localdate = localdate;
        this.code = code;

    }

    public String getName() {
        return name;
    }


    public String getClasses() {
        return classes;
    }



    public LocalDate getLocaldate() {
        return localdate;
    }

    public String getStudentcode() {
        return code;
    }




    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                ", localdate=" + localdate +
                ", studentcode=" + code +
                '}';
    }
}

