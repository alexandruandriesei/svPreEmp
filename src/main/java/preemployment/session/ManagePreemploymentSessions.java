package preemployment.session;

import preemployment.student.Student;
import preemployment.trainer.Trainer;

public class ManagePreemploymentSessions {

    public static void main(String[] args) {

        // Generate some students
        Student student1 = new Student("Matei", "Stamate", true, 15);
        Student student2 = new Student("Cristina", "Popescu", false, 12);
        Student student3 = new Student("Andrei", "Costin", false, 14);
        Student student4 = new Student("Mariana", "Costantinescu", true, 7);

        // Generate some trainers
        Trainer trainer1 = new Trainer("George", "Damian", "AUTO", 10);
        Trainer trainer2 = new Trainer("Maria", "Popescu", "MANUAL", 12);
        Trainer trainer3 = new Trainer("Andi", "Georgescu", "AUTO", 6);

        // Generate a preemployment session
        PreemploymentSession preemployment2019 = new PreemploymentSession(2019, "QA", "AUTO");

        // Add students to the preemployment session
        preemployment2019.addStudentToProgram(student1);
        preemployment2019.addStudentToProgram(student2);
        preemployment2019.addStudentToProgram(student3);
        preemployment2019.addStudentToProgram(student4);

        // Add Trainers to the preemployment session
        preemployment2019.addTrainerToProgram(trainer1);
        preemployment2019.addTrainerToProgram(trainer2);
        preemployment2019.addTrainerToProgram(trainer3);

        // Add marks for the students on different disciplines
        student1.addDisciplineMark("Jmeter", 15);
        student1.addDisciplineMark("Java", 4);
        student1.addDisciplineMark("Selenium", 19);
        student2.addDisciplineMark("Jmeter", 22);
        student2.addDisciplineMark("Java", 11);
        student2.addDisciplineMark("Selenium", 2);
        student3.addDisciplineMark("Jmeter", 4);
        student3.addDisciplineMark("Java", 3);
        student3.addDisciplineMark("Selenium", 3);
        student4.addDisciplineMark("Jmeter", 18);
        student4.addDisciplineMark("Java", 17);
        student4.addDisciplineMark("Jmeter", 19);

        // Students provide feedback for the trainers
        trainer1.addStudentFeedback(student1.getFirstName(), 5);
        trainer1.addStudentFeedback(student2.getFirstName(), 2);
        trainer1.addStudentFeedback(student3.getFirstName(), 8);
        trainer1.addStudentFeedback(student4.getFirstName(), 7);
        trainer2.addStudentFeedback(student1.getFirstName(), 1);
        trainer2.addStudentFeedback(student2.getFirstName(), 2);
        trainer2.addStudentFeedback(student3.getFirstName(), 2);
        trainer2.addStudentFeedback(student4.getFirstName(), 3);
        trainer3.addStudentFeedback(student1.getFirstName(), 9);
        trainer3.addStudentFeedback(student2.getFirstName(), 10);
        trainer3.addStudentFeedback(student3.getFirstName(), 9);
        trainer3.addStudentFeedback(student4.getFirstName(), 10);

        // Print the details of the preemployment session
        preemployment2019.printPreemploymentDetails();


    }

}
