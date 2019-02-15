package floriana.trainer;

import floriana.person.Person;


import java.util.HashMap;
import java.util.Map;


public class Trainer extends Person {
    public static int i=0;
    private String specilization;
    private int yearsOfExperience;
    private Map<String, Integer> feedbackMatksFromStudents = new HashMap<>();

    public Trainer(String firstName, String lastName, String specilization, int yearsOfExperience) {
        super(firstName, lastName);
        this.specilization = specilization;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getSpecilization() {
        return specilization;
    }

    public void setSpecilization(String specilization) {
        this.specilization = specilization;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        try {
            if(yearsOfExperience>this.yearsOfExperience)
                this.yearsOfExperience = yearsOfExperience;
            else
                throw new IllegalArgumentException("Error!");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: Anul de experienta trebuie sa fie crescator");
        }

    }

    public Map<String, Integer> getFeedbackMatksFromStudents() {
        return feedbackMatksFromStudents;
    }

    public void setFeedbackMatksFromStudents(Map<String, Integer> feedbackMatksFromStudents) {
        this.feedbackMatksFromStudents = feedbackMatksFromStudents;
    }

    public void addFeedbackMark(int mark) {
        try {
        if(mark>=0 && mark<=10 )
            feedbackMatksFromStudents.put("Anonim#"+(++i),mark);
        else
            throw new IllegalArgumentException("Error!");
    } catch (IllegalArgumentException e) {
        System.out.println("Error: Nota Feedback-ului trebuie sa fie intre 0 si 10!");
    }
    }

    public void addFeedbackMark(String studentName,int mark) {
        try {
            if(mark>=0 && mark<=10 )
                feedbackMatksFromStudents.put(studentName,mark);
            else
                throw new IllegalArgumentException("Error!");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: Nota Feedback-ului trebuie sa fie intre 0 si 10!");
        }
    }

    public float averageFeedbackScore() {
        float averageScore = 0;
        for( Map.Entry<String,Integer> i:feedbackMatksFromStudents.entrySet()) {
            averageScore +=i.getValue();

        }
        return averageScore/feedbackMatksFromStudents.size();
    }


    @Override
    public String toString() {
        return getFirstName() + " " +
                getLastname();
    }
}
