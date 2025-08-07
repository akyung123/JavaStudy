package day2;

import java.sql.SQLOutput;

public class Operator {
    public static void main(String[] args) {
        // 연산자 ??
        // 항 ?? 연산에 사용하는 값

        // 연산자의 종류
        /*
         * 1. 대입 연산자(오른쪽 항에 있는 값을 왼쪽 항에 대입, 따라서 왼쪽에는 변수나 상수가 와야한다)
         * 2. 산술 연산자 : 사칙연산과 나머지 연산(+, -, *, /, %)
         * 3. 증감 연산자 : ++, --
         * 4. 관계 연산자 : ==
         * 5. 논리 연산자 and or
         * 6. 비트 연산자
         * 7. 조건 연산자
         * 8.
         * 9.

         */

        // 산술 연산자
        int mathScore = 50;
        int engScore = 60;

        int totalScore = mathScore + engScore;
        System.out.println("합 : " + totalScore);

        double avgScore1 = totalScore / (float) 2;
        System.out.println("평균 : " + avgScore1);

        System.out.println("5*3=" + (5 * 3));
        System.out.println("5-3=" + (5 - 3));
        System.out.println("5%2=" + (5 % 2));

        // 증감 연산자
        int gameScore = 150;
        int lastScore = ++gameScore;
        System.out.println(lastScore);
        System.out.println(gameScore);
        System.out.println(lastScore++);
        // 출력 후 다시 대입함
        System.out.println(lastScore);
        // 앞에서 ++가 실행되어서 152가 나온다
        System.out.println(++lastScore);
        System.out.println(lastScore--);
        System.out.println(--lastScore);

//        lastScore = 100;
//        for (int i = 0; i < gameScore; i++) {
//            lastScore += i;
//            System.out.println("게임 점수 : "+lastScore);
//        }

        // 관계 연산자ㅏ
        System.out.println(1 > 3);
        System.out.println(1 < 3);
        System.out.println(1 >= 3);
        System.out.println(1 <= 3);
        System.out.println(1 == 3);
        System.out.println(1 != 3);


        System.out.println("-------2025년 07월 23일------");

        //논리 연산산
        // and (논리곱) : 둘 다 참일 때 참

        int num1 = 10;
        int num2 = 20;

        boolean flag = (num1 > 0) && (num2 > 0); // ture
        System.out.println(flag);
        flag = (num1 > 0) && (num2 < 0); // flase
        System.out.println(flag);
        flag = (num1 > 0) || (num2 < 0); //ture
        System.out.println(flag);
        flag = (num1 < 0) || (num2 < 0);    // flase
        System.out.println(flag);
        System.out.println(!flag);
        System.out.println(!flag);  // print는 일시적으로 출력값만 변경함
        System.out.println(flag);

        // 단랅 회로 평가 77p
        int i = 2;
        boolean value = ((num1 = num1 + 10) < 10 ) && ((i = i + 2) < 2);
        System.out.println(value); // flase

        System.out.println("--------------------");

        value = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 2);
        System.out.println(value);

        System.out.println("---삼항 연산자---");
        // 삼항 연산자
        // 조건문 ? 참일대 : 거짓일때
        System.out.println((5>3)? 10 : 20);

        int fatheAge = 45;
        int motherAge = 47;
        String result;
        result = ((fatheAge > motherAge) ? "아버지 나이가 어머니 나이보다 많습니다" : "어머니 나이가 아버지 나이보다 많습니다");
        System.out.println(result);


        // 복합 대입 연산자
        // 연산자 축약이라고 대충 생각하면 됨

    }
}
