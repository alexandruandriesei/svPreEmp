package adriang.person;

public class ManagePerson {

    public static void main(String[] args) {
        Person adrian = new Person("Adrian", "Gramisteanu");
        adrian.setAge(25);
        //adrian.setEmailAddress("adrian@astext.com");
        adrian.setGender('M');
        adrian.setIsEmailRestricted(true);
        adrian.printPersonDetails();
    }


}

