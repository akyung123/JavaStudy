package day2;

import java.lang.module.Configuration;

public class TypeConversion {
    // 파일명은 언제니 클래스명과 일치한다
    public static void main(String[] args) {
        // 묵시적 형변환 Implicit Conversion
        // 바이트 크기가 작은 자료형에서 크기가 큰 자료형으로 자동(묵시적으로) 이루어진다

        byte bNum = 10;
        int iNum = bNum;

        System.out.println(bNum);
        System.out.println(iNum);

        // 덜 정밀한 자료형, 더 정말한 공간
        int iNum2 = 20;
        float fNum = iNum2;

        System.out.println("형변환 전 : "+iNum2); // 형변환 전
        System.out.println("형변환 후 : "+fNum); // 형변환 후

        double dNum;
        dNum = fNum + iNum;
        System.out.println(dNum);
        // 출력 : 30.0

        // 명시적 형 변환 Explicit Conversion
        // 묵시적 형 변환과 반대의 경우
        // 형 변환시 데이터의 손실이 발새할 수  있다
        int explicitConvINum = 1000;
//        byte explicitConvByte = explicitConvINum; // 오류
        byte explicitConvByte = (byte)explicitConvINum;
        System.out.println(explicitConvByte);
        // 출력 : -24
        // 입력은 1000인데, -24가 나왔다 => 오버플로우가 났다
        // byte의 크기 : -128 ~ 127
        // 1000보다는 128을 넣어보자
        explicitConvINum = 128;
        explicitConvINum = (byte)explicitConvINum;
        System.out.println(explicitConvINum);
        // 출력 값 : -128, 가장 큰 값에서 한칸만큼 움직인걸 볼 수 있다. 이런 게 바로 오버플로우!

        // 만약 오버플로우가 안나는 크기라면? -> 정상작동

        double dNumPI = 3.14;
        int iNum1 = (int)dNumPI;
        System.out.println(iNum1);
        // 3이 출력됨

        double dNum1 = 1.2;
        float fNum1 = 0.9F;

        int iNum3 = (int)dNum1+(int)fNum1;
        int iNum4 = (int)(fNum1+dNum1);
        System.out.println("형변환 전 계산 : "+iNum3);
        // (int)형 변환 시, 소수점을 기준으로 자르기에 1+0=1로 1이 된다
        System.out.println("형변환 후 계산 : "+iNum4);
        // 계산 후 변환 시, 2.1에서 소수점 기준으로 자르기에 2가 된다

        // 형변환과 계산의 순서에 의해 결과값이 다를 수 있다


    }
}
