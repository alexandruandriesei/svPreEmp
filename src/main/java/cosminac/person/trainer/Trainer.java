package cosminac.person.trainer;

import cosminac.person.Person;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class Trainer extends Person {

    private String specialization;
    private int yearsOfExperience;
    private HashMap<String, Integer> feedbackMarks = new HashMap<>();

    public Trainer(String firstName, String specialization, int yearsOfExperience) {
        super.firstName = firstName;
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
            System.out.println("You cannot add a lower value than the existing one!");
        }

    }

    public void setFeedbackMarks(HashMap<String, Integer> feedbackMarks) {
        this.feedbackMarks = feedbackMarks;
    }

    public HashMap<String, Integer> getFeedbackMarks() {
        return feedbackMarks;
    }

    public void showDetails() {
        System.out.println("First Name is "+super.firstName + "Last Name is "+super.lastName);

    }

    public void addFeedbackMarks(String name, Integer mark) {
        feedbackMarks.put(name, mark);
    }

    public float calculateTrainersDisciplinesScore () {
        int mark = 0;
        int number = 0;

        Set set = feedbackMarks.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry disciplines = (Map.Entry)iterator.next();
            mark+= (int)disciplines.getValue();
            number++;
        }

        return (float)mark/number;
    }

    public String toString() {

        return "trainer: " + getFirstName() + "Specialization: " + getSpecialization() + "Years of experience: " + getYearsOfExperience();
    }

}
