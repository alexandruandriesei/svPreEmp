package anab.Person;

public class ManagePerson {

    static void printeazaText(String name) {
        System.out.println("Hello!" + name);
    }

    public static void main(String[] args) {
        Person personPerson = new Person("Ion", "Popescu", "Gender", 15, "EmailAddress");// create an object of Person class

        System.out.println("First Name:\t" + personPerson.getFirstName());
        System.out.println("Last Name:\t" + personPerson.getLastName());
        String name = "Buru";
        printeazaText("Ana" + name);

        personPerson.setGender("testare");
        System.out.println("Gender type: " + personPerson.getGender());

        String newEmailAddress = "myEmail@google.com";
        personPerson.setEmailAddress(newEmailAddress);
    }

}


