package preemployment.person;

public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String emailAddress;
    private Boolean isEmailRestricted;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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

        if (18 > age || age > 100) {
            throw new IllegalArgumentException("Age must be between 18 and 100");
            } else {
                if (age <= this.age) {
                    throw new IllegalArgumentException("Age cannot decrease");
                } else {
                    this.age = age;
                }
        }

    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmailAddress() {
        if (isEmailRestricted == null) {
            throw new NullPointerException("Vezi ca nu si-a dat inca acordul, nici ca da, nici ca nu!");
        } else {
            if (!isEmailRestricted) {
                return emailAddress;

            } else {
                throw new IllegalArgumentException("\nDoes not want to display email");
            }
        }
    }

    public void setEmailAddress(String emailAddress) {
        if (emailAddress.matches("(?:[a-z0-9!#$%&'*+\\/=?^_`{|}~-]+(?:\\.[a-z0-" +
                "9!#$%&'*+\\/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\" +
                "x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0" +
                "e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-" +
                "9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0" +
                "-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0" +
                "-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\" +
                "x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])")) {
            this.emailAddress = emailAddress;
        } else {
            throw new IllegalArgumentException("Invalid email Address ");
        }

    }

    public Boolean getEmailRestricted() {
        return isEmailRestricted;
    }

    public void setEmailRestricted(Boolean emailRestricted) {
        isEmailRestricted = emailRestricted;
    }

    public void printPersonalDetails() {
        System.out.println("\n----- First Name: " + this.getFirstName());
        System.out.println("----- Last Name: " + this.getLastName());
        System.out.println("----- Gender: " + this.getGender());
        System.out.println("----- Age: " + this.getAge());
        System.out.println("----- Email Address: " + this.getEmailAddress());
    }
}
