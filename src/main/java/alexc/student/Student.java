package alexc.student;

import alexc.person.Person;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import static java.lang.Boolean.TRUE;

public class Student extends Person {
    private Boolean graduated;
    private Integer interviewScore;
    private HashMap<String, Integer> disciplineMarks = new HashMap<>();
    private static String code;

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

    public void calculateAverageDisciplinesScore() {
        int mark = 0;
        Set set = disciplineMarks.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry) iterator.next();
            mark += (int) mentry.getValue();
        }
        System.out.println("The average mark is: " + mark / disciplineMarks.size());
    }

    public static void main(String[] args) {

        Student alex = new Student("Alex", "Caciur", TRUE, 5);
        alex.setGender("Male");
        System.out.println("Name: " + alex.getLastName() + " " + alex.getFirstName());
        System.out.println("Gender: "+alex.getGender());
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
