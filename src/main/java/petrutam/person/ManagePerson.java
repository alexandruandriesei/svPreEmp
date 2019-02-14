package petrutam.person;

import petrutam.student.Student;

public class ManagePerson {
    public static void main(String[] args) {


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
    }
}