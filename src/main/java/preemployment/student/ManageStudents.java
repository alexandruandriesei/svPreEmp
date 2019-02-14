package preemployment.student;

public class ManageStudents {

    public static void main(String[] args) {

        Student student1 = new Student("Chuck", "Norris", true, 10);

        student1.printPersonalDetails();

        student1.addDisciplineMark("Test Cases", 10);
        student1.addDisciplineMark("Test Plan", 12);
        student1.addDisciplineMark("IntelliJ", 25);

        student1.printPersonalDetails();

        System.out.println("Average Disciplines Score: " + student1.calculateAverageDisciplinesScore());

    }

}
