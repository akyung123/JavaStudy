package day4.ifexample;

public class ifExample02 {
    public static void main(String[] args) {
        // 조건문
        /*
         * if (조건식){
         *      조건식이 참을 반환할 때, 실행할 수행문;
         * } else{
         *      위의 조건식이 거짓을 반환할 때 실행되는 수행문;
         * }
         */
        int age = 9;
        if (age >= 8){
            System.out.println("학교에 갑니다");
        }
        else
            System.out.println("학교에 가지않습니다");
    }
}
