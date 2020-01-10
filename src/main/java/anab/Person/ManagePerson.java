package anab.Person;

public class ManagePerson {

    static void printeazaText(String name) {
        System.out.println("Hello!" + name);
    }

    public static void main(String[] args) {
        Person personPerson = new Person("Ion", "Popescu", "Male", 15, "vasilica@gmail.com", false);

        System.out.println("First Name:\t" + personPerson.getFirstName());
        System.out.println("Last Name:\t" + personPerson.getLastName());
        System.out.println();
        String name = "Buruiana";
        printeazaText("Ana " + name+".");
        System.out.println();

        personPerson.setGender("Male");
        System.out.println("Gender type: " + personPerson.getGender());
        System.out.println();

        String newEmailAddress = "myEmail@google.com";
        personPerson.setEmailAddress(newEmailAddress);
        System.out.println();

        personPerson.printPersonDetails();
        System.out.println();

        personPerson.getIsEmailRestricted();

    }
}

