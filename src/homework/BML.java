package homework;

import java.util.Scanner;

public class BML {
    public static void main(String[] args) {
        // BMI 계산기
        int kg = 0;
        int cm = 0;
        double bmi;
        Scanner s = new Scanner(System.in);
        while(true)
        {
            System.out.print("키를 입력하세요 : ");
            cm = s.nextInt();
            s.nextLine();
            if (cm <= 0)
                System.out.println("올바른 키를 입력해주세요");
            else
                break;
        }
        while(true)
        {
            System.out.print("몸무게를 입력하세요 : ");
            kg = s.nextInt();
            s.nextLine();
            if (kg <= 0)
                System.out.println("올바른 몸무게를 입력해주세요");
            else
                break;
        }
        bmi = (kg/((cm/100)*(cm/100)));
        System.out.printf("키 : "+cm+"cm%n"+"몸무게 : "+kg+"kg%n");
        System.out.println("bmi : "+bmi);
        if(bmi < 18.5)
            System.out.println("'저체중'입니다");
        else if (bmi < 23)
            System.out.println("'정상'입니다.");
        else if (bmi < 25)
            System.out.println("'과체중'입니다.");
        else
            System.out.println("'비만'입니다.");
    }
}
