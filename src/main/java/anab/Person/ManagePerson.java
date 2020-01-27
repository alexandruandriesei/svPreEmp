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
        System.out.println("Gender type: " + personPerson.getGender());
        String newEmailAddress = "myemail@google.com";
        personPerson.setEmailAddress(newEmailAddress);
        personPerson.getEmailAddress();
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
        Student student = new Student("Emil", "Popescu", "Male", 21, "email.pop@yahoo.com", false, true, "12", 98, map);
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
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>....1.....>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        Map<String, Integer> feedbackMarks = new HashMap<String, Integer>();
        Trainer trainer = new Trainer("Silvia ", "Pompilievici ", "Female", 45, "silvia.tr@yahoo.com", false, "Algebra", 4, feedbackMarks);
        trainer.setSpecialization("Matematica");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Feedback provided by students for this trainer: ");
        trainer.addFeedbackMark("Ionica", 8);
        trainer.addFeedbackMark(2);
        trainer.addFeedbackMark(3);
        trainer.addFeedbackMark(4);
        trainer.addFeedbackMark(5);
        trainer.addFeedbackMark(6);
        trainer.addFeedbackMark(7);
        trainer.addFeedbackMark("Fanel", 10);
        trainer.addFeedbackMark("Vasile", 7);
        trainer.getFeedbackMarks();
        trainer.printFeedbackMarks();
        trainer.printPersonDetails();
        System.out.println("Average feedback for " + trainer.getLastName() + "= " + trainer.averageFeedback());
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>....2.....>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        Map<String, Integer> feedbackMarks1 = new HashMap<String, Integer>();
        Trainer trainer1 = new Trainer("Eugenius ", "Smartus ", "Male", 30, "eug.Sm@domain.com", false, "Istorie", 5, feedbackMarks1);
        trainer1.setSpecialization("Istorie");
        trainer1.setExperienceYears(5);
        trainer1.addFeedbackMark("Ionica", 3);
        trainer1.addFeedbackMark(3);
        trainer1.addFeedbackMark("Fanel", 3);
        trainer1.addFeedbackMark("Vasile", 3);
        trainer1.getFeedbackMarks();
        trainer1.printFeedbackMarks();
        trainer1.printPersonDetails();
        System.out.println("Average feedback for " + trainer1.getLastName() + "= " + trainer1.averageFeedback());
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>....3.....>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        Map<String, Integer> feedbackMarks2 = new HashMap<String, Integer>();
        Trainer trainer2 = new Trainer("George ", "Thomas ", "GenderFluid", 50, "smileyDude@fun.com", false, "Engleza", 12, feedbackMarks2);
        trainer2.printPersonDetails();
        trainer2.setSpecialization("Engleza");
        trainer2.setExperienceYears(12);
        trainer2.addFeedbackMark("Ionica", 2);
        trainer2.addFeedbackMark(10);
        trainer2.addFeedbackMark("Fanel", 4);
        trainer2.addFeedbackMark("Vasile", 4);
        trainer2.getFeedbackMarks();
        trainer2.printFeedbackMarks();
        trainer2.printPersonDetails();
        System.out.println("Average feedback for " + trainer2.getLastName() + "= " + trainer2.averageFeedback());
    }
}