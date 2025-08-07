package day3;
import java.util.Scanner;

public class Practice03 {
    public static void main(String[] args) {
        // 금액을 입력받아 최소 화폐 개수를 구한다.
        /*
         * 금액 : 67340
         * 5만원 : 1
         * 1만원 : 1
         * 5000원 : 1
         * 1000원 ; 2
         * 500월 : 0
         * 100월 : 3
         * 50원 : 0
         * 10원 : 4
         * 67340원은 총 12개 필요
         */
        Scanner input = new Scanner(System.in);
        System.out.print("금액 : ");
        int money = input.nextInt();
        int m = money;
        int won = 50000;
        int n = 0; // 개수
        input.nextLine();
        while(m > 0 && won >= 10)
        {
            System.out.printf("%d원 : %d%n", won, m/won);
            n += (m/won);
            m %= won;
            won /= 5;
            if (won <10)
                break;
            System.out.printf("%d원 : %d%n", won, m/won);
            n += (m/won);
            m %= won;
            won /= 2;
        }
        System.out.printf("while : %d은 총 %d개 필요%n", money, n);
        // won = 50000원
        m = money;
        won = 50000;
        n = 0;
        System.out.printf("%d원 : %d%n", won, m/won);
        n += (m/won);
        m %= won;
        won /= 5; // won = 10000원
//        System.out.println("잔돈 : "+m);
        System.out.printf("%d원 : %d%n", won, m/won);
        n += (m/won);
        m %= won;
        won /= 2; // won = 5000원
        System.out.printf("%d원 : %d%n", won, m/won);
        n += (m/won);
        m %= won;
        won /= 5; // won = 1000원
        System.out.printf("%d원 : %d%n", won, m/won);
        n += (m/won);
        m %= won;
        won /= 2; // won = 500원
        System.out.printf("%d원 : %d%n", won, m/won);
        n += (m/won);
        m %= won;
        won /= 5; // won = 100원
        System.out.printf("%d원 : %d%n", won, m/won);
        n += (m/won);
        m %= won;
        won /= 2; // won = 50원
        System.out.printf("%d원 : %d%n", won, m/won);
        n += (m/won);
        m %= won;
        won /= 5; // won = 10원
        System.out.printf("%d원 : %d%n", won, m/won);
        n += (m/won);
        System.out.printf("%d은 총 %d개 필요", money, n);
    }
}
