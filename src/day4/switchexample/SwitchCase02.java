package day4.switchexample;

public class SwitchCase02 {
    public static void main(String[] args) {
        /*
         * swithch case문을 break 없이!
         * :와 break 대신 -> 사용
         * switch case문은 반환도 가능
         */
        String medalColor;
        medalColor = "Gold";
        String message = switch (medalColor) {
            case "Gold"->"금메달입니다";
            case "Silver"->"은메달입니다";
            case "Brown"->"동메달입니다. ";
            default->"수상하지 못했습니다.";
       };
        System.out.println(message);
    }
}
