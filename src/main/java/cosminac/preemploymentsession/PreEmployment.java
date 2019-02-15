package cosminac.preemploymentsession;

import cosminac.person.trainer.Trainer;
import cosminac.students.Student;

import java.util.ArrayList;
import java.util.List;

public class PreEmployment {

    private int year;
    private String community;
    private String type;
    private List<Student> studentList = new ArrayList<> ();
    private List<Trainer> trainerList = new ArrayList<> ();

    public PreEmployment(int year, String community, String type) {
        this.year = year;
        this.community = community;
        this.type = type;
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

    public String isType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Trainer> getTrainerList() {
        return trainerList;
    }

    public void setTrainerList(List<Trainer> trainerList) {
        this.trainerList = trainerList;
    }

    public void addStudentToProgram(Student student) {
        this.studentList.add(student);
    }

    public void addTrainerToProgram(Trainer trainer) {
        this.trainerList.add(trainer);
    }

    public void highestAverage() {
        float max = 0;
        float average = 0;
        for (int i=0; i <= studentList.size()-1; i++) {
        average = studentList.get(i).calculateAverageDisciplinesScore();
        if(average > max)
            max=average;
        }
        System.out.println("Highest average for student is: " + max);
    }

    public void bestRated() {

        float max = 0;
        float average = 0;
        for (int i=0; i <= trainerList.size()-1; i++) {
            average = trainerList.get(i).calculateTrainersDisciplinesScore();
            if(average > max)
                max=average;
        }
        System.out.println("Average for best rated trainer is: " +max);

    }

    public void display() {
        System.out.println("Program year is " + this.year);
        System.out.println("Community is " + this.community);
        System.out.println("Type is " + this.type);
        System.out.println("Student is: " + this.studentList);
        highestAverage();
        bestRated();
    }
    @Override
    public String toString() {
        return "\n" + "Program year is " +this.year + "\n" + "Community is " +this.community + "\n" + "Type is " +this.type + "\n" + "Student is " +this.studentList + "\n" + "The best rated trainer is " +this.trainerList;

    }

}
