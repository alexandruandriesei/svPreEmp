package floriana.student;

import floriana.person.Person;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Student extends Person {
    private boolean graduated;
    private int score;
    private Map<String, Integer> disciplineMarks = new HashMap<>();

    public Student(String firstName, String lastName, boolean graduated, int score) {
        super(firstName, lastName);
        this.graduated = graduated;
        this.score = score;
    }

    public boolean isGraduated() {
        return graduated;
    }

    public void setGraduated(boolean graduated) {
        this.graduated = graduated;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Map<String, Integer> getDisciplineMarks() {
        return disciplineMarks;
    }

    public void setDisciplineMarks(HashMap<String, Integer> disciplineMarks) {
        this.disciplineMarks = disciplineMarks;
    }

    public void addDisciplineMark(String discipline, Integer mark) {
        this.disciplineMarks.put(discipline, mark);
    }

    public int calculateAverageDisciplinesScore() {
        int averageScore = 0;
        for( Map.Entry<String,Integer> i:disciplineMarks.entrySet()) {
            averageScore +=i.getValue();

        }
        return averageScore/disciplineMarks.size();
    }

    @Override
    public String toString() {
        return "Student{" +
                "graduated=" + graduated +
                ", score=" + score +
                ", disciplineMarks=" + disciplineMarks +
                '}';
    }
}
