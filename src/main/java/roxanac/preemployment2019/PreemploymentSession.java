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

    public float HighestAverageScore(){
        float maxim = 0;
        float average = 0;
        for ( int i = 0; i< students.size(); i++) {
            average = students.get(i).calculateAverageDisciplineScore();
            if(average > maxim)
                maxim = average;
        }
           return maxim;
    }

    public float bestTrainer(){
        float maxim = 0;
        float average = 0;
        for ( int i = 0; i< trainers.size(); i++) {
            average = trainers.get(i).calculateHighiestAverageFeedbackTrainer();
            if(average > maxim)
                maxim = average;
        }
        return maxim;

    }

    public void printDetailsProgram(){
        System.out.println("Program year:" + this.getYear());
        System.out.println("Community:" + this.getCommunity());
        System.out.println("Type:" + this.getType());
        if(students.size() == 0)
            System.out.println("The Student List is empty!");
        else {
            System.out.println("List of students: ");
            for (int i = 0; i < students.size(); i++) {
                System.out.println(students.get(i).getFirstName() + " ");
                System.out.println(students.get(i).getLastName() + " ");
                System.out.println(students.get(i).getAge() + " ");
                System.out.println(students.get(i).getEmail() + " ");
                System.out.println(students.get(i).getGender() + " ");
            }

        }
        if(trainers.isEmpty())
            System.out.println("The Trainer List is empty!");
        else
        {
            System.out.println("List of trainers: ");
            for (int i = 0; i < trainers.size(); i++) {
                System.out.println(trainers.get(i).getFirstName() + " ");
                System.out.println(trainers.get(i).getLastName() + " ");
                System.out.println(trainers.get(i).getAge() + " ");
                System.out.println(trainers.get(i).getEmail() + " ");
                System.out.println(trainers.get(i).getSpecialization() + " ");
                System.out.println(trainers.get(i).getYearsOfExperience() + " ");
                System.out.println(trainers.get(i).getFeedbackList());
            }
        }

    }
    public String returnStudentList(){
        StringBuilder stringStudent = new StringBuilder();
        for (int i = 0; i < students.size(); i++) {
            stringStudent.append(students.get(i).getFirstName() + " ");
            stringStudent.append(students.get(i).getLastName() + " ");
            stringStudent.append(students.get(i).getAge() + " ");
            stringStudent.append(students.get(i).getEmail() + " ");
            stringStudent.append(students.get(i).getGender() + " ");
        }
        return stringStudent.toString();
    }

    public String returnTrainerList(){

        StringBuilder string = new StringBuilder();
        for (int i = 0; i < trainers.size(); i++) {
            string.append(trainers.get(i).getFirstName() + " ");
            string.append(trainers.get(i).getLastName() + " ");
            string.append(trainers.get(i).getAge() + " ");
            string.append(trainers.get(i).getEmail() + " ");
            string.append(trainers.get(i).getSpecialization() + " ");
            string.append(trainers.get(i).getYearsOfExperience() + " ");
            string.append(trainers.get(i).getFeedbackList());
        }
        return string.toString();
    }
    @Override
    public String toString(){
        String trainerList =  (trainers.isEmpty()) ?"\n The trainer list is empty!": returnTrainerList() + "\n";
        String studentList = (students.isEmpty()) ?"\n The student list is empty!": returnStudentList() +"\n";
        return "\n Program year: " + this.getYear() + "\n " + "\n Community: " + this.getCommunity() + "\n Type: " + this.getType() + "\n" + trainerList + "\n" + studentList + "\n";



    }
}
