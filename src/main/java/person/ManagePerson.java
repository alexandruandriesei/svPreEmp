package person;

public class ManagePerson {

    public static void main(String[]args){
        Person oanaPerson=new Person("Oana","Maxim", 22,"Female","oana/maxim@softvision.ro");
        System.out.println("Numele persoanei este "+oanaPerson.getFirstName()+ " "+oanaPerson.getLastName());
        System.out.println("Genul persoanei este "+oanaPerson.getGender());
        oanaPerson.setEmailAddress("alaBalaPortocala");
        oanaPerson.setIsEmailRestricted(false);
        System.out.println(oanaPerson.getIsEmailRestricted());
        oanaPerson.showDetails();
    }
}
