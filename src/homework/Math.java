package homework;
import java.util.Scanner;

public class Math {
    public static void main(String[] args) {
        //계산기
        // (+. -, *, /)를 입력받아서 연산결과 출력
/*        Scanner scanner = new Scanner(System.in);
        int a, b;
        String c;
        System.out.print("숫자: ");
        a = scanner.nextInt();
        scanner.nextLine();
        System.out.print("숫자: ");
        b = scanner.nextInt();
        scanner.nextLine();
        System.out.print("연산 기호를 입력하세요: ");
        c = scanner.next();

        System.out.print("결과 : ");
        switch (c) {
            case "+" -> System.out.println(a + b);
            case "-" -> System.out.println(a - b);
            case "*" -> System.out.println(a * b);
            case "/" -> System.out.printf("%.2f", a / (float) b);
            default -> {
                if (c == "/" && b == 0)
                    System.out.println("0으로 나눌 수 없습니다.");
                else
                    System.out.println("존재하지도 않는 연산자입니다.");
            }
        }
    }*/
        long start = System.nanoTime();
        //3. 사칙연산 계산기 만들기
        Scanner scan = new Scanner(System.in);
        int num1, num2;
        String oper;
        System.out.print("숫자를 입력하세요 : ");
        num1 = scan.nextInt();
        System.out.print("숫자를 입력하세요 : ");
        num2 = scan.nextInt();
        System.out.print("연산자를 입력하세요 : ");
        oper = scan.next();
        switch (oper) {
            case "+" -> System.out.println(num1 + num2);
            case "-" -> System.out.println(num1 - num2);
            case "*" -> System.out.println(num1 * num2);
            case "/" -> {
                if (num2 != 0) {
                    System.out.printf("%.2f", (double) num1 / num2);
                } else {
                    System.out.println("0은 나눌 수 없습니다.");
                }
            }
            default -> System.out.println("올바른 연산자를 입력해주세요.");
        }
        scan.close();
        long end = System.nanoTime();
        System.out.println("걸린 시간(ns): " + (end - start));

        Runtime runtime = Runtime.getRuntime();
        runtime.gc(); // GC를 호출해서 좀 더 정확하게 메모리 측정
        long usedMemory = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("사용 메모리(bytes): " + usedMemory);
    }
}