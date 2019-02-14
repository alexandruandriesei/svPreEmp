package roxanaa.trainer;

import roxanaa.person.Person;
import java.util.HashMap;
import java.util.Map;

public class Trainer extends Person {
    private String specialization;
    private int yearsOfExperience;
    private HashMap<String, Integer> feedbackMarks = new HashMap<String, Integer>();

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

        if (yearsOfExperience < this.yearsOfExperience) {
            System.out.println("Years added cannot be less than the years of experienced earned.");
        } else {
            this.yearsOfExperience = yearsOfExperience;
        }
    }

    public HashMap<String, Integer> getFeedbackMarks() {
        return feedbackMarks;
    }

    public void setFeedbackMarks(HashMap<String, Integer> feedbackMarks) {
        this.feedbackMarks = feedbackMarks;
    }

    public Trainer(String firstName, String lastName, String specialization, int yearsOfExperience) {
        super(firstName, lastName);
        this.specialization = specialization;
        this.yearsOfExperience = yearsOfExperience;
        this.feedbackMarks = feedbackMarks;
    }

    public void addFeedbackMark(String numeStudent, Integer feedbackMark) {

        if (feedbackMark < 0 || feedbackMark > 10) {
            System.out.println("Not in 0-10 range");
        } else {
            this.feedbackMarks.put(numeStudent, feedbackMark);
        }
    };

    public void getAllAboutTrainer() {
        getAllAboutPerson();
        System.out.println(
                        ". Specialization: " + getSpecialization() +
                        ". The years of experience: " + getYearsOfExperience() +
                        ". The Feedback is: " );
    }

    public int calculateAverageFeedbackMarks() {
        int sum = 0;
        for (Map.Entry element : feedbackMarks.entrySet()) {
            sum += (int) element.getValue();
        }
        return sum / feedbackMarks.size();
    }
}
