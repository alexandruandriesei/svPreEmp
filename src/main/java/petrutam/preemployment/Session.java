package petrutam.preemployment;

import petrutam.student.Student;
import petrutam.trainer.Trainer;

import java.util.*;
import java.util.ArrayList;

public class Session {
    private int Year;
    private String community;
    private String type;
    private List<Student> studentList = new ArrayList<Student>();
    private List<Trainer> trainerList = new ArrayList<Trainer>();


    public Session(int year, String community, String type) {
        Year = year;
        this.community = community;
        this.type = type;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
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

    public void printSession() {
        System.out.println("Community: " + this.getCommunity());
        System.out.println("Year:" + " " + this.getYear());
        System.out.println("Type: " + this.getType());
        if (studentList.isEmpty())
            System.out.println("Student list is empty. ");
        else {
            System.out.print("Student: ");
            for (int i = 0; i < studentList.size(); i++) {
                System.out.print(studentList.get(i).getFirstName() + "  ");
            }
        }
        System.out.println();
        if (trainerList.isEmpty())
            System.out.println("Trainer list is empty");
        else {
            System.out.print("Trainer: ");
            for (int i = 0; i < trainerList.size(); i++) {
                System.out.print(trainerList.get(i).getFirstName() + " ");
            }
        }
        System.out.println();
        System.out.println("Highest average score of students: " + average());
        System.out.println("Best rated petrutam.trainer: " + averageFeedback());
    }

    public void addStudentToList(Student student) {
        this.studentList.add(student);
    }

    public void addTrainerList(Trainer trainer) {
        this.trainerList.add(trainer);
    }

    public float average() {
        float medie = 0;
        float max = 0;

        for (int i = 0; i < studentList.size(); i++) {
            medie = studentList.get(i).calculateAverageDisciplinesScore();
            if (medie > max)
                max = medie;
        }
        return max;
    }

    public float averageFeedback() {
        float medie = 0;
        float max = 0;

        for (int i = 0; i < trainerList.size(); i++) {
            medie = trainerList.get(i).averageFeedback();
            if (medie > max)
                max = medie;
        }
        return max;
    }


}
