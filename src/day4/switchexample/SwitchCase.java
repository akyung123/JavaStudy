package day4.switchexample;

public class SwitchCase {
    public static void main(String[] args) {
        /*
         * swithch (조건)
         */

        String medalColor;
        medalColor = "Gold";
        switch (medalColor) {
            case "Gold":
                System.out.println("금메달입니다");
                break;
            case "Silver":
                System.out.println("은메달입니다");
                break;
            case "Brown":
                System.out.println("동메달입니다. ");
                break;
            default:
                System.out.println("수상하지 못했습니다.");
       }
    }
}
