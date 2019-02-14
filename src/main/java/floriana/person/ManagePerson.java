package floriana.person;

import floriana.student.Student;
import floriana.trainer.Trainer;

public class ManagePerson {

    public static void main(String[] args) {

        Person s1 = new Student("Florian", "Anghele", true, 12);
        System.out.println(s1);

        ((Student) s1).addDisciplineMark("Java", 10);
        ((Student) s1).addDisciplineMark("Php", 12);

        System.out.println("Average is: " + ((Student) s1).calculateAverageDisciplinesScore());
        System.out.println(((Student) s1).getDisciplineMarks());

        Person t1 = new Trainer("Alex", "Tot Alex", "Sef", 5);
        Person t2 = new Trainer("Alt Alex", "Tot Alt Alex", "Sef-secund", 4);

        ((Trainer) t1).addFeedbackMark(10);
        ((Trainer) t1).addFeedbackMark("gigi", 10);

        System.out.println(t1);
        System.out.println(t2);


    }
}
