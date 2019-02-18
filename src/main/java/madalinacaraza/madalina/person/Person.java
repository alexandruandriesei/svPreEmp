package madalinacaraza.madalina.person;

public class Person {
    protected String firstName;
    protected String lastName;
    private int age;
    private String gender;
    private String emailAddress;
    private Boolean isEmailRestricted;

    public Boolean isEmailRestricted() {
        return isEmailRestricted;
    }

    public void setEmailRestricted(boolean emailRestricted) {
        isEmailRestricted = emailRestricted;
    }

    public Person(String firstName, String lastName, int age, String gender, String emailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.emailAddress = emailAddress;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Boolean getEmailRestricted() {
        return isEmailRestricted;
    }

    public void setEmailRestricted(Boolean emailRestricted) {
        isEmailRestricted = emailRestricted;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public String getGender() {
        return this.gender;
    }

    public String getEmailAddress() {
        if (isEmailRestricted() == null) {
            throw new NullPointerException();
        } else {
            if (!isEmailRestricted()) {
                return this.emailAddress;

            } else
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
        if (age >= 18 && age <= 100) {
            if (age < this.age) {
                throw new IllegalArgumentException();
            }
            this.age = age;
        }
    }

    public void setGender(String gender) {
        if (gender == "Feminin" || gender == "Masculin" || gender == "Other") {
            this.gender = gender;
        } else {
            System.out.println("Nu este corect");
        }
    }

    public void setEmailAddress(String emailAddress) {
        if (emailAddress.matches("(?:[a-z0-9!#$%&'*+\\/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+\\/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])"))

            this.emailAddress = emailAddress;
        else
            System.out.println(emailAddress + " " + "is not a valid email address");

    }

    public void informationPerson() {
        System.out.println("Detaliile persoanei sunt: " + this.firstName + " " + this.lastName + " " + this.age + " " + this.gender + " " + getEmailAddress());
    }

    public Person() {
    }
}
