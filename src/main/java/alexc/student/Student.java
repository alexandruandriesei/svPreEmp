package alexc.student;

import alexc.person.Person;
import java.util.*;
import static java.lang.Boolean.TRUE;

public class Student extends Person {
    private Boolean graduated;
    private Integer interviewScore;
    private HashMap<String, Integer> disciplineMarks = new HashMap<>();

    public Student(String firstName, String lastName, Boolean graduated, Integer interviewScore) {
        super(firstName, lastName);
        this.graduated = graduated;
        this.interviewScore = interviewScore;
    }

    public Boolean getGraduated() {
        return graduated;
    }


    public Integer getInterviewScore() {
        return interviewScore;
    }

    public HashMap<String, Integer> getDisciplineMarks() {
        return disciplineMarks;
    }

    public void addDisciplineMark(String discipline, Integer mark) {
        this.disciplineMarks.put(discipline, mark);
    }

    public float calculateAverageDisciplinesScore() {
        float markSum = 0;
        float marksCount = disciplineMarks.size();
        Set set = disciplineMarks.entrySet();
        for (Map.Entry<String, Integer> entry : disciplineMarks.entrySet()) {
            markSum += (float) entry.getValue();
        }
        if (disciplineMarks.size() == 0) {
            return 0;
        } else {
            return markSum / marksCount;
        }
    }

    public static void main(String[] args) {

        Student alex = new Student("Alex", "Caciur", TRUE, 5);
        alex.setGender("Male");
        System.out.println("Name: " + alex.getLastName() + " " + alex.getFirstName());
        System.out.println("Gender: " + alex.getGender());
        System.out.println("Graduated: " + alex.getGraduated());
        System.out.println("Interview score: " + alex.getInterviewScore());

        alex.addDisciplineMark("Biologie", 10);
        alex.addDisciplineMark("Info", 8);
        alex.addDisciplineMark("Algebra", 7);
        alex.addDisciplineMark("Geometrie", 3);
        alex.addDisciplineMark("Matematica", 4);

        System.out.println("Disciplines-grades: " + alex.getDisciplineMarks());

        alex.calculateAverageDisciplinesScore();
    }
}
