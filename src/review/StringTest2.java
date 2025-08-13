package review;


import java.util.Scanner;

import static java.lang.Integer.*;

public class StringTest2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String id;
        String sex = "1234";

        System.out.print("주민등록번호 입력 (99191-1111111 형식): ");
        id = scanner.nextLine();

        int m = Integer.parseInt(id.substring(2, 4));
        int d = Integer.parseInt(id.substring(4, 6));

        if (!id.substring(6, 7).equals("-"))
        {
            id = id.substring(0, 6) + "-" + id.substring(6);
        }
        if (true){
            try{
                Integer.parseInt(id.substring(0, 6));
                Integer.parseInt(id.substring(7));
            }
            catch (NullPointerException e){
                System.out.println("NullPointerException 오류");
            }
            catch (IndexOutOfBoundsException e){
                System.out.println("IndexOutOfBoundsException 오류");
            }
            catch (NumberFormatException e){
                System.out.println("NumberFormatException 오류");
            }
        }
        if (id.length() != 14) {
            System.out.println("잘못 입력하셨습니다.");
            return;
        }
        if (sex.indexOf(id.charAt(6)) != -1) {
            System.out.println("잘못 입력하셨습니다.");
            return;
        }
        if (!(m >= 0 && m <=12) ) {
            System.out.println("잘못 입력하셨습니다.");
            return;
        }
        if (true){

        }

        // 나이 계산
        int age = parseInt(id.substring(0, 2));
        age = 2025 - age;
        if (age <= 0) {
            age = (age * -1) + 25;
        }
        System.out.println(id.substring(0, 2) + "년생" + age + "살 입니다.");

    }
}
