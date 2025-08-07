package day9.encapsulation;

import java.util.Scanner;

public class PhoneStore {
    public static int sellnum = 0;
    private final Phone[] phones = new Phone[10];
    private final Customer[] customers = {
            new Customer("김아경", 100000000)
    };
    private final Customer[] AceCustomers = {
            new Customer("김아경", 100000000),
            new Customer("김석현", 100000000),
            new Customer("임영민", 100000000),
            new Customer("정병규", 100000000)
    };
    private final Customer[] grils = {
            new Customer("뇌하진", 1000000000),
            new Customer("김연미", 1000000000),
            new Customer("김민서", 1000000000),
            new Customer("김지우", 1000000000),
            new Customer("김아경", 1000000000)
    };
    private int index = 0;
    //대리점 생산
    public PhoneStore(Phone phone) {
        addPhone(phone);
    }
    // 휴대폰을 추가하는 메소드
    public boolean addPhone(Phone phone) {
        if (index < phones.length) {
            phones[index++] = phone;
            return (true);
        }
        return (false);
    }
    public boolean addNewPhone(String mymodel, double price) {
        Phone newphone = new Phone(mymodel, price);
        return addPhone(newphone);
    }
    public void printPhones() {
        for (Phone phone : phones) {
            if (phone != null)
                System.out.println(phone);
        }
    }
    // 손님 정보가 있는지 조회하기
    public Customer findCustomer()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("이름이 어떻게 되시나요? ");
        String name = scanner.nextLine();
        for (Customer c : customers){
            if (name.equals(c.getName())) return c;
        }
        return (null);
    }
    // 현재는 get model이지만, 배열로 만들 시, boolean 타입으로 생성하기
    public Phone checkModel(String mymodel) {
        for (Phone phone : phones)
            if (null != phone)
                if (mymodel.equals(phone.getModel())) {
                    System.out.println("해당 기종을 판매하고 있습니다. ");
                    return (phone);
                }
        System.out.println("해당 기종을 판매하고 있지않습니다.");
        // 입고 요청하기
        System.out.println("입고 요청을 드리겠습니다. 다음에 찾아와주세요. ");
        if (addNewPhone(mymodel, 1000000))
            System.out.println(("입고 되었습니다!"));
        else
            System.out.println(("입고에 실패했습니다!"));
        return (null);
    }
    // 모델을 찾아서 price를 내보내게 수정 예성
    public Boolean checkBudget(Phone phone, double budget) {
        if (budget >= phone.getPrice()) {
            System.out.println("예산이 충분하십니다.");
            return (true);
        }
        else {
            System.out.println("예산이 부족합니다. ");
            System.out.println("핸드폰 구매가 불가능합니다. 다른 대리점을 찾아가세요. ");
            return (false);
        }
    }

    public Phone sellPhone(Phone phone, Customer customer) {
        registerPayment(phone);
        discountPromotion(customer, phone);
        System.out.println("요금은 1달에 "+phone.getCharge()+"원입니다. ");
        //대리점이 휴대폰을 판매할 때 일어나는 일.
        System.out.println("대리점: 휴대폰 전달");
        return phone; //구매 후 실제 핸드폰을 전달
    }

    private double MathPayment(int choice) {
        switch (choice) {
            case 1:
                return (50000);
            case 2:
                return (30000);
            case 3:
                return (20000);
            default:
                System.out.println("없는 숫자입니다. 다시 선택해주세요.");
                Scanner scanner = new Scanner(System.in);
                choice = scanner.nextInt();
                scanner.nextLine();
                return (MathPayment(choice));
        }
    }

    private void registerPayment(Phone phone) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("어떤 요금제를 선택하시겠습니까?");
        System.out.println("1 : 무제한 - 5만원");
        System.out.println("2 : 5G - 3만원");
        System.out.println("3 : 3G - 2만원");
        int choice = scanner.nextInt();
        scanner.nextLine();
        phone.setCharge(MathPayment(choice));
        System.out.println("대리점 : 요금제를 등록합니다. 약정을 등록합니다. ");
    }

    private void discountPromotion(Customer customer, Phone phone) {
        // System.out.println("혹시 이 중에서 할인되시는 카드나 혜택이 있으신가요?");
        for (Customer gc : grils) {
            if (customer.getName().equals(gc.getName()))
            {
                System.out.println("친구 할인 50퍼 해드립니다.");
                phone.setprice(phone.getPrice() * 0.5);
            }
        }
        for (Customer ac :  AceCustomers) {
            if (customer.getName().equals(ac.getName()))
            {
                System.out.println("A반 학생이신군요! 그러면 요금은 공짜입니다.");
                phone.setCharge(0);
            }
        }
//        Scanner scanner = new Scanner(System.in);
//        int choice = scanner.nextInt();
//        scanner.nextLine();
        System.out.println("대리점 : 이벤트로 할인이 적용됩니다.");
    }


}
