package roxanac.student;

import roxanac.person.Person;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Student extends Person {
    private Boolean graduated;
    private int interviewScore;
    private Map<String, Integer>disciplineMarks = new HashMap<>();
    private static String code;

    public Student(String firstName, String lastName, Boolean graduated, int interviewScore) {
        super(firstName, lastName);
        this.graduated = graduated;
        this.interviewScore = interviewScore;
    }

    public Student(String firstName, String lastName, Boolean graduated, int interviewScore, Map<String, Integer> disciplineMarks) {
        super(firstName,lastName);
        this.graduated = graduated;
        this.interviewScore = interviewScore;
        this.disciplineMarks = disciplineMarks;
    }

    public Map<String, Integer> getDisciplineMarks() {
        return disciplineMarks;
    }


    public void setDisciplineMarks(Map<String, Integer> disciplineMarks) {
        this.disciplineMarks = disciplineMarks;
    }

    public void addDisciplineMark(String disciplineName, Integer valueMark){

        this.disciplineMarks.put(disciplineName, valueMark);

    }
    public float calculateAverageDisciplineScore(){
        int average = 0;
        int count = 0;
        float result;
        Set entrySet = disciplineMarks.entrySet();
        Iterator it = entrySet.iterator();

        while(it.hasNext())
        {
            Map.Entry discipline = (Map.Entry)it.next();
                count ++;
                average = average +  (int)discipline.getValue();
            }
        result = (float)average/count;
        return  result;
    }



    public void addFeedback(Map<String, Integer> feedbackList, Integer feedback){
        if(feedback <= 10 && feedback >= 0)
            feedbackList.put("Anonim", feedback);

    }

}


