package anab.Person;

import java.util.HashMap;
import java.util.Map;

public class ManagePerson {
    static void printeazaText(String name) {
        System.out.println("Hello " + name + ".");
    }

    public static void main(String[] args) {
        Person personPerson = new Person("Ion", "Popescu", "Male", 15, "vasilica@gmail.com", false);

        System.out.println("First Name:\t" + personPerson.getFirstName());
        System.out.println("Last Name:\t" + personPerson.getLastName());
        System.out.println();
        String name = "Buruiana";
        printeazaText("Ana " + name);
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

        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("romana", 6);
        map.put("matematica", 8);
        map.put("desen", 10);
        map.put("geografie", 9);
        map.put("muzica", 7);
        map.put("civica", 10);

        Student student=new Student("Email", "Popescu", "Male", 21, "email.pop@yahoo.com", false, true, "12", 98, map);


        student.addDisciplineMark("biologie", 8);
        student.addDisciplineMark("informatica", 9);
    }
}