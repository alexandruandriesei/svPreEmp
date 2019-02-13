package adriang.person;

public class ManagePerson {

    public static void main(String[] args) {
        Person adrian = new Person ("Adrian","Gramisteanu");
        adrian.setAge(25);
        adrian.setEmailAddress("adrian@astext.com");
        adrian.setGender('M');
        adrian.setEmailRestricted(false);
        //System.out.println("Persoana este " + adrian.getFirstName() + " " + adrian.getLastName() + " si are " + adrian.getAge() + " ani.");
        //System.out.println("Sex:  " + adrian.getGender());
        //System.out.println("Email:  " + adrian.getEmailAddress());

        adrian.printPersonDetails();                                     // From public void printPersonDetails() (Person.java)
    }

}
