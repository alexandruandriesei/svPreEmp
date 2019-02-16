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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Trainer : \n").append("{").append("\n\t").append("  FirstName: ").append(this.getFirstName())
                .append("\n\t").append("  LastName: ").append(this.getLastName())
                .append("\n\t").append("  Age:").append(this.getAge())
                .append("\n\t").append("  Gender:").append(this.getGender());
        if ((this.getEmailRestricted() != null)&& (this.getEmailRestricted())) {
            sb.append("  EmailAddress: #Confidential information#");
        } else {
            sb.append("\n\t").append("  EmailAddress:").append(this.getEmailAddress());
        }
        sb.append("\n\t").append("  IsEmailRestricted:").append(this.getEmailRestricted())
                .append("\n\t").append("  Specialization:").append(this.getSpecialization())
                .append("\n\t").append("  Years of experience:").append(this.getYearsofexp())
                .append("\n\t").append("Students feedback marks: ");
        if ((this.getList() != null) && (this.getList().size() <= 0)) {
            sb.append("None");
        } else {
            for (Map.Entry entry : this.getList().entrySet()) {
                sb.append("\n\t\t").append(entry.getKey()).append(": ").append(entry.getValue());
            }
        }
        sb.append("\n}");
        return sb.toString();

    }
}
