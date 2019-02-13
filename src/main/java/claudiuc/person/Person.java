package claudiuc.person;

public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String emailAdress;
    private Boolean emailRestricted;

    public Person() {
    }

    public Boolean isEmailRestricted() {
        return this.emailRestricted;
    }

    public void setEmailRestricted(Boolean emailRestricted) {
        this.emailRestricted = emailRestricted;
    }

    public Person(String firstName, String lastName, Boolean emailRestricted) {
        this.firstName = firstName;
        this.lastName = lastName;
    //    this.emailRestricted = emailRestricted;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void Afisare() throws IllegalAccessException {
        System.out.println(this.age + " " + " " + this.lastName + " " + this.firstName + " " + this.gender + " " + this.emailRestricted);


    }

    public String getGender() {

        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;

    }



    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
        String regex = "(?:[a-z0-9!#$%&'*+\\/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+\\/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])";
        if (emailAdress.matches(regex))
            System.out.println("Valid" + " " + "Your email is " + " " + emailAdress);
        else System.out.println("Invalid");


    }


}
