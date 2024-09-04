package bai2.view;

import bai2.Student;
import bai2.controller.StudentController;
import bai2.controller.TeacherController;


import java.time.LocalDate;
import java.util.Scanner;

public class Test {
    private static int choose;
    private static final Scanner sc = new Scanner(System.in);
    private static final StudentController studentController = new StudentController();
    private static final Test test = new Test();
    private static final TeacherController teacherController = new TeacherController();
    public void displayMainMenu(){
        do{
        System.out.println("------QUẢN LÝ------ \n" +
                "1.\tDanh sách học viên.\n" +
                "2.\tDanh sách giảng viên.\n" +
                "3.\tThoát.\n" +
                "---Nhập mục cần chọn: ");
        choose = Integer.parseInt(sc.nextLine());
        switch (choose) {
            case 1:
                test.displayStudentMenu();
                break;
            case 2:
                test.displayTeacherMenu();

                break;
            case 3:
                System.exit(0);
            default:
                System.out.println("Nhập lại mục cần chọn!");
        }
    } while (true);}

    public void displayStudentMenu() {
        int choose;
        do {
            System.out.println("\n" +
                    "------Quản lý sinh viên------\n" +
                    "1.  Hiển thị thông tin sinh viên\n" +
                    "2.  Thêm sinh viên\n" +
                    "3.  Xóa sinh viên\n" +
                    "4.  Cập nhật thông tin sinh viên\n" +
                    "5.  Tìm kiếm viên\n" +
                    "6.  Thoát\n" +
                    "-----");
            System.out.println("Nhập vào mục bất kì");
            choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    studentController.displayStudent();
                    break;
                case 2:
                    studentController.addStudent();
                    break;
                case 3:
                    System.out.println("Nhap vao code");
                    String code = sc.nextLine();
                    studentController.deleteStudentById(code);
                    break;
                case 4:
                    studentController.updateStudentById();
                    break;
                case 5:
                    System.out.println("Nhap vao code");
                    String code2 = sc.nextLine();
                    System.out.println(studentController.getStudentById(code2));
                case 6:
                    return;
            }


        } while (true);
    }
    public void displayTeacherMenu() {
        do {
            System.out.println("------QUẢN LÝ DANH SÁCH GIẢNG VIÊN------\n" +
                    "1.\t Hiển thị danh sách giảng viên.\n" +
                    "2.\t Thêm mới giảng viên.\n" +
                    "3.\t Xóa giảng viên.\n" +
                    "4.\t Chỉnh sửa thông tin giảng viên.\n" +
                    "5.\t Tìm giảng viên theo mã.\n" +
                    "6.\t Thoát.\n" +
                    "---Nhập mục cần chọn: ");
            choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Danh sách giảng viên bao gồm: ");
                    teacherController.displayTeacher();

                    break;
                case 2:
                    teacherController.addTeacher();
                    break;
                case 3:
                    teacherController.deleteTeacherById();
                    break;
                case 4:
                    teacherController.updateTeacherById();
                    break;
                case 5:
                    System.out.println("Nhap vao code");
                    String code2 = sc.nextLine();
                    System.out.println(teacherController.getTeacherById(code2));
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Nhập lại mục cần chọn!");
            }
        } while (true);
    }
    public static void main(String[] args) {
        Test menu=new Test();
        menu.displayMainMenu();
    }


}
