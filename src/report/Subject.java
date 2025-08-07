package report;

import java.util.Scanner;

// 과목 파일
// 과목 별로 점수 지정 가능
public class Subject {
    String SubjectName;
    int SubjectID;
    int SubjectScore;
    public Subject(String SubjectName, int SubjectID) {
        this.SubjectName = SubjectName;
        this.SubjectID = SubjectID;
    }
    public void inputScore(){
        Scanner sc = new Scanner(System.in);
        System.out.print(SubjectName+"의 성적을 입력하세요 : ");
        SubjectScore = sc.nextInt();
        sc.close();
    }
}
