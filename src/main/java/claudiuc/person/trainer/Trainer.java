package claudiuc.person.trainer;

import claudiuc.person.Person;

import java.util.HashMap;
import java.util.Map;

public class Trainer extends Person {


    String specialization;
    String addSpecilization;
    int yearsofExperience;
    int addYearsofExperience;
    HashMap<String, Integer> feedback = new HashMap<>();
    public Trainer()

    {}

    public Trainer(String specialization, String addSpecilization, int yearsofExperience, int addYearsofExperience) {
        this.specialization = specialization;
        this.addSpecilization = addSpecilization;
        this.yearsofExperience = yearsofExperience;
        this.addYearsofExperience = addYearsofExperience;
        System.out.println(this.specialization+this.addSpecilization+this.yearsofExperience+this.addYearsofExperience);

    }

    public void afisaret()
    {

        System.out.println(this.specialization+" "+this.addSpecilization);



    }




    public void adaugareFeedback(String trainer, Integer nota) {
        if (nota>=0 && nota<=10)

        this.feedback.put(trainer, nota);
        else System.out.println("Invalid mark");

        System.out.println(feedback);

    }
    public double medie() {


        double sum = 0;
        for (Map.Entry element : feedback.entrySet()) {
            int sum1 = (int) element.getValue();
            sum += (double) sum1;


        }

        return sum / (double) this.feedback.size();


    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getAddSpecilization() {
        return addSpecilization;
    }

    public void setAddSpecilization(String addSpecilization) {
        this.addSpecilization = addSpecilization;
    }

    public int getYearsofExperience() {
        return yearsofExperience;
    }

    public void setYearsofExperience(int yearsofExperience) {
        this.yearsofExperience = yearsofExperience;
    }

    public int getAddYearsofExperience() {
        return addYearsofExperience;
    }

    public void setAddYearsofExperience(int addYearsofExperience)


    {
        if (addYearsofExperience<this.yearsofExperience)
            System.out.println("Error");

        addYearsofExperience = addYearsofExperience+this.yearsofExperience;
    }


}


