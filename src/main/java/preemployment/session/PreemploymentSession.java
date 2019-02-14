package preemployment.session;

import preemployment.student.Student;
import preemployment.trainer.Trainer;

import java.util.ArrayList;
import java.util.List;

public class PreemploymentSession {

    private Integer year;
    private String community;
    private String type;
    private List<Student> studentsList = new ArrayList<>();
    private List<Trainer> trainersList = new ArrayList<>();

    public PreemploymentSession(Integer year, String community, String type) {
        this.year = year;
        this.community = community;
        this.type = type;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public List<Student> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(List<Student> studentsList) {
        this.studentsList = studentsList;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void addStudentToProgram(Student student) {
        this.studentsList.add(student);
    }

    public void addTrainerToProgram(Trainer trainer) {
        this.trainersList.add(trainer);
    }

    public float getLowestAverageScore() {
        float lowestAverageScore = 999;
        for (Student student : studentsList) {
            float studentAverage = student.calculateAverageDisciplinesScore();
            if (studentAverage < lowestAverageScore) {
                lowestAverageScore = studentAverage;
            }
        }

        return lowestAverageScore;
    }

    public float getGreatestAverageScore() {
        float greatestAverageScore = 0;
        for (Student student : studentsList) {
            float studentAverage = student.calculateAverageDisciplinesScore();
            if (studentAverage > greatestAverageScore) {
                greatestAverageScore = studentAverage;
            }
        }

        return greatestAverageScore;
    }


    public float getHighestTrainerAverageFeedback() {
        float highestAverageFeedback = 0;
        for (Trainer trainer : this.trainersList) {
            float trainerAverage = trainer.calculateAverageFeedbackScore();
            if (trainerAverage > highestAverageFeedback) {
                highestAverageFeedback = trainerAverage;
            }
        }

        return highestAverageFeedback;
    }

    public List<Trainer> getBestRatedTrainers() {
        List<Trainer> bestTrainersList = new ArrayList<>();

        for (Trainer trainer : this.trainersList) {
            if (trainer.calculateAverageFeedbackScore() == getHighestTrainerAverageFeedback()) {
                bestTrainersList.add(trainer);
            }
        }

        return bestTrainersList;
    }

    public void printPreemploymentDetails() {
        System.out.println("----- Year : " + this.getYear());
        System.out.println("----- Community : " + this.getCommunity());
        System.out.println("----- Type : " + this.getType());
        System.out.print("----- Students : ");
        for (Student student : studentsList) {
            System.out.print(student.getFirstName() + " " + student.getLastName() + ", ");
        }
        System.out.println("\n----- Lowest Student Average Score : " + this.getLowestAverageScore());
        System.out.println("----- Greatest Student Average Score : " + this.getGreatestAverageScore() + "\n");
        System.out.print("----- Best Rated Trainers according to the students' feedback: ");
        for (Trainer trainer : getBestRatedTrainers()) {
            System.out.println(trainer.getFirstName() + " " + trainer.getLastName());
        }
    }
}
