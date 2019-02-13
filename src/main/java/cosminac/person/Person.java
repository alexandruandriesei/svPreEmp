package cosminac.person;

public class Person {

    protected String firstName;
    protected String lastName;
    private int age;
    private String gender;
    private String emailAddress;
    private boolean isEmailRestricted;

    public Person(String firstName, String lastName, String gender, String emailAddress, Boolean isEmailRestricted) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.emailAddress = emailAddress;
        this.isEmailRestricted = isEmailRestricted;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getEmailAddress() {
        if(!isEmailRestricted()) {
            return emailAddress;
        } else {
            throw new IllegalAccessError("Email address is restricted for this customer! Sorry!");
        }
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isEmailRestricted() {
        return isEmailRestricted;
    }

    public void setEmailRestricted(boolean emailRestricted) {
        isEmailRestricted = emailRestricted;
    }

    public void setGender(String gender) {
        if (gender == "Female" || gender == "Male" || gender == "Other") {
            this.gender = gender;
        } else {
            System.err.println(gender + " is not a valid gender");
        }
    }

    public void setEmailAddress(String emailAddress) {
        if (emailAddress.matches("(?:[a-z0-9!#$%&'*+\\/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+\\/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])"))
            this.emailAddress = emailAddress;
        else
            System.out.println(emailAddress + "This is not a valid email");


    }

    public void PersonDetails() {
        System.out.println(this.firstName);
        System.out.println(this.lastName);
        System.out.println(this.gender);
        System.out.println(this.age);
        System.out.println("Is email restricted option: " + this.isEmailRestricted);
        System.out.println(getEmailAddress());

    }

    public Person() {
    }
}
