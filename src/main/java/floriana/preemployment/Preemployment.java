package floriana.preemployment;

import floriana.student.Student;
import floriana.trainer.Trainer;

import java.util.ArrayList;
import java.util.List;

public class Preemployment {
    private int year;
    private String community;
    private String type;
    private List<Student> studentsList = new ArrayList<>();
    private List<Trainer> trainersList = new ArrayList<>();

    public Preemployment(int year, String community, String type) {


            this.year = year;
            this.community = community;
            if(type.equals("AUTO") || type.equals("MANUAL"))
                this.type=type;
            else {
                System.out.println(" --------");
                System.out.println("| ERROR: | Type should be AUTO or MANUAL.");
                System.out.println(" --------  Please use setType() method to change it to a good one");
                System.out.println();
            }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
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
        if(type.equals("AUTO") || type.equals("MANUAL"))
            this.type=type;
        else {
            System.out.println(" --------");
            System.out.println("| ERROR: | Type should be AUTO or MANUAL.");
            System.out.println(" --------  Please use setType() method to change it to a good one");
            System.out.println();
        }
    }

    public void addStudentToProgram(Student student) {
        studentsList.add(student);
    }

    public void addTrainerToProgram(Trainer trainer) {
        trainersList.add(trainer);
    }

    public void highestAverageScoreOfStudents() {
        float max=0;
        for (int i = 0; i <= studentsList.size() - 1; i++) {
            if(studentsList.get(i).calculateAverageDisciplinesScore()>max)
                max=studentsList.get(i).calculateAverageDisciplinesScore();
        }
        System.out.println(max);
    }

    public void highestAverageScoreOfTrainers() {
        float max=0;
        for (int i = 0; i <= trainersList.size() - 1; i++) {
            if(trainersList.get(i).averageFeedbackScore()>max)
                max=trainersList.get(i).averageFeedbackScore();
        }
        System.out.println(max);
    }


    @Override
    public String toString() {
        return "Preemployment{" +
                "year=" + year +
                ", community='" + community + '\'' +
                ", type='" + type + '\'' +
                ", studentsList=" + studentsList +
                ", trainersList=" + trainersList +
                '}';
    }
}
