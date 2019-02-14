package oana.m.person;

import oana.m.student.Student;
import oana.m.trainer.Trainer;

public class ManagePerson {

    public static void main(String[]args){
        Person oanaPerson=new Person("Oana","Maxim", 22,"Female","oana/maxim@softvision.ro");
        System.out.println("Numele persoanei este "+oanaPerson.getFirstName()+ " "+oanaPerson.getLastName());
        System.out.println("Genul persoanei este "+oanaPerson.getGender());
        oanaPerson.setEmailAddress("alaBalaPortocala");
        oanaPerson.setIsEmailRestricted(false);
        System.out.println(oanaPerson.getIsEmailRestricted());
        oanaPerson.showDetails();

        Student s=new Student("Oana","Max",true,7);
        s.addDisciplineMark("Matematica",10);
        s.addDisciplineMark("Info",6);
        s.addDisciplineMark("Info",7);
        s.addDisciplineMark("bio",8);
        s.afiseaza();
        System.out.println("Media este: "+s.calculateAverageDisciplineScore());

        Trainer alex=new Trainer("Alex","A","Automation",8);
        alex.seeTrainer();
        alex.getSpecialization();
        alex.getYearsOfExperience();
        alex.setSpecialization("Everything");
        alex.setYearsOfExperience(5);
        alex.adaugareFeedback("h",-25);
        System.out.println(alex.getFeedbackMarks());
        alex.seeTrainer();

            Trainer t1=new Trainer("Gabi","H","Aut",5);
            Trainer t2=new Trainer("Andreea","R","Manual",7);
            t1.seeAllDetails();
            t2.seeAllDetails();


    }
}
