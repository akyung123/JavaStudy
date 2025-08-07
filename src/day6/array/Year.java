package day6.array;

import java.util.Scanner;

public class Year {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = {10, 5, 16, 8, 4, 2, 1};
        System.out.println(arr[0]);
        System.out.print("언제 태어나셨나요? : ");
        int year = s.nextInt();
        s.nextLine();
        String y[] = {"쥐", "소", "호랑이", "토까", "용", "뱀", "말", "양", "원숭이", "닭", "개", "돼지"};
        System.out.printf("%s띠입니다.", y[(year-1984)%12]);
    }
}
