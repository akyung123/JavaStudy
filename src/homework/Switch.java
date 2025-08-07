package homework;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = -1;
        while (number != 0)
        {
            System.out.println("=== 다기능 계산기 ====");
            System.out.printf("1. 별찍기%n2. bmi 게산기%n3. 사칙연산계산기%n4. 구구단 계산기%n5. 누산값 계산기%n0. 종류%n");
            System.out.print("메뉴 선택: ");
            number = s.nextInt();
            s.nextLine();
            switch (number) {
                case 1 -> homework.Star.main(new String[]{});
                case 2 -> homework.BML.main(new String[]{});
                case 3 -> homework.Math.main(new String[]{});
                case 4 -> homework.Math2.main(new String[]{});
                case 5 -> homework.Loop.main(new String[]{});
                default -> {
                    if (number != 0)
                        System.out.println("잘못된 입력입니다. 메뉴를 다시 선택해주세요.");
                }
            }
        }
        System.out.println("계산기가 종료되었습니다. ");
    }
}
