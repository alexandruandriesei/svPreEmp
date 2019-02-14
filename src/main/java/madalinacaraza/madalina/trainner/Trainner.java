package madalinacaraza.madalina.trainner;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import madalinacaraza.madalina.person.Person;

import javax.print.DocFlavor;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Trainner extends Person {
    private String specialization;
    private int yearsOfExperience;
    private HashMap<String, Integer> feedbackMarks = new HashMap<>();

    public Trainner(String firstName, String lastName, int age, String gender, String emailAddress, String specialization, int yearsOfExperience) {
        super(firstName, lastName, age, gender, emailAddress);
        this.specialization = specialization;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        if (yearsOfExperience > this.yearsOfExperience)
            this.yearsOfExperience = yearsOfExperience;
        else {
            System.out.println("Cannon add a lower value than the existing one");
        }
    }

    public HashMap<String, Integer> getFeedbackMarks() {
        return feedbackMarks;
    }

    public void setFeedbackMarks(HashMap<String, Integer> feedbackMarks) {
        this.feedbackMarks = feedbackMarks;
    }

    public void printDetail() {
        System.out.println("The details of trainner are :" + " " + getFirstName() + " " + getLastName() + " " + getSpecialization() + " " + getYearsOfExperience() + " Lista fedback-uri: "  + getFeedbackMarks());
    }


    public void addFeedback(String name, int mark) {
        if (mark >= 0 && mark <= 10)
            this.feedbackMarks.put(name, mark);
        else {
            throw new IllegalThreadStateException("Invalid marks");

        }
    }

    public float calculateAverageFeedbackScore() {
        int score = 0;
        int count =0;
        Set set = feedbackMarks.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry)iterator.next();
            score = score + (int) mentry.getValue();
            count += 1;
        }
        float scoreAvarege = (float) score / count;

        return scoreAvarege;


    }
}