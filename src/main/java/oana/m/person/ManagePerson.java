package oana.m.person;

import oana.m.student.Student;

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
    }
}
