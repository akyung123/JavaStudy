package day8.kitchen;

public class Ramen {
    String noodleType;
    String soupType;
    boolean isCooked;

    // 생성사? 클래스 이름과 같은 이름을 가진 메서도
    // 객체가 생성될때 호출되어 객체의 초기 상태를 설정하는 특수한 메서드
    // new 키워드와 함께 호출하며 새 객체를 생성하기 위한 메서드
    void Ramen(){
        noodleType = "랜덤";
        soupType = "랜덤";
    }
    void Ramen(String noodleType) {
        this.noodleType = noodleType;
        //soupType = "매운 국물";
    }
    void boilWater (){
        System.out.println("물을 끓입니다...");
    }
    void addNoodles(){
        System.out.println(noodleType + "면을 넣습니다...");
    }
    void addSoups(){
        System.out.println("스프를 넣습니다...");
    }
    void Cooking(){
        System.out.println(soupType+"라면 조리 중입니다.");
        boilWater();
        addNoodles();
        //isCooked = true;
    }
}
