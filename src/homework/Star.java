package homework;

import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        System.out.println("별 찍기 : 피라미드");
        // 삼각형 모양으로  내려감
        /*
            *
           ***
          *****
         */
        int num = 7;
        Scanner s = new Scanner(System.in);
        System.out.print("숫자를 입력해주세요 : ");
        num = s.nextInt();
        s.nextLine();
        for (int k = 0; k < num; k++)
        {
            for(int i = 0; i < num-k-1; i++)
                System.out.print(" ");
            for(int j = 0; j<k*2+1; j++)
                System.out.print("*");
            System.out.println();
        }

        //마름모
        for (int k = 0; k <= num; k++)
        {
            for(int i = 0; i < num-k+1; i++)
                System.out.print(" ");
            for(int j = 0; j<k*2+1; j++)
                System.out.print("*");
            System.out.println();
        }
        for (int k = 0; k < num*2+3; k++)
            System.out.print("*");
        System.out.println();
        for (int k = num; k >= 0; k--)
        {
            for(int i = 0; i < num-k+1; i++)
                System.out.print(" ");
            for(int j = 0; j<k*2+1; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
