package day9.encapsulation;

import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.ScheduledExecutorService;

public class Customer {
    private String name;
    private double budget; //
    public Phone newmyphone;

    public Customer(String name, double budget) {
        this.name = name;
        this.budget = budget;
    }

    public Customer() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("성함이 어떻게 되시나요? : ");
        name = scanner.nextLine();
        System.out.print("예산은 어느 정도로 생각하시나요? : ");
        budget = scanner.nextDouble();
    }

    public String getName() {
        return name;
    }

    public double getBudget() {
        return budget;
    }

    //고객이 핸드폰 구매
    public void buyPhone(PhoneStore store) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("어떤 기종을 구입하시나요?");
        String myphone = scanner.nextLine();
        System.out.println("기종을 확인 중입니다...");
        Phone newphone = store.checkModel(myphone);
        if (newphone == null)// 기종확인
            return ;
        if(store.checkBudget(newphone, budget)) {// 예산 확인
            //고객이 휴대폰을 살 때 일어나는 일
            store.sellPhone(newphone, this);
            //구입 했을 때의 출력
            newmyphone = newphone;
            //구입하지 못했을 때의 출력문
            PhoneStore.sellnum++;
        }
        //대리점이 휴대폰을 팔 수 있냐 없냐를 구분하는 분기
        System.out.println("안녕히 가세요");
    }
}
