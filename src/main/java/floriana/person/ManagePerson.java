package floriana.person;

import java.sql.SQLOutput;

public class ManagePerson {

    public static void main(String[] args) {

        Person p1 = new Person("Florian", "Anghele");

        System.out.println(p1);

        p1.setGender("Male");
        System.out.println("Si este " + p1.getGender() + ".");

        p1.setEmailAddress("florian@gmail.com");
        System.out.println("Si are email-ul: " + p1.getEmailAddress());

        p1.setAge(18);
        System.out.println("Si are " + p1.getAge() + " de ani.");
        p1.setEmailRestricted(true);

        System.out.println(p1.printPersonDetails());
    }
}
