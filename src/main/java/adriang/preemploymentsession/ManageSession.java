package adriang.preemploymentsession;

import adriang.student.Student;
import adriang.trainer.Trainer;

public class ManageSession {

    public static void main(String[] args) {

        // Default Student
        Student adrian = new Student("Adrian", "Gramisteanu", true, 8);
        adrian.addDisciplineMarks("Mate", 4);
        adrian.addDisciplineMarks("Info", 8);
        adrian.addDisciplineMarks("Japoneza", 6);
        adrian.addDisciplineMarks("Test", 5);

        // Default Trainer
        Trainer johndoe = new Trainer("John", "Doe", "Informatica", 5);
        johndoe.setFeedBackMarks("Gicu", 6);
        johndoe.setFeedBackMarks("Mirel", 6);
        johndoe.setFeedBackMarks("Andy", 8);


        PreEmploymentSession list = new PreEmploymentSession(1, "teest", true);
        list.addStudentList(adrian);

        list.addStudentList(new Student("Andrei", "Popescu", true, 3));
        list.getStudentsList().get(1).addDisciplineMarks("Franceza", 7);
        list.getStudentsList().get(1).addDisciplineMarks("Japoneza", 6);


        list.addStudentList(new Student("Alexandru", "Preda", true, 7));
        list.getStudentsList().get(2).addDisciplineMarks("Franceza", 10);
        list.getStudentsList().get(2).addDisciplineMarks("Japoneza", 7);


        list.addTrainerList(johndoe);

        list.addTrainerList(new Trainer("Mircea", "Boss", "OOP", 7));
        list.getTrainerList().get(1).setFeedBackMarks("Prezentare", 5);
        list.getTrainerList().get(1).setFeedBackMarks("Code", 5);


        list.addTrainerList(new Trainer("Grigore", "Ureche", "Tesst", 5));
        list.getTrainerList().get(2).setFeedBackMarks("Test", 9);
        list.getTrainerList().get(2).setFeedBackMarks("PocPocPoc", 10);


        System.out.println("Avem un numar de " + list.getStudentsList().size() + " studenti!" + "\n" + list.getStudentsList());
        System.out.println("Cea mai mare medie este de " + list.maximum() + " iar studentul este " + list.tbeststudent + "." + "\n\n");

        System.out.println(list.getTrainerList());


    }

}

