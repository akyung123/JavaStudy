package report;

import day8.kitchen.Ramen;
import jdk.javadoc.doclet.Reporter;

public class Student {
    String name;
    int id;
    int age;
    String gender;
    String birthday;
    String address;
    String email;
    report Report;

    public Student()
    {
        System.out.println("새로운 학생을 생성하겠습니다. ");
        System.out.print("이름 : ");
    }
    public Student(String name, int id) {};
    public Student(int id, String name, int age, String gender, String birthday, String address, String email) {
        this.id = id;
        this.age = age;
        this.gender = gender;
        this.birthday = birthday;
        this.address = address;
        this.email = email;
        this.Report = new report();
    }
    public report getReport() { return Report; }
    public String getName() { return name; }
}
