package roxanaa.person;

public class Person {

    protected String firstName;
    protected String lastName;
    private int age;
    private String gender;
    private String emailAddress;
    private Boolean isEmailRestricted;

    public Person() {
    }

    public Person(int age){
        this.age = age;
    }

    public Person(Boolean isEmailRestricted) {
        this.isEmailRestricted = isEmailRestricted;
    }

    public boolean getIsEmailRestricted() {
        return isEmailRestricted;
    }

    public void setEmailRestricted(Boolean emailRestricted) {
        isEmailRestricted = emailRestricted;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<18 || age >100) {
            throw new IllegalArgumentException();
        }
        else if (age < this.age) {
            throw new IllegalArgumentException();
        }
        else
            {
             this.age = age;
            }
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender == "Female" || gender == "Male" || gender == "Other") {
            this.gender = gender;
        } else {
            System.err.println("Not a valid gender");
        }
    }

    public String getEmailAddress() {
        if (isEmailRestricted == null) {
            throw new NullPointerException();
        }
        if (!isEmailRestricted) {
            return emailAddress;
        } else {
            return "Mail is restricted.";
        }
    }

    public void setEmailAddress(String emailAddress) {
        String emailRegex = "(?:[a-z0-9!#$%&'*+\\/=?^_`{|}~-]+(?:\\.[a-" +
                "z0-9!#$%&'*+\\/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f" +
                "\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])" +
                "*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]" +
                "*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?" +
                ":25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-" +
                "\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09" +
                "\\x0b\\x0c\\x0e-\\x7f])+)\\])";

        if (emailAddress.matches(emailRegex)) {
            this.emailAddress = emailAddress;
        } else {
            System.err.println("Not a valid emailAddress.");
        }
    }

    public void getAllAboutPerson() {
        System.out.println(
                "This is " + this.lastName + this.firstName +
                        ". Age: " + this.age +
                        ". The gender is: " + this.gender +
                        ". The email address is: " + getEmailAddress() +
                        " and the email is restricted: " + this.isEmailRestricted);
    }
}