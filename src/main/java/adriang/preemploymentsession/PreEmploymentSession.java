package adriang.preemploymentsession;

import adriang.student.Student;
import adriang.trainer.Trainer;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class PreEmploymentSession {
    private int year;
    private String community;
    private boolean type;
    private List<Student> studentsList = new ArrayList<>();
    private List<Trainer> trainerList = new ArrayList<>();

    String tbeststudent;

    public PreEmploymentSession(int year, String community, boolean type) {
        this.year = year;
        this.community = community;
        this.type = type;
    }

    public void addStudentList(Student student) {
        studentsList.add(student);
    }

    public List<Student> getStudentsList() {
        return studentsList;
    }

    public List<Trainer> getTrainerList() {
        return trainerList;
    }

    public void addTrainerList(Trainer trainer) {
        trainerList.add(trainer);
    }

    public float maximum() {
        float a = 0;
        for (int i = 0; i < studentsList.size(); i++)
            if (a < studentsList.get(i).calculateAverageDisciplinesScore()) {
                a = studentsList.get(i).calculateAverageDisciplinesScore();
                tbeststudent = getStudentsList().get(i).getFirstName() + " " + getStudentsList().get(i).getLastName();
            }
        return a;
    }
}
