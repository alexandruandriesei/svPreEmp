package adriang.student;

import adriang.person.Person;

import java.util.HashMap;
import java.util.Map;


public class Student extends Person {
    private static String code;
    public Boolean graduated;
    public int interviewScore;
    private HashMap<String, Integer> disciplineMarks = new HashMap<>();

    public Student(String firstName, String lastName, boolean graduated, Integer interviewScore) {
        super(firstName, lastName);
        this.graduated = graduated;
        this.interviewScore = interviewScore;
    }

    public Student(){

    }

    public boolean isGraduated() {
        return graduated;
    }

    public Integer getInterviewScore() {
        return interviewScore;
    }

    public HashMap<String, Integer> getDisciplineMarks() {
        return disciplineMarks;
    }

    public void setGraduated(boolean graduated) {
        this.graduated = graduated;
    }

    public void setInterviewScore(Integer interviewScore) {
        this.interviewScore = interviewScore;
    }

    public void setDisciplineMarks(HashMap<String, Integer> disciplineMarks) {
        this.disciplineMarks = disciplineMarks;
    }

    public void addDisciplineMarks(String discipline, Integer marks) {
        this.disciplineMarks.put(discipline, marks);
    }

    public float calculateAverageDisciplinesScore() {
        float average = 0;
        for (Map.Entry element : disciplineMarks.entrySet()) {
            average += (int) element.getValue();
        }
        float result = 0;
        try {
            result = average / disciplineMarks.size();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return result;
        }

    }

    @Override
    public String toString() {
        return "{Nume Student: '" + getFirstName() + " " + getLastName() + "\'" +
                ", Graduated: " + graduated +
                ", Interview Score: " + "\'" + interviewScore  + "\'" +
                ", Media finala: " + calculateAverageDisciplinesScore() +
                '}' + "\n";
    }

    public static void main(String[] args) {
        Student adrian = new Student("Adrian", "Gramisteanu", true, 8);
        System.out.println(adrian.graduated);
        System.out.println(adrian.interviewScore);
        adrian.addDisciplineMarks("Mate", 321);
        adrian.addDisciplineMarks("Info", 231);
        adrian.addDisciplineMarks("Japoneza", 132);
        adrian.addDisciplineMarks("Test", 99);
        System.out.println("\n" + adrian.getDisciplineMarks());
        System.out.println(adrian.calculateAverageDisciplinesScore());
    }

}
