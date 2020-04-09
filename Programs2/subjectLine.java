

public class subjectLine {
    public static void main(String[] args) {
        String test = "test";
        System.out.print(makeSubjectLine(test));
    }

    public static String makeSubjectLine(String subject) {
        String subjectLine = "Subject: " + subject;
        return subjectLine;
    }

}