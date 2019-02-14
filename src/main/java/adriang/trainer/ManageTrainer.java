package adriang.trainer;

public class ManageTrainer {

    public static void main(String[] args) {

        Trainer johndoe = new Trainer("John", "Doe", "Informatica", 5);
        Trainer jackdoe = new Trainer("Jacky", "Eod", "Physics", 14);

        johndoe.setFeedBackMarks("Gicu", 6);
        johndoe.setFeedBackMarks("Mirel", 6);
        johndoe.setFeedBackMarks("Andy", 8);
        jackdoe.setFeedBackMarks("Andrei", 8);
        jackdoe.setFeedBackMarks("Gigi", 7);

        johndoe.getInfo();
        System.out.println("\n");
        jackdoe.getInfo();


    }

}

