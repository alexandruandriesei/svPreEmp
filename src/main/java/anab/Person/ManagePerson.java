package anab.Person;

public class ManagePerson {

    static void printeazaText(String name) {
        System.out.println("Hello!" + name);
    }

    static int Sum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    /* static int Sum(int a, int b, int c) {
         return a + b + c;
     }
 */
    public static void main(String[] args) {
        Person personPerson = new Person("Ion", "Popescu", "Gender", 15, "EmailAddress");// create an object of Person class

        System.out.println("First Name:\t" + personPerson.getFirstName());
        System.out.println("Last Name:\t" + personPerson.getLastName());
        String name = "Buru";
        printeazaText("Ana" + name);
        int Sum, Sum1;
        //  Sum= Sum(12, 13);
        System.out.println("Suma a 2 nr= " + Sum(12, 13));
        // Sum1 = Sum(1, 2, 3);
        //System.out.println("Sum a 3 nr=" + Sum1);

        personPerson.setGender("testare");
        System.out.println("Gender type: " + personPerson.getGender());

        String newEmailAddress = "myEmail@google.com";
        personPerson.setEmailAddress(newEmailAddress);
       // System.out.println("Email valid");

    }

}


