package homework;

import java.util.Scanner;

public class Math2 {
    public static void main(String[] args) {
        // 구구단 계산기
        Scanner s = new Scanner(System.in);
        System.out.print("구구단할 값을 입력하세요 : ");
        int num = s.nextInt();
        s.nextLine();
        for (int i = 0; i < 10; i++)
        {
            System.out.println((num+" * "+i+" = "+ num*i));
        }
    }
}
