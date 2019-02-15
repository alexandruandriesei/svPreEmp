package petrutam.student;

import petrutam.person.Person;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Student extends Person {
    private Boolean gradueted;
    private int score;
    private static String code;
    HashMap<String, Integer> disciplineMarks = new HashMap<>();

    public Boolean getGradueted() {
        return gradueted;
    }

    public Student(String firstName, String lastName, Boolean gradueted, int score) {
        super(firstName, lastName);
        this.gradueted = gradueted;
        this.score = score;
    }

    public void setGradueted(Boolean gradueted) {
        this.gradueted = gradueted;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public HashMap<String, Integer> getDisciplineMarks() {
        return disciplineMarks;
    }

    public void setDisciplineMarks(HashMap<String, Integer> disciplineMarks) {
        this.disciplineMarks = disciplineMarks;
    }


    public void addDisciplineMark(String discipline, int mark) {
        this.disciplineMarks.put(discipline, mark);

    }

    public float calculateAverageDisciplinesScore() {

        float mark = 0;
        Set set = disciplineMarks.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry m = (Map.Entry) iterator.next();
            mark += (int) m.getValue();
        }
        if (disciplineMarks.isEmpty()) {
            return 0;
        } else {
            return mark / disciplineMarks.size();
        }
    }

    /* public int calcAvrage(){
         int sum=0;
         for (Map.Entry s: disciplineMarks.entrySet()){

             sum += (int)s.getValue();
         }
         return sum;
     }
 */
    public Student(Boolean gradueted, int score) {
        this.gradueted = gradueted;
        this.score = score;
    }


}
