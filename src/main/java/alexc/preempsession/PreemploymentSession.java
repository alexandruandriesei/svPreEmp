package alexc.preempsession;

import alexc.student.Student;
import alexc.trainer.Trainer;

import java.util.ArrayList;
import java.util.List;

public class PreemploymentSession {
    private int year;
    private String community;
    private String type;
    private List<Student> studentList = new ArrayList<>();
    private List<Trainer> trainerList = new ArrayList<>();

    public PreemploymentSession(int year, String community, String type) {
        this.year = year;
        this.community = community;
        if (type.toUpperCase().equalsIgnoreCase( "MANUAL") || type.toUpperCase().equalsIgnoreCase( "AUTO")) {
            this.type = type;
        } else {
            System.out.println("Type must be AUTO or MANUAL");
        }
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

    public void addStudent(Student student) {
        this.studentList.add(student);
    }

    public void addTrainer(Trainer trainer) {
        this.trainerList.add(trainer);
    }

    public List<Trainer> getTrainerList() {
        return trainerList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public float getHighestAverageMark() {
        float max = 0;
        if (studentList.isEmpty()) {
            return 0;
        } else {
            for (int i = 0; i < studentList.size(); i++) {
                if (studentList.get(i).calculateAverageDisciplinesScore() > max)
                    max = studentList.get(i).calculateAverageDisciplinesScore();
            }
        }
        return max;
    }

    public String getBestRatedTrainer() {
        float max = 0;
        String trainer = "";
        if (trainerList.isEmpty()) {
            return "0";
        } else {
            for (int i = 0; i < trainerList.size(); i++) {
                if (trainerList.get(i).calculateAverageFeedbackScore() > max)
                    max = trainerList.get(i).calculateAverageFeedbackScore();
                trainer = trainerList.get(i).getLastName() + " " + trainerList.get(i).getFirstName();
            }
        }
        return trainer;
    }

    public void getProgramDetails() {
        System.out.println("Year: " + getYear());
        System.out.println("Community: " + getCommunity());
        System.out.println("Type: " + getType());
        System.out.println("Studentii sunt: " + getStudentList());
        System.out.println("Trainerii sunt: " + getTrainerList());
        System.out.println("The highest average score of students is: " + getHighestAverageMark());
        System.out.println("The best rated trainer is: " + getBestRatedTrainer());
    }

    public static void main(String[] args) {
        PreemploymentSession pre = new PreemploymentSession(2019, "Automation", "Manual");
        Student student1 = new Student("Alex", "Caciur", Boolean.TRUE, 21);
        Student student2 = new Student("Adrian", "Grami", Boolean.TRUE, 10);
        pre.addStudent(student1);
        pre.addStudent(student2);
        student1.addDisciplineMark("Biologie", 10);
        student2.addDisciplineMark("Biologie", 9);
        student1.addDisciplineMark("Biologie", 8);
        student2.addDisciplineMark("Biologie", 4);
        student1.setGender("Male");
        student2.setGender("Female");

        Trainer trainer1 = new Trainer("Alex", "Andriesei");
        Trainer trainer2 = new Trainer("Gabriel", "Hrenciuc");

        trainer1.setSpecialization("Automation");
        trainer1.setYearsOfExp(12);
        trainer1.setList("Alex", 10);
        trainer1.setList("Cosmina", 10);
        trainer1.setList("Adrian", 9);
        trainer1.setList("Oana", 1);
        trainer1.setList(6);


        trainer2.setSpecialization("Automation");
        trainer2.setYearsOfExp(10);
        trainer2.setList("Claudiu", 9);
        trainer2.setList("Cosmina", 8);
        trainer2.setList("Roxana", 7);
        trainer2.setList("Petruta", 2);
        trainer2.setList(9);
        pre.addTrainer(trainer1);
        pre.addTrainer(trainer2);
        pre.getProgramDetails();
    }

    @Override
    public String toString() {
        String obj =

                "\n----- Year : " + this.getYear() +
                        "\n----- Community : " + this.getCommunity() +
                        "\n----- Type : " + this.getType() +
                        "\n----- Students : ";
        for (Student student : studentList) {
            obj = obj + student.getFirstName() + " " + student.getLastName() + ", ";
        }


        obj += "----- Greatest Student Average Score : " + this.getHighestAverageMark() + "\n"
                + "----- Best Rated Trainers according to the students' feedback: " +
                this.getBestRatedTrainer();

        return obj;


    }
}

