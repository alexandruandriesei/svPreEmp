package anab.Person;

import java.util.HashMap;
import java.util.Map;

public class Trainer extends Person {
    private String specialization;
    private int experienceYears;
    private Map<String, Integer> feedbackMarks = new HashMap<>();

    //constructor explicit -mosteneste Person=> super(param1, param2, param3,...)
    public Trainer(String firstName, String lastName, String gender, int age, String emailAddress, boolean isEmailRestricted, String specialization, int experienceYears, Map<String, Integer> feedbackMarks) {
        super(firstName, lastName, gender, age, emailAddress, isEmailRestricted);
        this.specialization = specialization;
        this.experienceYears = experienceYears;
        this.feedbackMarks = feedbackMarks;
    }

    // see the specialization of a trainer
    public String getSpecialization() {
        return this.specialization;
    }

    //add specialization of a trainer
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    //see the years of experience of a trainer
    public int getExperience() {
        return this.experienceYears;
    }

    //Add years of experience for a trainer
    public void addExperience(String specialization, int experienceYears) {
        this.specialization = specialization;
        this.experienceYears = experienceYears;

    }

    public void setExperienceYears(int years, int existingExp) {
        if (years != 0 && years > 0 && years >= existingExp) {
            years = getExperience() + years;
            System.out.println(years + " years of experience on " + this.specialization);
        } else {
            System.out.println("Add valid value for years of experience= ");
        }
    }

    public void addFeedbackMark(int feedback, String name) {
        if (feedback <= 0 || feedback > 10) {
            if (name == " ") {
                name = "Anonymous Student";
                //     }else{
                //   System.out.println("Irrelevant feedback");
                //  }
            } else {
                System.out.println("Feedback note:" + this.feedbackMarks.put(name, feedback));
            }
        }
    }

    public Map<String, Integer> getFeedbackMarks() {
        return this.feedbackMarks;
    }
}