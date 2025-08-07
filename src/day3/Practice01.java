package day3;

import java.io.PrintStream;

public class Practice01 {
    public static void main(String[] args) {
        /*
        *  에제. 타수와 안타수를 변수에 저장하고 타율을 게산하세요
        * 타수 : 10
        * 안타 : 1
        * 타율 : 0.1
        *
        *
         */
        // 예제
        int attrs = 10;
        int hits = 1;
        double battingAvg;
        battingAvg = (double) hits / attrs;

        System.out.println("타율이 "+battingAvg+"로 나왔을 때 : ");
        System.out.println((int)(battingAvg*10)+"할 "+(int)(battingAvg%0.1)+"푼 "+(int)(battingAvg/(battingAvg*100))+"리");
        battingAvg = 0.345;
        System.out.println("타율이 "+battingAvg+"로 나왔을 때 : ");
        System.out.println((int)(battingAvg*10)+"할 "+(int)((battingAvg*100)%10)+"푼 "+(int)((battingAvg*1000)%10)+"리");
        // 실수 나누기로 계산은 불가능함 -> 실수의 저장에 대한 문제임

        attrs = 55555;
        hits = 9955;
        battingAvg = (double) hits / attrs;
        System.out.printf("타수 : %d%n", attrs);
        System.out.printf("안타 : %d%n", hits);
        System.out.printf("타율 : %.3f%n", battingAvg);
        System.out.printf("%d할%d푼%d리%n", (int)(battingAvg*10), (int)((battingAvg*100)%10), (int)((battingAvg*1000)%10));
        //System.out.printf()

    }
}
