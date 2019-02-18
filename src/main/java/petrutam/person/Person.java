package petrutam.person;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private char gender;
    private String emailAddress;
    private boolean isEmailRestricted;
    private String regex = "(?:[a-z0-9!#$%&'*+\\/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+\\/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])";

    public Person() {
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


    public int getAge() {

        return age;
    }


    public char getGender() {
        return gender;
    }

    public String getEmailAddress() {

        if (isEmailRestricted) {
            throw new IllegalArgumentException("\nInvalid");

        } else {
            return emailAddress;

        }
    }

    public void setAge(int age) {
        if (age <= 100 && age >= 18)
            if (age > this.age)
                this.age = age;
            else
                throw new IllegalArgumentException();
        else
            throw new IllegalArgumentException();

    }

    public void setGender(char gender) {
        if (gender == 'F' || gender == 'M' || gender == 'O') {
            this.gender = gender;
        } else {
            //System.err.println("Gender Error.");
            throw new IllegalArgumentException("Please insert a Valid Gender.");
        }
    }

    public void setEmailAddress(String emailAddress) {
        if (emailAddress.matches(regex))
            this.emailAddress = emailAddress;
        else {
            //System.err.println(emailAddress + " is not a valid E-mail.");
            throw new IllegalArgumentException("Invalid email Adress");
        }
    }

    public boolean isEmailRestricted() {
        return isEmailRestricted;
    }


    public void setEmailRestricted(boolean emailRestricted) {
        isEmailRestricted = emailRestricted;
    }

    public void printPersonDetails() {
        System.out.println("Name: " + this.getFirstName() + " " + this.getLastName());
        System.out.println("Age: " + this.getAge());
        System.out.println("Gender: " + this.getGender());
        System.out.println("E-mail Adress: " + this.getEmailAddress());
    }
}


