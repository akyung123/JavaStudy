package report;

public class Class {
    private final Student[] ClassA = {
            new Student("김아경", 1),
            new Student("김석현", 2),
            new Student("임영민", 3),
            new Student("정병규", 4)
    };

    public static class Subject {
        String subjectName;
        int subjectID;
        int achievement;

        public void inputSubject() {
            System.out.println();
        }

    }
}