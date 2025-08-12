package report;

import java.util.Scanner;

public class StundentReportMain {
    public static void main(String[] args) {
        printMenu();

    }
    public static void printMenu()
    {
        System.out.println("학생정보관리");
        System.out.println("1. 학생정보입력 C");
        System.out.println("2. 학생정보읽기(1명) R");
        System.out.println("3. 전체 학생 출력) R");
        System.out.println("4. 학생정보수정 U");
        System.out.println("5. 학생정보삭제 D");
        choiceMenu();

    }
    public static void choiceMenu()
    {
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        handlerChoice(choice);
    }
    public static void handlerChoice(String choice)
    {
        switch (choice) {
            case "C" :
                createStundent();
                break;
            case "R" :
                readStudent();
                break;
            case "U" :
                break;
            case  "D" :
                break;
            default:
            {
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요. ");
                choiceMenu();
            }
        }
    }
    public static void createStundent() { Student newStudent = new Student(); }
    public static void readStudent() {}
}
