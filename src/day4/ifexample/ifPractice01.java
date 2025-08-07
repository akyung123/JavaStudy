package day4.ifexample;
import java.util.Scanner;

public class ifPractice01 {
    public static void main(String[] args) {
        // 시험점수를 정수로 입력합습니다 (0~100점)
        /*
         * 합격입니다/불합격입니다(80점 기준)
         * 90점 이상 A
         * 80점 이상 B
         * 70점 이상 C
         * 60점 이상 D
         * 60점 미만 F
         *
         * 범위를 벗어나는 입력치는 "입력오류"를 출력하세요
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("성적을 입력하시오 : ");
        int score = scanner.nextInt();
        scanner.nextLine();

        if (score >= 0 && score <= 100 ){
            if (score >= 80)
                System.out.println("합격입니다");
            else
                System.out.println("불합격입니다");
            if (score >= 90)
                System.out.println("A");
            else if (score >= 80)
                System.out.println("B");
            else if (score >= 70)
                System.out.println("C");
            else if (score >= 60)
                System.out.println("D");
            else
                System.out.println("F");
        }
        else
            System.out.println("입력오류");
    }
}
