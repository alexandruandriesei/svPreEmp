package anab.Person;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Student extends Person {

    private boolean graduated;
    private static String code;
    private int interviewScore;
    private Map<String, Integer> disciplineMarks = new HashMap<>();

    public void setGraduated(Boolean newGraduated) {
        graduated = newGraduated;

    }

    public void setCode(String newCode) {
        code = newCode;
    }

    public void setInterviewScore(int newInterviewScore) {
        interviewScore = newInterviewScore;
    }

    public void setDisciplineMarks(Map<String, Integer> disciplineMarks) {
        this.disciplineMarks = disciplineMarks;
    }

    public void addDisciplineMark(String discipline, int nota) {
        this.disciplineMarks.put(discipline, nota);
    }

    public Student(String firstName, String lastName, String gender, int age, String emailAddress, boolean isEmailRestricted, boolean graduated, String code, int interviewScore, Map<String, Integer> disciplineMarks) {
        super(firstName, lastName, gender, age, emailAddress, isEmailRestricted);
        this.code = code;
        this.graduated = graduated;
        this.disciplineMarks = disciplineMarks;
        this.interviewScore = interviewScore;
    }

    public static double average(int sum, Map<String, Integer> map) {
        Set set = map.entrySet();
        Iterator itr = set.iterator();
        sum = 0;
        while (itr.hasNext()) {
            Map.Entry entry = (Map.Entry) itr.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
            sum = sum + (int) entry.getValue();
        }
        double average = (double) sum / map.size();
        return average;
    }
}
