package alexc.student;

import alexc.person.Person;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static java.lang.Boolean.TRUE;

public class Student extends Person {
    private Boolean graduated;
    private Integer interviewScore;
    private HashMap<String, Integer> disciplineMarks = new HashMap<>();

    public Student(String firstName, String lastName, Boolean graduated, Integer interviewScore) {
        super(firstName, lastName);
        this.graduated = graduated;
        this.interviewScore = interviewScore;
    }

    public Boolean getGraduated() {
        return graduated;
    }


    public Integer getInterviewScore() {
        return interviewScore;
    }

    public HashMap<String, Integer> getDisciplineMarks() {
        return disciplineMarks;
    }

    public void addDisciplineMark(String discipline, Integer mark) {
        this.disciplineMarks.put(discipline, mark);
    }

    public float calculateAverageDisciplinesScore() {
        float markSum = 0;
        float marksCount = disciplineMarks.size();
        Set set = disciplineMarks.entrySet();
        for (Map.Entry<String, Integer> entry : disciplineMarks.entrySet()) {
            markSum += (float) entry.getValue();
        }
        if (disciplineMarks.size() == 0) {
            return 0;
        } else {
            return markSum / marksCount;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student : \n").append("{").append("\n\t").append("  FirstName: ").append(this.getFirstName())
                .append("\n\t").append("  LastName: ").append(this.getLastName())
                .append("\n\t").append("  Age:").append(this.getAge())
                .append("\n\t").append("  Gender:").append(this.getGender());
        if ((this.getEmailRestricted() != null)&& (this.getEmailRestricted())) {
            sb.append("  EmailAddress: #Confidential information#");
        } else {
            sb.append("\n\t").append("  EmailAddress:").append(this.getEmailAddress());
        }
        sb.append("\n\t").append("  IsEmailRestricted:").append(this.getEmailRestricted())
                .append("\n\t").append("  Graduated:").append(this.getGraduated())
                .append("\n\t").append("  InterviewScore:").append(this.getInterviewScore())
                .append("\n\t").append("Discipline marks: ");
        if ((this.getDisciplineMarks() != null) && (this.getDisciplineMarks().size() <= 0)) {
            sb.append("None");
        } else {
            for (Map.Entry entry : this.getDisciplineMarks().entrySet()) {
                sb.append("\n\t\t").append(entry.getKey()).append(": ").append(entry.getValue());
            }
        }
        sb.append("\n}");
        return sb.toString();

    }

    public static void main(String[] args) {

        Student alex = new Student("Alex", "Caciur", TRUE, 5);
        alex.setGender("Male");
        System.out.println("Name: " + alex.getLastName() + " " + alex.getFirstName());
        System.out.println("Gender: " + alex.getGender());
        System.out.println("Graduated: " + alex.getGraduated());
        System.out.println("Interview score: " + alex.getInterviewScore());

        alex.addDisciplineMark("Biologie", 10);
        alex.addDisciplineMark("Info", 8);
        alex.addDisciplineMark("Algebra", 7);
        alex.addDisciplineMark("Geometrie", 3);
        alex.addDisciplineMark("Matematica", 4);

        System.out.println("Disciplines-grades: " + alex.getDisciplineMarks());

        alex.calculateAverageDisciplinesScore();


    }
}
