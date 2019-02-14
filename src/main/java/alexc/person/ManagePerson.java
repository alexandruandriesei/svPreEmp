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
        alex.setEmailRestricted(TRUE);

        //System.out.println("Numele persoanei este: " + alex.getLastName() + " " + alex.getFirstName());
        //System.out.println("Varsta: "+alex.getAge()+" Gender: "+alex.getGender());
        //System.out.println("Emailul este: "+alex.getEmailAddress());

        alex.getInfo();
    }
}