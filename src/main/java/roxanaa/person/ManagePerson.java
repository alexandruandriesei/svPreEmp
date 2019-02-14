package roxanaa.person;

import java.lang.String;
import roxanaa.student.Student;
import roxanaa.trainer.Trainer;

public class ManagePerson {
    public static void main(String[] args) {
        Person roxana = new Person("Roxana", "Ambrozie");

        roxana.setAge(20);
        roxana.setEmailAddress("roxana.ambrozie@softision.ro");
        roxana.setGender("Female");
        roxana.setEmailRestricted(true);

        System.out.println("Numele persoanei este: " + roxana.getFirstName() + " " + roxana.getLastName() +
                ", are " + roxana.getAge() + " de ani. Este " + roxana.getGender() +
                " iar adresa de email este:" + roxana.getEmailAddress() + " " + roxana.getIsEmailRestricted());

        System.out.println("After:");

        roxana.getAllAboutPerson();

        Student roxanaStudent = new Student("Roxana", "Ambrozie", true, 10);
        roxanaStudent.getDisciplineMarks().put("MRCM", 9);
        roxanaStudent.getDisciplineMarks().put("CS", 10);
        roxanaStudent.getDisciplineMarks().put("BD", 10);
        roxanaStudent.getDisciplineMarks().put("MCT", 8);

        roxanaStudent.calculateAverageDisciplineMarks();
        System.out.println(roxanaStudent.calculateAverageDisciplineMarks());
    }
}
