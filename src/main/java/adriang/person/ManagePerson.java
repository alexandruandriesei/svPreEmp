package adriang.person;

import adriang.student.Student;
import adriang.trainer.Trainer;

public class ManagePerson {

    public static void main(String[] args) {

        Person adrian = new Person("Adrian", "Gramisteanu");
        adrian.setAge(25);
        adrian.setEmailAddress("adrian@astext.com");
        adrian.setGender('M');
        adrian.setEmailRestricted(false);
        adrian.printPersonDetails();

    }

}

