package report;

import java.util.Scanner;

public class report {
    // 학생들의 성적
    int StundentID;
    public Subject[] subjectList = {
            new Subject("국어", 1),
            new Subject("수학", 2),
            new Subject("사회", 3),
            new Subject("과학", 4),
            new Subject("영어", 5)
    };
    public void inputSubjectScore()
    {
        Scanner sc = new Scanner(System.in);
        for (Subject subject : subjectList) {
            subject.inputScore();
        }
    }
}
