package cosminac.preemploymentsession;

import cosminac.person.trainer.Trainer;
import cosminac.students.Student;

public class ManagePreEmployment {

    public static void main(String[] args) {

       Student student1 = new Student("Cosmina", "Chirila", true, 10);
       Student florian = new Student("Florian", "A", true, 9);

       Trainer trainer1 = new Trainer("Alex", "Math", 6);
       Trainer alex = new Trainer("Alex", "Bio", 8);

       trainer1.addFeedbackMarks("Gabi", 10);
       alex.addFeedbackMarks("John", 9);

       student1.addDisciplineMark("Nume", 6);
       florian.addDisciplineMark("Rox", 8);

       PreEmployment program = new PreEmployment(2016, "QA", "Manual");
       program.addStudentToProgram(student1);
       program.addTrainerToProgram(trainer1);
       program.addTrainerToProgram(alex);
       program.addStudentToProgram(florian);
       program.display();

    }
}