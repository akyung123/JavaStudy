package day8;

public class StudentTest {
    public static void main(String[] args) {
        Student kim = new Student();
        System.out.println(kim.name);

        kim.name = "김지우";
        kim.math = 90;
        kim.eng = 87;
        kim.kor = 87;
        kim.phone = "010-1234-5678";
        System.out.println(kim.name);
        kim.goSchool();
    }
}
