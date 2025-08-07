package day3;
// 1. Scanner를 사용하기 위해 import를 한다.
import java.io.IOException;
import java.util.Scanner;

public class ScannerSample {
    public static void main(String[] args) {
        // 2. Scanner 객체를 생성한다.
        Scanner input = new Scanner(System.in);
        // 3. Scanner 객체를 사용하여 입력을 받는다.
        // Systen의 표준 입력 장치를 사용하는 스캐너의 객체를 생성해준다.
        // 어디에? input이라는 이름을 가진 공간에!
        String str = input.nextLine();
        // 다음 줄을 입력으로 받는다.
        System.out.println(str);
        System.out.println("입력과 동시에 출력");
        System.out.println(input.nextLine());
        input.nextInt();
        input.nextLine();

        int i;
        try {
            i = System.in.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // Scanner문에서 쓰이는 입력들 정리
        // input.next(자료형)() 형태로 모든 자료형을 읽는 것이 가능하다
        // 다만, String만 input.nextline()으로 입력받습니다.

        // 우리가 평소에 쓰는 System.out은 표준출력
        //                 System.in은 표준 입력입니다.
        // 이는 우리가 평소에 쓰는 출력이 되는 콘솔창에서 쓰인다고 생각하시면 됩니다.

        // Q) 출력(print)는 import를 안했는데, 왜 입력은 import를 해오나요?

        /* 해당 표준 입력과 출력은 byte 단위로만 움직입니다.
         * 그러면 즉 byte만 입력가능합니다.
         *      -> 출력일 경우에는 자동으로 바이트로 바꿔서 출력하게 되어있습니다.
         *         입력은 우리가 바이트로 받으면 어떤 자료인지 모르겠죠? 그래서 이를 해석해주는 친구가 필요해요!
         * import (클래스명)은 import를 통해서 이처럼 도움을 줄 만한 친구들을 가져와서 사용하는 것입니다.
         * 우리는 이제껏 계속해서 클래스를 생성하여 파일을 만들었다는 것을 떠올릴 수 있을 것입니다.
         * 이처럼 누군가가 만들어둔 입력에 대한 클래스를 가져와서 사용하기 위해서 import를 합니다
         * Sacnner 클래스는 java.utill에 있는, 즉 우리가 처음에 미리 준비해둔 클래스입니다.
         * (여기서 java는 패키지명입니다. 저희는 지금 day3패키지의 ScannerSample에서 연습하고 있어요
         *          -> 지금 이 클래스를 나중에 불러오기 위해서는 day3.ScannerSample로 불러올 수 있어요
         *
         * 어라? 모르겠다고요? 우리는 이미 이를 jdk를 통해서 다운받아둔 상태입니다.
         * 외부 라이브러시 -> < 17 > (버전에 따라 다를 수도 있습니다) -> java.base -> java -> utill에 가면
         * 놀랍게도 Scanner 클래스가 존재합니다
         * ------------------------------------------------------
                 * public double nextDouble() {
                // Check cached result
                if ((typeCache != null) && (typeCache instanceof Double)) {
                    double val = ((Double)typeCache).doubleValue();
                    useTypeCache();
                    return val;
                }
                setRadix(10);
                clearCaches();
                // Search for next float
                try {
                    return Double.parseDouble(processFloatToken(next(floatPattern())));
                } catch (NumberFormatException nfe) {
                    position = matcher.start(); // don't skip bad token
                    throw new InputMismatchException(nfe.getMessage());
                }
            }
            * ------------------------------
         * 이런 식으로 정의되어있는걸 볼 수 있습니다!
         * 즉, 우리가 이제껏 만든 클래스는 이렇게 이용할 수도 있습니다.
         * 쓸데없는 이야기 끝!
         */

        /*
         * 이렇게 선언해둔 클래스에 있는 것들을 쓰기 위해서는 .을 통해서 씁니다
         * 우리가 cd로 이동할때 /를 사용한 것처럼 .을 사용해서 해당 클래스에 있는 친구를 불러와서 사용할 수 있습니다.
         * 꼭 클래스가 아니더라도 객체를 불러와서 사용할 때, .을 통해서 불러옵니다
         * 이건 너무 뒷 내용이긴하지만,,,, 미리 조금 설명을 해보겠습니다.
         * 자바는 개체지향 언어라는 것을 기억하시나요?
         * 우리는 이제 클래스와 메소드에 대해서 잘 구분할 수 있어합니다.
         * 이제껏 class 파일을 생성하면 기본 세팅으로 뜨던 코드를 기억하시나요?
         * pubilc class (클래스명) { } 였습니다.
         * 여기서 pubilc은 접근 지정자라고 합니다. 이는 클래스에 대한 접근을 지정하는 친구입니다.
         * class (클래스명) {} 을 통해서 클래스를 정의할 수 있습니다.
         * >> 정의이지, 생성은 아닙니다 <<
         *
         *
         */

    }
}
