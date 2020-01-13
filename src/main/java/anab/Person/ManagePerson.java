package anab.Person;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.List;
import java.util.LinkedList;

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

        Student student = new Student("Email", "Popescu", "Male", 21, "email.pop@yahoo.com", false, true, "12", 98, map);

        System.out.println("Check discipline marks: ");
        student.addDisciplineMark("biologie", 8);
        student.addDisciplineMark("informatica", 9);
        map.remove("civica");
        map.replace("geografie", 3);

        int note1 = map.get("geografie");

        try {
            int note2 = map.get("civica");

        } catch (NullPointerException e) {
            System.out.println("it's just an exception named NullPointerException ");
        }

        int note3 = map.get("desen");
        System.out.println("Geografie = " + note1);
        System.out.println("Desen = " + note3);

        System.out.println("My list is: " + map);

        Iterator itr = map.entrySet().iterator();
        double[] list = {8, 6, 3, 8, 10, 9, 7};
        double sum = 0;
       while (itr.hasNext()) {
            System.out.println(itr.next() + " ");
              }

        for (int i = 0; i < map.size(); i++) {
                sum = sum + list[i];
            }
            double average= sum/list.length;
            System.out.println("Average is= "+average);


    }
}
