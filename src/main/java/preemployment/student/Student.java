package preemployment.student;

import preemployment.person.Person;

import java.util.HashMap;
import java.util.Map;

public final class Student extends Person {

    private Boolean graduated;
    private int interviewScore;
    private Map<String, Integer> disciplineMarks = new HashMap<>();

    public Student(String firstName, String lastName, Boolean graduated, int interviewScore) {
        super(firstName, lastName);
        this.graduated = graduated;
        this.interviewScore = interviewScore;
    }

    @Override
    public void printPersonalDetails() {
        super.printPersonalDetails();
        System.out.println("Graduated: " + this.graduated);
        System.out.println("Interview Score: " + this.interviewScore);
        System.out.println("Discipline Marks: " + this.disciplineMarks);
    }

    public Boolean getGraduated() {
        return graduated;
    }

    public void setGraduated(Boolean graduated) {
        this.graduated = graduated;
    }

    public int getInterviewScore() {
        return interviewScore;
    }

    public void setInterviewScore(int interviewScore) {
        this.interviewScore = interviewScore;
    }

    public Map<String, Integer> getDisciplineMarks() {
        return disciplineMarks;
    }

    public void addDisciplineMark(String discipline, Integer mark) {
        this.disciplineMarks.put(discipline, mark);
    }

    public float calculateAverageDisciplinesScore() {
        float marksSum = 0;
        float marksCount = disciplineMarks.size();

        for (Map.Entry<String, Integer> entry : disciplineMarks.entrySet()) {
            marksSum = marksSum + entry.getValue();
        }
        ;

        return marksSum / marksCount;
    }
}
