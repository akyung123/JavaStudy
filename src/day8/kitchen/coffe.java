package day8.kitchen;

public class coffe {
    String drinkName;
    int price = 100000;
    String type;

    public coffe(String drinkName) {
        this.drinkName = drinkName;
        type = drinkName.split(" ", 2)[0];
        switch (type) {
            case "아메리카노"->this.price = 2000;
            case "카페라떼"->this.price = 2500;
            case "라떼"->this.price = 5000;
            case "프라푸치노"->this.price = 7000;
            default -> System.out.println("없는 메뉴입니다. ");
        }
    }
    void pay(){
        System.out.println("결제를 도와드리겠습니다. ");
        System.out.println("모두 합해서 "+price+"원입니다.");
    }
    void makeDrink(String drinkName){
        switch (type) {
            case "아메리카노":
                espresso(); water(); ice(); break;
            case "카페라떼":
                espresso(); latte(); ice(); break;
            case "라떼":
                espresso(); latte(); syrup(); ice(); break;
            case "프라푸치노":
                espresso(); latte(); powder(); ice(); blender(); topping(); break;
            default:
                System.out.println("음료가 쏟아졌습니다. ");
        }
        drink();
    }
    void espresso(){
        System.out.println("샷을 내리는 중입니다... ");
    }
    void latte(){
        System.out.println("우유를 따르는 중입니다...");
    }
    void water(){
        System.out.println("물을 따르는 중입니다...");
    }
    void ice(){
        System.out.println("얼음을 컵에 담는 중입니다...");
    }
    void syrup(){
        System.out.println((drinkName.split(" ", 2))+" 시럽을 넣는 중입니다...");
    }
    void powder(){
        System.out.println(drinkName+" 파우더를 넣는 중입니다...");
    }
    void blender(){
        System.out.println("블렌더가 돌아가는 중입니다...");
    }
    void topping(){
        System.out.println(drinkName+" 토핑을 올리는 중입니다...");
    }
    void drink(){
        System.out.println("주문하신 "+drinkName+ "가 나왔습니다!");
    }
}
