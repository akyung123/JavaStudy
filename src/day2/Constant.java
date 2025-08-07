package day2;

import javax.swing.text.Style;

public class Constant {
    public static void main(String[] args) {
        // 상수
        // 변하지 않는 값을 저장ㅎ아기 위함
        final int MAX_NUM = 100;
        final int MIN_NUM;
        // 값 변경이 불가능함 BUT 초기화를 선언과 동시에 안해도 됨

        System.out.println(MAX_NUM);

        MIN_NUM = 0;
        System.out.println(MIN_NUM);

//        MIN_NUM = -99; // 컴파일 에러 발생
//            -> 초기화 이후 값 변경 불가능

    }
}
