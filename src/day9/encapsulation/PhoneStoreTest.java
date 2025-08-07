package day9.encapsulation;
import java.util.zip.CheckedOutputStream;

public class PhoneStoreTest {
    public static void main(String[] args) {
        //휴대폰 공장에서 생산
        Phone iphone = new Phone("아이폰",1000000);

        //판매점 객체 생성(단, 한 기종만 필 수 있는 대리점)
        PhoneStore store = new PhoneStore(iphone);
        //손님
        Customer customer1 = new Customer("김형근", 1000000);
        customer1.buyPhone(store);
        //손님이 구매를 한다.
        System.out.println("새로운 손님이 오셨어요. ");
        Customer customer2  = new Customer();
        customer2.buyPhone(store);
        //손님 조회하기
        System.out.println(("새로운 손님이 오셨어요"));
        Customer customer3 = store.findCustomer();
        if (customer3 != null) {
            System.out.println("정보에 없는 손님입니다.");
            customer3 = new Customer();
            customer3.buyPhone(store);
        } else {
            customer3.buyPhone(store);
        }

        buyPhoneStroy(customer1);
        buyPhoneStroy(customer2);
        buyPhoneStroy(customer3);

        System.out.println("총 "+PhoneStore.sellnum+"개 판매되었습니다. ");
    }

    public static void buyPhoneStroy(Customer customer)
    {
        if (customer. newmyphone != null) {
            System.out.println("오늘 새로운 폰을 샀습니다. ");
            System.out.println(customer.getName()+customer.newmyphone.getModel()+"입니다. ");
            System.out.println("         가격은 "+customer.newmyphone.getPrice()+"입니다. ");
            System.out.println("         요금은 "+customer.newmyphone.getCharge()+"입니다. ");
        }
        else
            System.out.println("오늘 새로운 폰을 사지 못했습니다. ");
    }
}
