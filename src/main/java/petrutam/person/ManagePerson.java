package petrutam.person;
import com.fasterxml.jackson.databind.ObjectMapper;
import petrutam.student.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;


public class ManagePerson {
    public static void main(String[] args)  {


        Person petruta = new Person("Petruta", "Maties");
        Student petr = new Student("Petruta", "Maties", true, 8);

        petruta.setAge(22);
        petruta.setEmailAddress("petruta@astext.com");
        petruta.setGender('F');
        petruta.setEmailRestricted(false);
        petruta.printPersonDetails();
        petr.addDisciplineMark("python", 8);
        petr.addDisciplineMark("java", 10);
        petr.addDisciplineMark("ml", 9);
        System.out.println(petr.calculateAverageDisciplinesScore());

       /* ObjectMapper my_obj = new ObjectMapper();
       try {
            my_obj.writeValue(new File("C:\\svPreEmp\\src\\main\\resources\\petruta\\student.json"), petr);
            String myJsonAsStrnig =my_obj.writeValueAsString(petr);
        }
        catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }



        try {
            Student student = my_obj.readValue(new File("C://svPreEmp/src/main/resources/petruta/student.json"), Student.class);
        }
        catch (FileNotFoundException fe) {
            fe.printStackTrace();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }

*/
    }
}