package madalinacaraza.madalina.trainner;

public class ManageTranner {
    public static void main(String[] args) {
        Trainner mada1 = new Trainner("Madalina" , "Caraza" , 34 , "Feminin", "madalinacaraza@yahoo.com", "Informatica Economica",2);
        Trainner mada2 = new Trainner("Madalina" , "Caraza" , 34 , "Feminin", "madalinacaraza@yahoo.com", "Informatica Economica",6);
        System.out.println(" Trainnerul este" + mada1.getFirstName() + mada1.getLastName() + mada1.getAge()+mada1.getGender()+mada1.getSpecialization()+mada1.getYearsOfExperience()+mada1.getFeedbackMarks());
        mada1.printDetail();
        mada2.printDetail();
        mada1.addFeedback("madalina" , 2);
        mada1.addFeedback("ana", 6);
        mada1.printDetail();

        System.out.println(mada1.calculateAverageFeedbackScore());

    }
}
