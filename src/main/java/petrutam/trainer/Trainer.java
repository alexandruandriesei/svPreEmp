package petrutam.trainer;
import java.util.Iterator;
import java.util.Map;

import petrutam.person.Person;

import java.util.HashMap;
import java.util.Set;

public class Trainer extends Person {
    private String specialization;
    private int years;
    HashMap<String, Integer> s = new HashMap<>();

    public Trainer(String specialization, int years) {
        this.specialization = specialization;
        this.years = years;
    }

    public Trainer(String firstName, String lastName, String specialization, int years) {
        super(firstName, lastName);
        this.specialization = specialization;
        this.years = years;
    }

    public void printTrainer() {
        System.out.println("Name: " + this.getFirstName() + "Last name: " + this.getLastName());
        System.out.println("specialization:" + " " + this.getSpecialization());
        System.out.println("years:" + " " + this.getYears());
        System.out.println("feedback:" + " " + this.getS());

    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {

        if (years < this.years)
            this.years = years;
        else {
            throw new IllegalArgumentException("Invalid years");
        }
    }

    public HashMap<String, Integer> getS() {
        return s;
    }

    public void addFeedback(String name, int mark) {
        if (mark >= 0 && mark <= 10)
            this.s.put(name, mark);
        else {
            throw new IllegalArgumentException("Invalid mark");
        }
    }

    public float averageFeedback(){
        float mark=0;
        Set set= s.entrySet();
        Iterator iterator= set.iterator();
        while(iterator.hasNext()){
            Map.Entry m= (Map.Entry)iterator.next();
            mark += (int)m.getValue();
        }
        return mark/s.size();
    }

}
