package roxanaa.preemployment;

import roxanaa.student.Student;
import roxanaa.trainer.Trainer;

public class ManagePreemployment {
    public static void main(String[] args) {

        PreemploymentSession preemp = new PreemploymentSession(2019, "QA", "AUTO");

        Student student = new Student("Ana", "Popescu", true, 10);
        preemp.addStudentToList(student);
        student.addDisciplineMark("MRCM", 8);
        student.addDisciplineMark("CS", 10);
        student.addDisciplineMark("BD", 10);
        student.addDisciplineMark("MCT", 8);
        Student daniela = new Student("Daniela", "Popescu", true, 8);
        preemp.addStudentToList(daniela);
        daniela.addDisciplineMark("MRCM", 6);
        daniela.addDisciplineMark("CS", 8);
        daniela.addDisciplineMark("BD", 8);
        daniela.addDisciplineMark("MCT", 6);

        Trainer trainer = new Trainer("Ion", "Popescu", "OOP", 10);
        preemp.addTrainerToList(trainer);
        trainer.addFeedbackMark("Roxana", 10);
        trainer.addFeedbackMark("Ana", 10);
        trainer.addFeedbackMark("Maria", 10);
        Trainer daniel = new Trainer("Daniel", "Ducu", "BD", 9);
        daniel.addFeedbackMark("Roxana", 8);
        daniel.addFeedbackMark("Ana", 8);
        daniel.addFeedbackMark("Maria", 8);
        preemp.addTrainerToList(daniel);

        System.out.println(preemp);
    }
}
