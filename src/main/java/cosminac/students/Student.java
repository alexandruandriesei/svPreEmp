package cosminac.students;

import cosminac.person.Person;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Student extends Person {

    private boolean graduated;
    private int interviewScore;
    private static String code;
    private HashMap<String, Integer> disciplineMarks = new HashMap<> ();

    public static String getCode() {
        return code;
    }

    public static void setCode(String code) {
        Student.code = code;
    }

    public boolean isGraduated() {
        return graduated;
    }

    public void setGraduated(boolean graduated) {
        this.graduated = graduated;
    }

    public int getInterviewScore() {
        return interviewScore;
    }

    public void setInterviewScore(int interviewScore) {
        this.interviewScore = interviewScore;
    }

    public HashMap getDisciplineMarks() {
        return disciplineMarks;
    }

    public void setDisciplineMarks(HashMap disciplineMarks) {
        this.disciplineMarks = disciplineMarks;
    }

    public Student(String firstName,String lastName, boolean graduated, int interviewScore) {
        super.firstName = firstName;
        super.lastName = lastName;
        this.graduated = graduated;
        this.interviewScore = interviewScore;
    }

    public void display() {
        System.out.println("First Name is "+super.getFirstName() + "Last Name is "+super.getLastName() + "Graduated is "+this.graduated + "Interview score is " +this.interviewScore);
    }

    public void addDisciplineMark(String discipline, Integer mark) {
       this.disciplineMarks.put(discipline, mark);
    }

    public float calculateAverageDisciplinesScore () {
        int mark=0;
        int number=0;

        Set set = disciplineMarks.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry disciplines = (Map.Entry)iterator.next();
            mark+= (int)disciplines.getValue();
            number++;
        }

        return (float)mark/number;
    }


    
}

