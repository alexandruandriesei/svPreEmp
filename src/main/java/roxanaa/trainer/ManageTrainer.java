package roxanaa.trainer;

import java.util.Map;

public class ManageTrainer {

    public static void main(String[] args) {
        Trainer trainer1 = new Trainer("Ana", "Popescu", "OOP", 5);
        Trainer trainer2 = new Trainer("Maria", "Popovici", "BD", 5);
        Trainer awesomeTrainer = new Trainer("Awesome", "Great", "OOP", 8);

        trainer1.getAllAboutTrainer();
        trainer2.getAllAboutTrainer();
        awesomeTrainer.setYearsOfExperience(10);
        awesomeTrainer.addFeedbackMark("Roxana", 10);
        awesomeTrainer.addFeedbackMark("Ana",8);
        awesomeTrainer.addFeedbackMark("Maria",9);
        System.out.println(awesomeTrainer.getFeedbackMarks());
        System.out.println("Media este: " + awesomeTrainer.calculateAverageFeedbackMarks());
    }

}

