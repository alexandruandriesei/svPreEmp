package anab.Person;

import java.util.HashMap;
import java.util.Map;

public class Trainer extends Person {
    private String specialization;
    private int experience;
    private Map<String, Integer> feedbackMarks = new HashMap<>();

    public Trainer(String firstName, String lastName, String gender, int age, String emailAddress, boolean isEmailRestricted, String specialization, int experience, Map<String, Integer> feedbackMarks) {
        super(firstName, lastName, gender, age, emailAddress, isEmailRestricted);
        this.specialization = specialization;
        this.experience = experience;
        this.feedbackMarks = feedbackMarks;
    }

    public String getSpecialization() {
        return specialization;
    }

    public String setSpecialization(String specialization) {
        this.specialization = specialization;
        return specialization;
    }

    public int getExperience() {
        return experience;
    }
    public int addExperience(int years) {
        this.experience=years;
        return years;
    }
    public void setExperience(String specialization, int years) {
        this.experience = years;
        if(years!=0 && years>0){
            experience=addExperience(years);
            System.out.println(years+ " years of experience on "+ specialization);
        }else{
            System.out.println("Add valid value for years of experience= ");
        }
    }
}
