package madalinacaraza.madalina.person;

public class ManagePerson {
    public static void main(String[] args) {
        Person madaPerson = new Person("Madalina" , "Caraza" , 34 , "Feminin", "madalinacaraza@yahoo.com");
        System.out.println("Studentul este " + madaPerson.getFirstName() + " " + madaPerson.getLastName() + " " + "si are varsta " + madaPerson.getAge() + " " + " sexul " + madaPerson.getGender() + " si adresa de email " + madaPerson.getEmailAddress());

        madaPerson.setEmailRestricted(true);

        madaPerson.setFirstName("Aana");
        System.out.println("dupa moddificare");
        System.out.println("Studentul este " + madaPerson.getFirstName() + " " + madaPerson.getLastName() + " " + "si are varsta " + madaPerson.getAge() + " " + " sexul " + madaPerson.getGender() + " si adresa de email " + madaPerson.getEmailAddress());


        madaPerson.setGender("Female");
        madaPerson.informationPerson();
        madaPerson.setEmailAddress("test@test.com");


    }
}
