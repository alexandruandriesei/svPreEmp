package roxanac;

import roxanac.person.Person;
import roxanac.student.Student;
import roxanac.trainer.Trainer;

import static java.lang.System.*;

public class ManagePerson {

    public static void main(String [] args) {
        Person Person1 = new Person("Roxana", "Cotet", 21, "Feminin", "cotetroxana@gmail.com");
        out.println("Studentul este " + Person1.getFirstName() + " " + Person1.getLastName() + " " + "si are varsta " + Person1.getAge() + " " + " sexul " + Person1.getGender() + " si adresa de email " + Person1.getEmail());


        Person1.setFirstName("Aana");
        out.println("dupa moddificare");
        out.println("Studentul este " + Person1.getFirstName() + " " + Person1.getLastName() + " " + "si are varsta " + Person1.getAge() + " " + " sexul " + Person1.getGender() + " si adresa de email " + Person1.getEmail());


        Person1.setGender("Female");
        Person1.setEmail("test@test.com");

        Student s1 = new Student("Roxana", "Cotet", true, 13);

        s1.addDisciplineMark("Mate", 10);
        s1.addDisciplineMark("Geografie", 9);
        out.println(s1.getFirstName() + s1.getLastName() + s1.getDisciplineMarks());

        out.println(s1.calculateAverageDisciplineScore());

        Trainer trainer1 = new Trainer("Andr", "Popescu", 35, "Masculin", "popescu.andrei@gmail.com", "automation testing", 6);
        Trainer trainer2 = new Trainer("Ion", "Ionescu", 45, "Feminin", "ionescuion@gmail.com", "manual tasting", 2);


        out.println(trainer1.getSpecialization());
        out.println(trainer2.getYearsOfExperience());
    }
}
