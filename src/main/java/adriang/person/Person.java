package adriang.person;

public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private char gender;
    private Boolean isEmailRestricted;
    private String emailAddress;

    public Person() {
    }

    private String regex = "(?:[a-z0-9!#$%&'*+\\/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+\\/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])";

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setIsEmailRestricted(Boolean emailRestricted) {
        isEmailRestricted = emailRestricted;
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
        if (isEmailRestricted == null) {
            throw new NullPointerException("Nu si-a dat acordul nici ca da nici ca nu.");
        } else {
            if (!isEmailRestricted) {
                return emailAddress;
            } else {
                throw new IllegalArgumentException("\nInvalid");
            }
        }
    }

    public void setAge(int age) {
        if (age < 18 || age > 100) {
            throw new IndexOutOfBoundsException("Valoarea depaseste 99 sau este mai mica de 18.");
        } else {
            if (age == 18 || age == 100) {
                throw new IndexOutOfBoundsException("Valoarea este setata in limita.");
            } else {
                this.age = age;
            }
        }
    }

    public void setGender(char gender) {
        if (gender == 'F' || gender == 'M' || gender == 'O') {
            this.gender = gender;
        } else {
            throw new IllegalArgumentException("Please insert a Valid Gender.");
        }
    }

    public void setEmailAddress(String emailAddress) {
        if (!emailAddress.matches(regex)) {
            throw new IllegalArgumentException("Invalid email Adress");
        } else {

            if (isEmailRestricted == null) {
                throw new NullPointerException("Email restricted value is null.");
            } else {
                this.emailAddress = emailAddress;
            }
        }
    }

    public boolean isEmailRestricted() {
        return isEmailRestricted;
    }

    public void setIsEmailRestricted(boolean emailRestricted) {
        isEmailRestricted = emailRestricted;
    }

    public void printPersonDetails() {
        System.out.println("Name: " + this.getFirstName() + " " + this.getLastName());
        System.out.println("Age: " + this.getAge());
        System.out.println("Gender: " + this.getGender());
        System.out.println("E-mail Adress: " + this.getEmailAddress());

    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }


}
