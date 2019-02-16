package alexc.person;

import static java.lang.Boolean.*;

public class ManagePerson {

    public static void main(String[] args) {

        Person alex = new Person("Alex", "Caciur");
        alex.setFirstName("Alex");
        alex.setLastName("Caciur");
        alex.setAge(23);
        alex.setGender("Male");
        alex.setEmailAddress("caciuralex@gmail.com");
        alex.setEmailRestricted(FALSE);
//        alex.getInfo();
        System.out.println(alex);
    }
}