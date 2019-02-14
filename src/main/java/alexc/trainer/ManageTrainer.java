package alexc.trainer;

public class ManageTrainer {
    public static void main(String[] args) {
        Trainer trainer1 = new Trainer("Alex", "Andriesei");
        Trainer trainer2 = new Trainer("Gabriel", "Hrenciuc");

        trainer1.setSpecialization("Automation");
        trainer1.setYearsOfExp(12);

        trainer1.setYearsOfExp(11);

        trainer1.setList("Alex", 10);
        trainer1.setList("Cosmina", 11);
        trainer1.setList("Adrian", 9);
        trainer1.setList("Oana", -1);
        trainer1.setList(6);

        trainer1.getTrainerInfo();

        trainer2.setSpecialization("Automation");
        trainer2.setYearsOfExp(10);


        trainer2.setList("Claudiu", 9);
        trainer2.setList("Cosmina", 8);
        trainer2.setList("Roxana", 7);
        trainer2.setList("Petruta", 2);
        trainer2.setList(9);
        trainer2.getTrainerInfo();
    }
}
