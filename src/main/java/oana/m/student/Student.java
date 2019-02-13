package oana.m.student;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import oana.m.person.Person;


public class Student extends Person {
    private boolean graduated;
    private int interviewScore;
    private HashMap<String, Integer> discipileMarks = new HashMap<>();
    private static String code;

    public Student(String firstName,String lastName,boolean graduated, int interviewScore) {
        this.graduated = graduated;
        this.interviewScore = interviewScore;
        super.firstName=firstName;
        super.lastName=lastName;

    }

    public Student() {

    }

    public void afiseaza() {
        System.out.println("Numele este: " + super.getFirstName() + " " + super.getLastName() + " Graduated: " + this.graduated + " ,iar scorul interviului este " + this.interviewScore);
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

    public HashMap<String, Integer> getDiscipileMarks() {
        return discipileMarks;
    }

    public void setDiscipileMarks(HashMap<String, Integer> discipileMarks) {
        this.discipileMarks = discipileMarks;
    }

    public void addDisciplineMark(String disciplina, int mark) {
        discipileMarks.put(disciplina,mark);


    }

    public float calculateAverageDisciplineScore() {

       int mark=0;
       Set set=discipileMarks.entrySet();
        Iterator iterator=set.iterator();
        while(iterator.hasNext()){
            Map.Entry mentry= (Map.Entry) iterator.next();
            mark+=(int)mentry.getValue();


        }

        return (float)mark/discipileMarks.size();

    }
}
