package trainer;


public class ManageTainer {
    public static void main(String[] args) {


        Trainer petruta = new Trainer("Petruta", "Maties", " QA", 1);
        Trainer ana = new Trainer("Ana", "Ceva", "QA", 3);
        ana.printTrainer();
        petruta.printTrainer();
        ana.addFeedback("sabin",6);
        ana.addFeedback("sabina",7);
        ana.addFeedback("gabi",8);
        ana.printTrainer();
        System.out.println(ana.averageFeedback());

    }
}