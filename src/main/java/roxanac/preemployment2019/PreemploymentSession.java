package roxanac.preemployment2019;

import roxanac.student.Student;
import roxanac.trainer.Trainer;

import java.util.ArrayList;
import java.util.List;

public class PreemploymentSession {
    private Integer Year;
    private String Community;
    private String type;
    private List<Student> students = new ArrayList<Student>();
    private List<Trainer> trainers = new ArrayList<Trainer>();

    public PreemploymentSession(Integer year, String community, String type) {
        Year = year;
        Community = community;
        this.type = type;
    }

    public Integer getYear() {
        return Year;
    }

    public void setYear(Integer year) {
        Year = year;
    }

    public String getCommunity() {
        return Community;
    }

    public void setCommunity(String community) {
        Community = community;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        switch (type.toUpperCase()) {
            case "auto":
                this.type = type;
                break;
            case "manual":
                this.type = type;
                break;
            default: {
                this.type = "Invalid type";
                System.out.println("Introduce a valid type(auto/manual)!");
            }
        }
    }
    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Trainer> getTrainers() {
        return trainers;
    }

    public void setTrainers(List<Trainer> trainers) {
        this.trainers = trainers;
    }
    public void addStundent(Student student){
        this.students.add(student);
    }
    public void addTrainer(Trainer trainer){
        this.trainers.add(trainer);
    }

}
