package day5;

import java.util.Scanner;

public class Practic {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        s.nextLine();
        for(int i = 1; i < 10; i++) {
            System.out.println(num +" * "+i+ " = "+num*i);
        }

        System.out.println("-----------------------");
        int i = 0;
        int sum = 0;
        for(;;) {
            sum += i;
            System.out.println(i+"회차 반복");
            System.out.println("합계 : "+sum);
            i++;
            System.out.println("------------");
            if (i >= 10)
                break;
        }
    }
}
