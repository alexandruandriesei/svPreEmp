package claudiuc.person;

import claudiuc.person.student.Student;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ManagePerson {

    public static void main(String[] args) throws IllegalAccessException {
//        Person claudiu = new Person("Claudiu", "Iacob", false);
//        Student claudiui= new Student();
//
//
//        claudiu.Afisare();
//
//        claudiu.setAge(20);
//        claudiu.setGender("Male");
//
//        claudiu.Afisare();
//
//        claudiu.setEmailAddress("iacob.claudiu1@gmail.com");
//        claudiu.Afisare();
//
//        claudiu.setEmailRestricted(true);
//
//        claudiu.Afisare();
//        claudiui.adaugareNota("Mate",10);
//        claudiui.adaugareNota("Info",8);
//        claudiui.adaugareNota("Engleza",5);
//        claudiui.adaugareNota("Sport",7);
//        claudiui.adaugareNota("Economie",6);
//        claudiui.adaugareNota("France",8);
//        System.out.println(claudiui.medie());

        ObjectMapper objectMapper = new ObjectMapper();

        try {

            Student student1 = objectMapper.readValue(new File("src/main/resources/claudiu/first.json"), Student.class);
            System.out.println(student1.getFirstName());
            System.out.println(student1.getLastName());
            System.out.println(student1.getAge());



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
          e.printStackTrace();
        }
        System.out.println();


    }

}
