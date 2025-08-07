package day5;

public class WhileExample {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;

        while(num <= 10) {
            System.out.println(num + "을 더했습니다.");
            sum += num++;
        }
        System.out.println("합계 :" + sum);
    }
}
