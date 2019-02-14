package claudiuc.person.trainer;

public class ManageTrainer {
    public static void main(String[] args) {
        Trainer one = new Trainer("MAte", "Qa", 7, 5);
        Trainer two = new Trainer("Fizica", "Qa Manual", 5, 8);

        one.adaugareFeedback("George",6);
        one.adaugareFeedback("Mate",7);
        System.out.println(one.medie());


    }
}
