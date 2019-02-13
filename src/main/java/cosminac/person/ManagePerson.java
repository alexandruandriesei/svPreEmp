package cosminac.person;

public class ManagePerson {

    public static void main(String[] args) {
        Person cosminaPerson = new Person("Cosmina", "Chirila", "Female", "something@something.com", true);
        System.out.println("The person name is " + cosminaPerson.getFirstName() + cosminaPerson.getLastName());

        cosminaPerson.setGender("Female");

        cosminaPerson.setEmailAddress("something@something.com");


        cosminaPerson.PersonDetails();

//        cosminaPerson.isEmailRestricted();

    }
}





