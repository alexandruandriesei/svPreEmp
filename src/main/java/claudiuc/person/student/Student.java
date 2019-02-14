package claudiuc.person.student;

import claudiuc.person.Person;

import java.util.HashMap;
import java.util.Map;

public class Student extends Person {

    private static String code;
    Boolean graduated;
    Integer interviewScore;
    HashMap<String, Integer> disciplineMarks = new HashMap<>();


    public Student() {
    }

    public Student(Boolean graduated, Integer interviewScore, HashMap<String, Integer> disciplineMarks) {
        this.graduated = graduated;
        this.interviewScore = interviewScore;
        this.disciplineMarks = disciplineMarks;
    }

    public Student(String firstName, String lastName, Boolean emailRestricted, Boolean graduated, Integer interviewScore, HashMap<String, Integer> disciplineMarks) {
        super(firstName, lastName, emailRestricted);
        this.graduated = graduated;
        this.interviewScore = interviewScore;
        this.disciplineMarks = disciplineMarks;
    }

    public Boolean getGraduated() {
        return graduated;
    }

    public void setGraduated(Boolean graduated) {
        this.graduated = graduated;
    }


    public Integer getInterviewScore() {
        return interviewScore;
    }

    public void setInterviewScore(Integer interviewScore) {
        this.interviewScore = interviewScore;
    }

    public HashMap<String, Integer> getDisciplineMarks() {
        return disciplineMarks;
    }

    public void setDisciplineMarks(HashMap<String, Integer> disciplineMarks) {
        this.disciplineMarks = disciplineMarks;
    }

    public void adaugareNota(String materie, Integer nota) {

        this.disciplineMarks.put(materie, nota);

    }

    public double medie() {


        double sum = 0;
        for (Map.Entry element : disciplineMarks.entrySet()) {
            int sum1 = (int) element.getValue();
            sum += (double) sum1;


        }

        return sum / (double) this.disciplineMarks.size();


    }


}










