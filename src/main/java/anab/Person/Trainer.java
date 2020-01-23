package anab.Person;

import org.apache.commons.lang3.RandomStringUtils;
import java.util.*;

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
    public int getExperienceYears() {
        return this.experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        if (experienceYears != 0 && experienceYears > 0 && experienceYears >= this.experienceYears) {
            experienceYears = this.experienceYears+experienceYears;
            System.out.println("Trainer has " + experienceYears + " years of experience on " + this.specialization);
        } else {
            System.out.println("Add valid value for years of experience= ");
        }
    }

    public void addFeedbackMark(String name, int feedback) {
        if (!name.isEmpty() && (feedback > 0 && feedback <= 10)) {
            System.out.println("Student: " + "Feedback note= " + feedback + ",specializ =  " + this.specialization);
        } else {
            System.out.println("Give a feedback mark from 0 to 10 ");
        }
        this.feedbackMarks.put(name, feedback);
    }
//Overload method
    public void addFeedbackMark(int feedback) {
       String test= RandomStringUtils.randomNumeric(4);
       if(feedback>0 && feedback<=10){
           System.out.println("Anonymous."+ test+ this.specialization +"feedback note= "+ feedback);
       }else{
           System.out.println("Give a feedback mark from 0 to 10 ");
       }
    /*    Random random=new Random();
        if (feedback > 0 && feedback <= 10) {
            System.out.println("Student: Anonymous" + random.nextInt(100) + " feedback note= " + feedback + ",specializ =  " + this.specialization);
        } else {
            System.out.println("Give a feedback mark from 0 to 10 ");
        }

     */
    }

    public void printFeedbackMarks() {
        Set set = feedbackMarks.entrySet();
        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            Map.Entry entry = (Map.Entry) itr.next();
            System.out.println("FeedbackMarks: " + entry.getKey() + " " + entry.getValue());
        }
    }

    public Map<String, Integer> getFeedbackMarks() {
        return this.feedbackMarks;
    }

    @Override
    public void printPersonDetails() {
        super.printPersonDetails();
        System.out.println("Specialization: " + specialization);
        System.out.println("Experienced years: " + experienceYears);
        printFeedbackMarks();
    }

    public double averageFeedback() {
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