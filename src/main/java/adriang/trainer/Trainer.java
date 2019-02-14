package adriang.trainer;

import adriang.person.Person;

import java.util.HashMap;
import java.util.Map;

public class Trainer extends Person {
    private String specialization;
    private int yearsOfExperience;
    private HashMap<String, Integer> feedBackMarks = new HashMap<>();


    public Trainer(String firstName, String lastName, String specialization, int yearsOfExperience) {
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

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        if (this.yearsOfExperience < yearsOfExperience) {
            this.yearsOfExperience = yearsOfExperience;
        } else {
            throw new IllegalArgumentException("Please insert a Valid Value.");
        }
    }

    public HashMap<String, Integer> getDisciplineMarks() {
        return feedBackMarks;
    }

    public void setDisciplineMarks(HashMap<String, Integer> disciplineMarks) {
        this.feedBackMarks = disciplineMarks;
    }

    public HashMap<String, Integer> getFeedBackMarks() {
        return feedBackMarks;
    }

    public void setFeedBackMarks(String name, int mark) {
        this.feedBackMarks.put(name, mark);
    }

    public float calculateAverageFeedback() {
        float average = 0;
        for (Map.Entry element : feedBackMarks.entrySet()) {
            average += (int) element.getValue();
        }
        return average / feedBackMarks.size();
    }


    public void getInfo() {
        System.out.println("Numele Trainerului: " + getFirstName() + " " + getLastName());
        System.out.println("Specializarea Trainerului: " + getSpecialization());
        System.out.println("Ani de experienta: " + getYearsOfExperience());
        System.out.println("Student/Feedback: " + getFeedBackMarks());
        System.out.println("Media totala in urma feedback: " + calculateAverageFeedback());
    }

    @Override
    public String toString() {
        return "Trainer: " + "\'" + getFirstName() + " "  +getLastName() + "\'" +
                " All-FeedBack" + feedBackMarks +
                '}' + "\n";
    }
}
