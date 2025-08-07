package day4.switchexample;

public class SwitchCase03 {
    public static void main(String[] args) {
        // yield? switch-case문 안에 복잡한 제어문이 더 들어가는 경우에
        // 수행 결과를 반환하기 위하여 사용
        String medalColor;
        medalColor = "Gold";
        String message = switch (medalColor) {
            case "Gold"->"금메달입니다";
            case "Silver"->"은메달입니다";
            case "Brown"->"동메달입니다. ";
            default->{
                if (medalColor == "blank")
                    yield "없는 메달입니다.";
                else
                   yield  "알수없습니다. ";
            }
       };
        System.out.println(message);
    }
}
