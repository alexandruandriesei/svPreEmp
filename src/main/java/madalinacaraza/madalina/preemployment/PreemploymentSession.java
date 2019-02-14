package madalinacaraza.madalina.preemployment;

import madalinacaraza.madalina.trainner.Trainner;
import madalinacaraza.madalina.student.Student;

import java.util.ArrayList;
import java.util.List;

public class PreemploymentSession {
    private int year;
    private String community;
    private String type;
    private List<Student> studentList = new ArrayList<>();
    private List<Trainner> trainnerList = new ArrayList<>();

    public PreemploymentSession(int year, String community, String type) {
        this.year = year;
        this.community = community;
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public String getCommunity() {
        return community;
    }

    public String getType() {
        return type;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public void setType(String type) {
        if (type == "AUTO" || type == "MANUAL")
            this.type = type;
        else
            System.out.println("The type is not valid");
    }

    public void addStudent(Student student) {
        this.studentList.add(student);
    }

    public void addTrainner(Trainner trainner) {
        this.trainnerList.add(trainner);
    }

    public void printProgram() {
        System.out.println("The details of the program :");
        System.out.println("Community: " + this.getCommunity());
        System.out.println("The year is: " + this.getYear());
        System.out.println("The type is: " + this.getType());
        if (studentList.isEmpty())
            System.out.println("The list is empty");
        else {
            System.out.print("Student list: ");
            for (int i = 0; i < studentList.size(); i++) {
                System.out.print(studentList.get(i).getFirstName() + " ");
            }
        }
        System.out.println();
        if (trainnerList.isEmpty())
            System.out.println("The list is empty");
        else {
            System.out.print("Trainner list: ");
            for (int i = 0; i < trainnerList.size(); i++) {
                System.out.print(trainnerList.get(i).getFirstName() + " ");
            }
            System.out.println();
            System.out.println("The highest average is: " + hightestAverage());
            System.out.println("The best trainner score:"  + bestRatedTrainner());
        }
    }

    public float hightestAverage(){
        float max = 0;
        float average = 0;
        for (int i = 0; i <= studentList.size() - 1; i++) {
            average = studentList.get(i).calculateAverageDisciplinesScore();
            if (average > max) {
                max = average;
            }
        }
        return max;
    }

    public float bestRatedTrainner() {
        float max = 0;
        float score = 0;
        for (int i = 0; i < trainnerList.size(); i++) {
            score = trainnerList.get(i).calculateAverageFeedbackScore();
            if (score > max) {
                max = score;
            }
        }
        return max;
    }


}
