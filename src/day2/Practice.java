package day2;

public class Practice {
    public static void main(String[] args) {
        // 1. '희'라는 한글 글자의 유니코드 값을 찾아서 적절한 변수에 저장한 뒤 변수를 출력하려 확인하세요
        // 2. 본인 이름을 적절한 자료형의 변수에 담아 출력해보세요.
        // 3. 출생연도를 저장하는 변수를 만들어 선언과 동시에 초기화하세요
        // 4. 바이트타입의 변수 두 개에 10과 20을 저장하고 바이트 타입의 새 변수에 저장해보세요
        // 5. 올해 생일이 지났는지 안지났는지의 데이터를 변수에 저장하고 출력해보세요

        System.out.println(" 1.");
        char hee = '희';
        System.out.println("hee의 아스키코드 값 : "+(int)hee);

        System.out.println(" 2.");
        String name = "김아경";
        System.out.println("이름 : "+name);

        System.out.println(" 3.");
        int BornYear = 2001;
        System.out.println("출생년도 : "+BornYear);

        System.out.println(" 4.");
        byte bNum1 = 10;
        byte bNum2 = 20;
        byte Num = (byte)(bNum1+bNum2);
        System.out.println(Num);

        System.out.println(" 5.");
        boolean Birthday = false;
        System.out.println("생일이 지났나요? : "+Birthday);

    }
}
