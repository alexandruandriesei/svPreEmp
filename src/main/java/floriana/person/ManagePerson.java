package floriana.person;

import floriana.student.Student;
import madalinacaraza.madalina.trainner.Trainner;

public class ManagePerson {

    public static void main(String[] args) {

    Person s1 = new Student("Florian","Anghele",true,12);

        System.out.println(s1);

        ((Student) s1).addDisciplineMark("Java",10);


        ((Student) s1).addDisciplineMark("Php",12);

        System.out.println("Average is: " + ((Student) s1).calculateAverageDisciplinesScore());

        System.out.println(((Student) s1).getDisciplineMarks());
    }

}


