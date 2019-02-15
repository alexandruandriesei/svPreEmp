package roxanaa.student;

import roxanaa.person.Person;
import java.util.HashMap;
import java.util.Map;
import java.lang.String;

public class Student extends Person {

    private boolean graduated;
    private Integer interviewScore;
    private HashMap<String, Integer> disciplineMarks = new HashMap<String, Integer>();
    private String numeDisciplina;
    private Integer nota;
    private static String code;
    private int average;

    public boolean isGraduated() {
        return graduated;
    }

    public void setGraduated(boolean graduated) {
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

    public Student(String firstName, String lastName, boolean graduated, Integer interviewScore) {
        super(firstName, lastName);
        this.graduated = graduated;
        this.interviewScore = interviewScore;
        this.disciplineMarks = disciplineMarks;
    }

    public void addDisciplineMark(String numeDisciplina, Integer nota) {
        this.disciplineMarks.put(numeDisciplina, nota);
    };

    public int calculateAverageDisciplineMarks() {
        int suma = 0;
        for (Map.Entry element : disciplineMarks.entrySet()) {
            suma += (int) element.getValue();
        }
        try {
            return suma / disciplineMarks.size();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return suma/ disciplineMarks.size();
    }

    @Override
    public String toString() {
        return "Student: " +
                firstName + " " + lastName +
                " a primit la fiecare disciplina urmatoarele note: " + disciplineMarks;

    }
}

