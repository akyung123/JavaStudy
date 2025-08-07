package day4.ifexample;

public class ifExample01 {
    public static void main(String[] args) {
        // 조건문
        /*
         * if (조건식){
         *      조건식이 참을 반환할 때, 실행할 수행문;
         * }
         * 조건은 논리 값을 반환하여야 한다
         * -> 자바 에서 조건식은 반드시 좆리형의 데이터를 반환하는 식이어야한다.
         *      ()
         */
        int age = 9;
        if (age >= 8){
            System.out.println("학교에 갑니다");
        }
        else
            System.out.println("학교에 가지않습니다");
    }
}
