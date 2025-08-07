package day8.kitchen;

import java.util.Scanner;

public class Cafa {
    public static void main(String[] args) {
        System.out.println("주문하시겠어요?");
        Scanner s = new Scanner(System.in);
        coffe coffe = new coffe(s.nextLine());
        coffe.pay();
        coffe.makeDrink(coffe.drinkName);
    }
}

