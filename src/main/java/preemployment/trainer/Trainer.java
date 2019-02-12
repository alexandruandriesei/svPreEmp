package preemployment.trainer;

import preemployment.person.Person;

import java.util.HashMap;
import java.util.Map;

public final class Trainer extends Person {

    private String specialization;
    private Integer yearsOfExperience;
    private Map<String, Integer> feedbackMarks = new HashMap<>();


    public Trainer(String firstName, String lastName, String specialization, Integer yearsOfExperience) {
        super(firstName, lastName);
        this.specialization = specialization;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public Integer getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(Integer yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public void addStudentFeedback(String studentName, Integer mark) {
        this.feedbackMarks.put(studentName, mark);
    }

    public float calculateAverageFeedbackScore() {
        float marksSum = 0;
        float marksCount = feedbackMarks.size();

        for (Map.Entry<String, Integer> entry : feedbackMarks.entrySet()) {
            marksSum = marksSum + entry.getValue();
        }

        return marksSum / marksCount;
    }
}
