package day4.ifexample;
import java.util.Scanner;

public class ifPractice02 {
    public static void main(String[] args) {
        // 생년과 올해를 입력받으세요
        // 태어난 해가 잘못된 값일 경우 "태어난 해는 올해보다 이전이어야합니다"
        // 올바른 값일 경우 몇 살 출력
        // 태어난 해와 올해가 홀수인지 짝수인지
        // "태어난 해가 3의 배수이고 올해는 5의 배수가 아니다"를 출력하는 조건문을 만드시오.

        Scanner scanner = new Scanner(System.in);
        int birthYear, thisYear;
        System.out.print("태어난 해 : ");
        birthYear = scanner.nextInt();
        scanner.nextLine();
        System.out.print("올해 : ");
        thisYear = scanner.nextInt();
        scanner.nextLine();
        // 1)
        if (birthYear <= thisYear) {
            System.out.println("나이 : " + (thisYear - birthYear));
            // 2)
            if (birthYear % 2 == 0)
                System.out.print("태어난 해는 짝수이고 ");
            else
                System.out.print("태어난 해는 홀수이고 ");
            if (thisYear % 2 == 0)
                System.out.println("올해는 짝수이다. ");
            else
                System.out.println("올해는 홀수이다. ");
            // 3)
            if (birthYear % 3 == 0)
                System.out.print("태어난 해는 3의 배수이고 ");
            else
                System.out.print("태어난 해는 3의 배수가 아니고 ");
            if (thisYear % 5 == 0)
                System.out.println("올해는 5의 배수이다. ");
            else
                System.out.println("올해는 5의 배수가 아니다. ");
        }
        else
            System.out.println("태어난 해는 올해보다 이전이어야합니다. ");

        scanner.close();

    }
}
