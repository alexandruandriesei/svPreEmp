package alexc.trainer;

import alexc.person.Person;
import java.util.HashMap;
import java.util.Map;

public class Trainer extends Person {
    private String specialization;
    private int yearsofexp;
    private HashMap<String, Integer> list = new HashMap<>();

    public Trainer(String firstName, String lastName) {
        super(firstName, lastName);
    }


    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setYearsOfExp(int yearsofexp) {
        if (this.yearsofexp > yearsofexp)
            System.out.println("Cannot add a lower value than the existing one");
        else this.yearsofexp = yearsofexp;
    }

    public String getSpecialization() {
        return specialization;
    }

    public int getYearsofexp() {
        return yearsofexp;
    }

    public void setList(String name, Integer mark) {
        if (mark > 10 || mark < 0)
            System.out.println(mark + " is an invalid mark. Choose a value from 0-10: ");
        else this.list.put(name, mark);
    }

    public void setList(Integer mark) {
        if (mark > 10 || mark < 0)
            System.out.println(mark + " is an invalid mark. Choose a value from 0-10: ");
        else {
            this.list.put("Anonim", mark);
        }
    }

    public HashMap<String, Integer> getList() {
        return list;
    }

    public float calculateAverageFeedbackScore() {

        float marksSum = 0;
        float marksCount = list.size();

        for (Map.Entry<String, Integer> entry : list.entrySet()) {
            marksSum = marksSum + entry.getValue();
        }
        return marksSum / marksCount;
    }

    public void getTrainerInfo() {
        System.out.println("Trainer name: " + getFirstName() + " " + getLastName());
        System.out.println("Trainer specialization: " + getSpecialization());
        System.out.println("Years of experience: " + getYearsofexp());
        System.out.println("Student Feedback: " + getList());
        System.out.println("Average feedback mark: " + calculateAverageFeedbackScore());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
