package anab.Person;

import java.nio.MappedByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Trainer extends Person {
    private String specialization;
    private int experienceYears;
    private Map<String, Integer> feedbackMarks = new HashMap<>();

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
    public void addExperience(String spec, int expYears) {
        specialization = spec;
        experienceYears = expYears;
    }

    public int setExperienceYears(int years) {
        if (years != 0 && years > 0 && years >= this.experienceYears) {
            years = getExperience() + years;
            System.out.println("Trainer has " + years + " years of experience on " + this.specialization);

        } else {
            System.out.println("Add valid value for years of experience= ");
        }
        return years;
    }

    public void addFeedbackMark(int feedback) {
        if (feedback > 0 && feedback <= 10) {
            System.out.println("Student: anonymous, feedback note= " + feedback + ",specializ =  " + this.specialization);
        } else {
            System.out.println("Give a feedback mark from 0 to 10 ");
        }
    }

    //Overloading method
    public void addFeedbackMark(String name, int feedback) {
        if (!name.isEmpty() && (feedback > 0 && feedback <= 10)) {
            System.out.println("Student: " + name + ", feedback note= " + feedback + ",specializ =  " + this.specialization);
        } else {
            System.out.println("Give a feedback mark from 0 to 10 ");
        }
        this.feedbackMarks.put(name, feedback);
    }

    public void printFeedbackMarks() {
        Map<String, Integer> feedbackMarks = new HashMap<String, Integer>();
        Set set = feedbackMarks.entrySet();
        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            Map.Entry entry = (Map.Entry) itr.next();
            System.out.println("Test print printFeedbackMarks: " + entry.getKey() + " " + entry.getValue());
        }
    }

    public Map<String, Integer> getFeedbackMarks() {
        return this.feedbackMarks;
    }

    @Override
    public void printPersonDetails() {
        super.printPersonDetails();
        System.out.println("Specialization: " + specialization);
        //  System.out.println("Experienced years: " + experienceYears);
        System.out.println("Trainer feedback marks received = " + feedbackMarks);
    }

    public double averageFeedback() {
        Map<String, Integer> feedbackMarks1 = new HashMap<String, Integer>();
        int sum = 0;
        Set set = feedbackMarks.entrySet();
        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            Map.Entry entry = (Map.Entry) itr.next();
            sum = sum + (int) entry.getValue();
        }
        double avg = (double) sum / feedbackMarks.size();
        return avg;
    }
}