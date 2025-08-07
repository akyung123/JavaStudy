package day4.ifexample;
import java.util.Scanner;

public class ifPractice03 {
    public static void main(String[] args) {
        // 숙제 (1)
        // 태어난 해가 윤년인지 확인하여 결과를 출력하세요.
        // 4년마다 윤년, 100년마다 평년.
        // 단, 400년마다 무조건 윤년
        // 2001,1900년 -> 평년 | 2004,2000-> 윤년
        Scanner scanner = new Scanner(System.in);
        int thisYear;
        System.out.print("올해 : ");
        thisYear = scanner.nextInt();
        scanner.nextLine();
        if (thisYear >= 0) {
            if (thisYear % 4 == 0 && thisYear % 100 != 0)
                System.out.println("윤년");
            else if (thisYear % 100 == 0)
                System.out.println("평년");
            else
                System.out.println("평년");
        }
        else
            System.out.println("입력 오류");
        scanner.close();

    }
}
