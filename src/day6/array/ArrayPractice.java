package day6.array;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] scores = {55, 60, 71, 84, 62};
        char[] grades = {'E', 'D', 'C', 'B', 'A'};
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d번째 학생의 성적은 %c입니다.%n", i+1, grades[(scores[i]/10)-5]);
        }
    }
}

