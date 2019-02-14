package madalinacaraza.madalina.preemployment;


import madalinacaraza.madalina.student.Student;
import madalinacaraza.madalina.trainner.Trainner;

public class ManagePreemployment {
    public static void main(String[] args) {
        Student student1= new Student("Ana", "Ionita", true,13);
        Student student2= new Student("Maria", "Popescu", true,11);
        Student student3= new Student ("Alexandrina", "Lupescu", true,14);
        Student student4= new Student ("Oana","Popa", false, 13);
        Student student5 = new Student ("Xenia","Diac", false, 15);


        PreemploymentSession presession = new PreemploymentSession(2016, "QA", "AUTO");
        PreemploymentSession presession1 = new PreemploymentSession(2011, "QA", "MANUAL");
        PreemploymentSession presession2 = new PreemploymentSession(2010, "QC","AUTO");
        PreemploymentSession presession3= new PreemploymentSession(2019, "QA", "MANUAL");
        presession.addStudent(student1);
        presession.addStudent(student2);
        presession.addStudent(student3);
        presession.addStudent(student4);


        Trainner trainer1= new Trainner("Alex", " Diaconu", 23, "Feminin", "ana@yahoo.com", "QA",4);
        Trainner trainer2= new Trainner("Irina", " Popa", 23, "Feminin", "ana@yahoo.com", "QA",4);
        Trainner trainer3= new Trainner("Marius", " Diaconu", 23, "Feminin", "ana@yahoo.com", "QA",4);
        presession.addTrainner(trainer1);
        presession.addTrainner(trainer2);
        presession.addTrainner(trainer3);

        student1.addDisciplineMark("Mate", 5);
        student1.addDisciplineMark("Java",10);
        student2.addDisciplineMark("Romana",6);

        trainer1.addFeedback("Popa",9);
        trainer1.addFeedback("Alex",8);
        trainer1.addFeedback("Oana",9);

        presession.addStudent(student2);
        presession.addStudent(student1);
        presession.printProgram();




    }
}
