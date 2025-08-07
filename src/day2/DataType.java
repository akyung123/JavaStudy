package day2;

import javax.swing.text.Style;

public class DataType {
    public static void main(String[] args) {
        // 정수형
        byte bVal = 20;
//        byte overByteVal = 128; //컴파일 오류
        short sVal = 30;
        int iVal = 40;
        System.out.println(bVal+sVal+iVal);

        long lVal = 1234567890l; // long은 문자형이랑 헷갈릴수도 있기에 l을 덧붙이기도 한다

        // 문자형
        char ch1 = 'A'; // ''(작은 따옴표)로 표시해야한다
//        char ch2 = "A"; // ""(큰 따옴표)로 하면 오류 발생
//            -> ""은 string에 사용한다
//         char ch3 = 'Aaaaaa'; // 문자가 너무 많아서 오류 발생
//            -> char은 오직 한글자만 저장가능하다
        char ch4 = 66;
        System.out.println(ch4); // 이것은 실행된다
        // 아스키 코드 값 66 = B이다.
        System.out.println((int)ch4); // 강제 형변환
            // 특정 자료형을 강제로 자료형 형태를 바꿔주는 것도 가능하다
        char ch5 = '한'; // 한글은 유니코드로 저장됩니다.
        char ch6 = '\uD55c';
        System.out.println(ch5);
        System.out.println(ch6);
        // 둘은 똑같이 출력된다.

//        char ch7 = -65;
//        System.out.println(ch7);
//        // char에는 음수값을 저장할 수 없습니다.

        // 논리형
        boolean isStudent = false;
        System.out.println(isStudent);
//        System.out.println((int)isStudent); // 불가능
//            // 자바를 ture, false를 0과 1로 구분하는걸 허용하지 않는다

        // 실수형
        double dNum = 3.14;
        double dNum2 = 3.14D; // 뒤에 D를 적어주어도 된다!(필수 아님)
        float fNum = 3.14F; //  뒤에 F를 적어야 float라고 인식가능하다(필수임)
        System.out.println(dNum);
        System.out.println(fNum);

        System.out.println(dNum+fNum);
        // 출력 : 6.280000104904175
        // 0과 1로 소수점 아래의 숫자를 정확하게 표현할 수 없기에 연산 결과에 오차가 생긴다
        // 컴퓨터의 2진수와 현실의 10진수 각 표현방식의 차이로 인해 표현 가능ㅇ한 값에 차이가 생기기 때문

        // 참조자료형 맛보기
        String str = "Hello";
        // 문자열은 많이 사용되어서 특별해진 자료형입니다
        // 저장되는 형태도 조금 다릅니다
        // 호출하는 방식도 다릅니다ㅡ
        System.out.println(str);

    }
}
