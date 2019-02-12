package preemployment.person;

public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String emailAddress;

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
        try {
            if (18 <= age && age <= 100) {
                if (age >= this.age) {
                    this.age = age;
                } else {
                    throw new IllegalArgumentException("Age cannot decrease");
                }
            } else {
                throw new IllegalArgumentException("Age must be between 18 and 100");
            }
        } catch (IllegalArgumentException i) {
            System.out.println("Exception when setting age for Student " + this.firstName + " " + this.lastName + " ---------> " + i);
        }

    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmailAddress() {
        return emailAddress;
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

    public void printPersonalDetails() {
        System.out.println("\n----- First Name: " + this.getFirstName());
        System.out.println("----- Last Name: " + this.getLastName());
        System.out.println("----- Gender: " + this.getGender());
        System.out.println("----- Age: " + this.getAge());
        System.out.println("----- Email Address: " + this.getEmailAddress());
    }
}
