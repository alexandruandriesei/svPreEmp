package roxanac;

import roxanac.person.Person;
import roxanac.preemployment2019.PreemploymentSession;
import roxanac.student.Student;
import roxanac.trainer.Trainer;

public class ManagePerson {

    public static void main(String [] args) {
        Person Person1 = new Person("Roxana", "Cotet", 21, "Feminin", "cotetroxana@gmail.com");
        System.out.println("Studentul este " + Person1.getFirstName() + " " + Person1.getLastName() + " " + "si are varsta " + Person1.getAge() + " " + " sexul " + Person1.getGender() + " si adresa de email " + Person1.getEmail());


        Person1.setFirstName("Aana");
        System.out.println("dupa moddificare");
        System.out.println("Studentul este " + Person1.getFirstName() + " " + Person1.getLastName() + " " + "si are varsta " + Person1.getAge() + " " + " sexul " + Person1.getGender() + " si adresa de email " + Person1.getEmail());


        Person1.setGender("Female");
        Person1.setEmail("test@test.com");

        Student s1 = new Student("Roxana", "Cotet", true, 13);

        s1.addDisciplineMark("Mate", 10);
        s1.addDisciplineMark("Geografie", 9);
        System.out.println(s1.getFirstName() + s1.getLastName() + s1.getDisciplineMarks());

        System.out.println(s1.calculateAverageDisciplineScore());

        Trainer trainer1 = new Trainer("Andr", "Popescu", 35, "Masculin", "popescu.andrei@gmail.com", "automation testing", 6);
        Trainer trainer2 = new Trainer("Ion", "Ionescu", 45, "Feminin", "ionescuion@gmail.com", "manual tasting", 2);

        System.out.println(trainer1.getSpecialization());
        System.out.println(trainer2.getYearsOfExperience());
        Student student1= new Student("Ana", "Ionita", true,13);
        Student student2= new Student("Maria", "Popescu", true,11);
        Student student3= new Student ("Alexandrina", "Lupescu", true,14);
        Student student4= new Student ("Oana","Popa", false, 13);
        Student student5 = new Student ("Xenia","Diac", false, 15);

        PreemploymentSession presession = new PreemploymentSession(2016, "QA", "AUTO");
        PreemploymentSession presession1 = new PreemploymentSession(2011, "QA", "MANUAL");
        PreemploymentSession presession2 = new PreemploymentSession(2010, "QC","AUTO");
        PreemploymentSession presession3= new PreemploymentSession(2019, "QA", "MANUAL");

        Trainer trainer3= new Trainer("Alex", " Diaconu", 23, "Feminin", "ana@yahoo.com", "QA",4);
        Trainer trainer4= new Trainer("Irina", " Popa", 23, "Feminin", "ana@yahoo.com", "QA",4);
        Trainer trainer5= new Trainer("Marius", " Diaconu", 23, "Feminin", "ana@yahoo.com", "QA",4);

        trainer1.addFeedback("Popa",9);
        trainer1.addFeedback("Alex",8);
        trainer2.addFeedback("Oana",10);
        trainer2.addFeedback("Popa",10);
        trainer3.addFeedback("Alex",6);
        trainer3.addFeedback("Oana",7);
        trainer3.addFeedback("Popa",6);
        trainer4.addFeedback("Alex",10);
        trainer5.addFeedback("Oana",9);

        presession.addStundent(student1);
        presession.addStundent(student2);
        presession.addStundent(student3);
        presession.addStundent(student4);
        presession.addStundent(student5);
        presession.addTrainer(trainer1);
        presession.addTrainer(trainer2);
        presession.addTrainer(trainer3);
        presession.addTrainer(trainer4);
        presession.printDetailsProgram();
        System.out.println(presession.toString());

    }
}
