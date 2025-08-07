package day3;
import java.util.Scanner;

public class practice02 {
    public static void main(String[] args) {
        /*
         * 초 단위의 숫자를 입력받아 시간 분, 초 단위로 환산한다.
         *
         * 초 단위를 입력하세요 : 3606
         * 1시간 0분 6초
         */
        Scanner input = new Scanner(System.in);
        int s;
        System.out.printf("초 단위를 입력하세요 : ");
        s = input.nextInt();
        input.nextLine();

        System.out.printf("%d시간 %d분 %d초", s/3600, (3%3600)/60, s%60);

    }
}
