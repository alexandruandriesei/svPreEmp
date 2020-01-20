package anab.Person;

import java.util.*;

public class ManagePerson {
    static void printeazaText(String name) {
        System.out.println("Hello " + name + ".");
    }

    public static void main(String[] args) {
        Person personPerson = new Person("Ion", "Popescu", "Male", 15, "vasilica@gmail.com", false);

        System.out.println("First Name:\t" + personPerson.getFirstName());
        System.out.println("Last Name:\t" + personPerson.getLastName());
        String name = "Buruiana";
        printeazaText("Ana " + name);
        personPerson.setGender("Female");
        System.out.println("Gender type: " + personPerson.getGender());
        String newEmailAddress = "myEmail@google.com";
        personPerson.setEmailAddress(newEmailAddress);
        personPerson.printPersonDetails();
        personPerson.getIsEmailRestricted();

        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("romana", 6);
        map.put("matematica", 8);
        map.put("desen", 10);
        map.put("geografie", 9);
        map.put("muzica", 7);
        map.put("civica", 10);

        System.out.println("--------------------------------------------------------------------------------");
        Student student = new Student("Email", "Popescu", "Male", 21, "email.pop@yahoo.com", false, true, "12", 98, map);

        System.out.println("Check updated discipline marks: ");
        student.addDisciplineMark("biologie", 8);
        System.out.println("biologie = " + map.get("biologie"));
        student.addDisciplineMark("informatica", 9);
        System.out.println("informatica = " + map.get("informatica"));
        map.remove("civica");
        map.replace("geografie", 8);
        System.out.println("Geografie = " + map.get("geografie"));
        System.out.println("Desen = " + map.get("desen"));
        System.out.println("My list is: " + map);
        try {
            int note = map.get("civica");

        } catch (NullPointerException e) {
            System.out.println("it's just an exception named NullPointerException ");
        }
        System.out.println("Average is= " + student.average());
        System.out.println("--------------------------------------------------------------------------------");
        Map<String, Integer> feedbackMarks = new HashMap<String, Integer>();

        Trainer trainer = new Trainer("Silvia ", "Pompilievici ", "Female", 45, "silvia.tr@yahoo.com", false, "Algebra", 4, feedbackMarks);
        System.out.println(trainer.getFirstName() + trainer.getLastName() + "trainer " + trainer.getSpecialization() + " - experienta: " + trainer.getExperience() + " ani");
        trainer.setSpecialization("Matematica");

        trainer.getExperience();
        System.out.println("Added experience for trainer "+trainer.getLastName() +" "+ trainer.getExperience());

        trainer.addExperience("Matematica", 8);
        trainer.getExperience();

        //    @Override
        trainer.addFeedbackMark(10, "Student 1");
        trainer.addFeedbackMark(10, " ");
        trainer.addFeedbackMark(5, "Pompilievici");
        trainer.addFeedbackMark(3, "Chiriac");

       trainer.getFeedbackMarks();
    }
}