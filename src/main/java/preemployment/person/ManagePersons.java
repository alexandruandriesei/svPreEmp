package preemployment.person;

import preemployment.person.Person;

public class ManagePersons {

    public static void main(String[] args) {

        Person person1 = new Person("Alex", "Andriesei");

        person1.printPersonalDetails();

        System.out.println("Person 1 decides to share his gender and email\n");

        person1.setGender("male");
        person1.setEmailAddress("some@mail.com");

        person1.printPersonalDetails();

        System.out.println("Person 1 provides age ...\n");

        person1.setAge(25);

        person1.printPersonalDetails();

        System.out.println("Person wants to decrease his age ...\n");

        person1.setAge(20);

        person1.printPersonalDetails();

    }

}
