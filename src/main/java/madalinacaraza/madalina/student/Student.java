package madalinacaraza.madalina.student;

import madalinacaraza.madalina.person.Person;

import java.util.*;

import java.util.HashMap;

public class Student extends Person {
    private boolean graduated;
    private int interviuScore;
    HashMap<String, Integer> disciplineMarks = new HashMap<>();
    private static String code;

    public Student(String firstName, String lastName, boolean graduated, int interviuScore) {
        super.firstName = firstName;
        super.lastName = lastName;
        this.graduated = graduated;
        this.interviuScore = interviuScore;
    }

    public void addDisciplineMark(String discipline, Integer mark) {
        this.disciplineMarks.put(discipline, mark);
    }

    public float calculateAverageDisciplinesScore() {
        int score = 0;
        Set set = disciplineMarks.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry) iterator.next();
            score = score + (int) mentry.getValue();

        }
        float scoreAvarege = (float) score / disciplineMarks.size();
        return scoreAvarege;
    }


    public HashMap<String, Integer> getDisciplineMarks() {
        return disciplineMarks;
    }

    public void setDisciplineMarks(HashMap<String, Integer> disciplineMarks) {
        this.disciplineMarks = disciplineMarks;
    }
}
