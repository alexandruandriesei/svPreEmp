package oana.m.trainer;

import oana.m.person.Person;

import java.util.HashMap;

public class Trainer extends Person {
    private String specialization;
    private int yearsOfExperience;
    private HashMap<String, Integer> feedbackMarks = new HashMap<>();

    public Trainer(String firstName, String lastName, String specialization, int yearsOfExperience) {
        this.specialization = specialization;
        this.yearsOfExperience = yearsOfExperience;
        super.firstName = firstName;
        super.lastName = lastName;
    }

    /**
     * cand vreau sa afisez toate detaliile inclusiv cele de la persoana
     *
     * @param firstName din clasa persoana
     * @param lastName din clasa persoana
     * @param age din clasa persoana
     * @param gender din clasa persoana
     * @param emailAddress din clasa persoana
     * @param specialization din clasa trainer
     * @param yearsOfExperience din clasa trainer
     */
    public Trainer(String firstName, String lastName, int age, String gender, String emailAddress, String specialization, int yearsOfExperience) {
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

        if (yearsOfExperience >= this.yearsOfExperience) {
            this.yearsOfExperience = yearsOfExperience;
        } else
            System.out.println("Nu puteti introduce un numar de ani de experienta mai mic decat cel existent");
    }

    public HashMap<String, Integer> getFeedbackMarks() {
        return feedbackMarks;
    }

    public void setFeedbackMarks(HashMap<String, Integer> feedbackMarks) {
        this.feedbackMarks = feedbackMarks;
    }

    public void adaugareFeedback(String nume, int nota) {
        if (nota >= 0 && nota <= 10) {
            feedbackMarks.put(nume, nota);
        } else
            System.out.println("Nota rea!!!");

    }

    public void seeTrainer() {
        System.out.println("Numele trainerului este: " + super.getFirstName() + " " + super.getLastName() + ". Specializarea lui este: " + specialization + " si are " + yearsOfExperience + " ani de experienta" +
                ". Notele pe care le-a primit de la studenti sunt " + getFeedbackMarks());
    }

    public void seeAllDetails() {
        System.out.println("Nume trainer: " + super.firstName + " " + getLastName() + ".   gen: " + getGender() + ".   email address: " + super.getEmailAddress() + ".   Specializare: " + specialization +
                ".   Ani de experienta: " + yearsOfExperience + ".    Feedback marks:" + getFeedbackMarks());
    }

}
