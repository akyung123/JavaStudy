package day9.encapsulation;

import java.util.Scanner;

public class Phone {
    private String model;
    private double price;
    private double charge;

    //new Phone을 통해 생성 시점에서 처음부터 2가지 값을 지정하여 생성하겠다.
    public Phone(String model, double price) {
        this.model = model;
        this.price = price;
    }
    // 휴대폰 요금 설정
    public void setCharge(double setcharge) {
        this.charge = Math.ceil(price/12+setcharge);
    }

    public void setprice(double setprice) {
        this.price = Math.ceil(setprice);
    }

    //기종 조회를 위한 get메서드2
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public double getCharge() { return charge; }


    public void setPrice(double price) {
        this.price = price;
    }
}
