package preemployment;

import student.Student;
import trainer.Trainer;

public class ManagePree {


    public static void main(String[] args) {
        Session pro= new Session(2019,"preemployment","Auto") ;

        Student petr = new Student("Petruta", "Maties", true, 8);
        Student mada = new Student("Mada", "Cevaa", true, 7);

        Trainer alex = new Trainer("Alex", "Ceva","QA",5);

        petr.addDisciplineMark("QA",8);
        petr.addDisciplineMark("QB",7);

        mada.addDisciplineMark("QA",10);
        mada.addDisciplineMark("QB",9);

        alex.addFeedback("mada",10);
        alex.addFeedback("flori",9);

        pro.addStudentToList(petr);
        pro.addStudentToList(mada);
        pro.addTrainerList(alex);

        pro.printSession();
    }
}
