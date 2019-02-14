package roxanaa.preemployment;

import java.util.ArrayList;
import java.util.List;

import roxanaa.student.Student;
import roxanaa.trainer.Trainer;

import java.lang.String;


public class PreemploymentSession {
    private int year;
    private String community;
    private String type;
    private List<Student> studentList = new ArrayList<>();
    private List<Trainer> trainerList = new ArrayList<>();

    public void setType(String type) {
        if (type == "AUTO" || type == "MANUAL") {
            this.type = type;
        } else {
            System.err.println("Not a valid type");
        }
    }

    public void addStudentToList(Student student) {
        this.studentList.add(student);
    }

    public void addTrainerToList(Trainer trainer) {
        this.trainerList.add(trainer);
    }

    public PreemploymentSession(int year, String community, String type) {
        this.year = year;
        this.community = community;
        this.type = type;
    }

    public float highestAverageScore(){
        float mediaMaxima = 0;
        for (int i=0; i<studentList.size(); i++ ){
            if (mediaMaxima< studentList.get(i).calculateAverageDisciplineMarks()) {
                mediaMaxima=studentList.get(i).calculateAverageDisciplineMarks();
            }
        }
        return mediaMaxima;
    }

    public float bestRatedTrainer(){
        float trainerMaxim = 0;
        for (int i=0; i<trainerList.size(); i++ ){
            if (trainerMaxim< trainerList.get(i).calculateAverageFeedbackMarks()) {
                trainerMaxim=trainerList.get(i).calculateAverageFeedbackMarks();
            }
        }
        return trainerMaxim;
    }

    @Override
    public String toString () {
       return "Programul de preEmployment pe " +community +" din anul " + year + " pe " + type
               + " contine urmatorii studenti: " + "\n" + studentList + "\n" + "si " + "urmatorii traineri: " + trainerList +
               "\n" + "Media maxima a elevilor este: " + highestAverageScore() + "\n"+
               "Media maxima a trainerilor este: " + bestRatedTrainer();
    }

}
