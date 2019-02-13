package claudiuc.person;

public class ManagePerson {

    public static void main(String[] args) throws IllegalAccessException {
        Person claudiu = new Person("Claudiu", "Iacob", false);


        claudiu.Afisare();

        claudiu.setAge(20);
        claudiu.setGender("Male");

        claudiu.Afisare();
//        System.out.println(claudiu.getAge());
//        System.out.println(claudiu.getGender());
//
//
        claudiu.setEmailAdress("iacob.claudiu1@gmail.com");
        claudiu.Afisare();

        claudiu.setEmailRestricted(true);

        claudiu.Afisare();
//        claudiu.setEmailRestricted(false);



    }

}
