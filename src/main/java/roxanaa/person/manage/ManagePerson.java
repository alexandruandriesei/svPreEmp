package roxanaa.person.manage;
import roxanaa.person.Person;
import java.lang.String;


public class ManagePerson {
    public static void main(final String[] args) {
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
    }

}
