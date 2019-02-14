package cosminac.person;

import cosminac.person.trainer.Trainer;
import students.Student;

public class ManagePerson {

    public static void main(String[] args) {
        Person cosminaPerson = new Person("Cosmina", "Chirila", "Female", "something@something.com", false);
        System.out.println("The person name is " + cosminaPerson.getFirstName() + cosminaPerson.getLastName());

        cosminaPerson.setGender("Female");

        cosminaPerson.setEmailAddress("something@something.com");


        cosminaPerson.PersonDetails();

//        cosminaPerson.isEmailRestricted();

        Student cosmina = new Student( "Cosmina", "Chirila", true, 1);
        cosmina.addDisciplineMark("Info", 10);
        cosmina.addDisciplineMark("Biology", 6);
        cosmina.addDisciplineMark("Geography", 5);
        System.out.println(cosmina.getDisciplineMarks());
        System.out.println(cosmina.calculateAverageDisciplinesScore());


        Trainer trainer1 = new Trainer("Alex", "Math", 6);
        Trainer trainer2 = new Trainer("Gabi", "Biology", 4);
        trainer1.showDetails();
        trainer2.showDetails();
        trainer1.addFeedbackMarks("Alex", 9);
        trainer2.addFeedbackMarks("Gabi", 10);
        System.out.println(trainer1.getFeedbackMarks());
        trainer1.setYearsOfExperience(5);

        

    }



}





