package floriana.person;

import floriana.preemployment.Preemployment;
import floriana.student.Student;
import floriana.trainer.Trainer;


public class ManagePerson {

    public static void main(String[] args) {

        Student s1 = new Student("Florian", "Anghele", true, 12);
        Student s2 = new Student("Gigi", "Lent", true, 18);
        System.out.println(s1);

        ((Student) s1).addDisciplineMark("Java", 10);
        ((Student) s1).addDisciplineMark("Php", 12);

        ((Student) s2).addDisciplineMark("Java", 12);
        ((Student) s2).addDisciplineMark("Php", 11);


        System.out.println("Average is: " + ((Student) s1).calculateAverageDisciplinesScore());
        System.out.println(((Student) s1).getDisciplineMarks());

        Trainer t1 = new Trainer("Alex", "Tot Alex", "Sef", 5);
        Trainer t2 = new Trainer("Alt Alex", "Tot Alt Alex", "Sef-secund", 4);

        System.out.println("...................................................................................................");

        ((Trainer) t1).addFeedbackMark(10);
        ((Trainer) t1).addFeedbackMark(9);
        ((Trainer) t1).addFeedbackMark(6);
        ((Trainer) t1).addFeedbackMark("gigi", 10);

        ((Trainer) t2).addFeedbackMark(4);
        ((Trainer) t2).addFeedbackMark(9);
        ((Trainer) t2).addFeedbackMark(7);
        ((Trainer) t2).addFeedbackMark("gigi", 10);

        System.out.println(t1);
        System.out.println(t2);


        System.out.println("...................................................................................................");

        Preemployment p1 = new Preemployment(2019, "QA","AU");
        p1.addStudentToProgram(s1);
        p1.addStudentToProgram(s2);
        p1.addTrainerToProgram(t1);
        p1.addTrainerToProgram(t2);

        System.out.println(p1);

        p1.highestAverageScoreOfStudents();
        p1.highestAverageScoreOfTrainers();
        p1.setType("AUTO");
    }

}


