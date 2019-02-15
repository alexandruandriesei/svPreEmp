package adriang.trainer;

public class ManageTrainer {

    public static void main(String[] args) {

        Trainer johndoe = new Trainer("John", "Doe", "Informatica", 5);
        Trainer jackdoe = new Trainer("Jacky", "Eod", "Physics", 14);

        johndoe.addFeedBackMarks("Gicu", 6);
        johndoe.addFeedBackMarks("Mirel", 6);
        johndoe.addFeedBackMarks("Andy", 8);
        jackdoe.addFeedBackMarks("Andrei", 8);
        jackdoe.addFeedBackMarks("Gigi", 7);

        johndoe.getInfo();
        System.out.println("\n");
        jackdoe.getInfo();

    }

}

