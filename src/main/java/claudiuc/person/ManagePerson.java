package claudiuc.person;

import claudiuc.person.student.Student;

public class ManagePerson {

    public static void main(String[] args) throws IllegalAccessException {
        Person claudiu = new Person("Claudiu", "Iacob", false);
        Student claudiui= new Student();

        claudiu.Afisare();

        claudiu.setAge(20);
        claudiu.setGender("Male");

        claudiu.Afisare();

        claudiu.setEmailAdress("iacob.claudiu1@gmail.com");
        claudiu.Afisare();

        claudiu.setEmailRestricted(true);

        claudiu.Afisare();
        claudiui.adaugareNota("Mate",10);
        claudiui.adaugareNota("Info",8);
        claudiui.adaugareNota("Engleza",5);
        claudiui.adaugareNota("Sport",7);
        claudiui.adaugareNota("Economie",6);
        claudiui.adaugareNota("France",8);
        System.out.println(claudiui.medie());












    }

}
