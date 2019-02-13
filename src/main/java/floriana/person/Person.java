package floriana.person;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String emailAddress;

    private boolean isEmailRestricted;

    public boolean isEmailRestricted() {
        return isEmailRestricted;
    }

    public void setEmailRestricted(boolean emailRestricted) {
        isEmailRestricted = emailRestricted;
    }

    // Constructors

    /**
     * Implicit Constructor
     */
    public Person() {
    }

    /**
     * Explicit Constructor for first name and last name only
     *
     * @param firstName
     * @param lastName
     */
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Explicit Constructor
     *
     * @param firstName
     * @param lastName
     * @param age
     * @param gender
     * @param emailAddress
     */
    public Person(String firstName, String lastName, int age, String gender, String emailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.emailAddress = emailAddress;
    }

    // Getters

    /**
     * First name getter
     *
     * @return
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Last name getter
     *
     * @return
     */
    public String getLastname() {
        return lastName;
    }

    /**
     * Age getter
     *
     * @return
     */
    public int getAge() {
        return age;
    }

    /**
     * Gender getter
     *
     * @return
     */
    public String getGender() {
        return gender;
    }

    /**
     * Email address getter
     *
     * @return
     */
    public String getEmailAddress() {
        if (isEmailRestricted())
            return "Email is restricted";
        else
            return emailAddress;
    }

    // Setters

    /**
     * First name setter
     *
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Last name setter
     *
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Age
     *
     * @param age
     */
    public void setAge(int age) {
        try {
            if (age <= 100 && age >= 0)
                this.age = age;
            else
                throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            System.out.println("Varsta trebuie sa fie intre 0 si 100 de ani.");
        }
    }

    /**
     * Gender setter
     *
     * @param gender
     */
    public void setGender(String gender) {
        ArrayList<String> gendersAvailable = new ArrayList<>();
        gendersAvailable.add("Male");
        gendersAvailable.add("Female");
        gendersAvailable.add("Other");
        try {
            int ok = 0;
            for (int i = 0; i <= gendersAvailable.size() - 1; i++)
                if (gender.equals(gendersAvailable.get(i))) {
                    this.gender = gender;
                    ok = 1;
                    break;
                }
            if (ok == 0)
                throw new IllegalArgumentException();

        } catch (IllegalArgumentException e) {
            System.out.println("Gender-ul nu poate fi decat Male, Female sau Other.");
        }
    }

    /**
     * Method for defining the pattern of the email
     */
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    /**
     * Method that check if the email has the good pattern
     *
     * @param email
     * @return
     */
    public static boolean validate(String email) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
        return matcher.find();
    }

    /**
     * Email address setter
     *
     * @param emailAddress
     */
    public void setEmailAddress(String emailAddress) {
        try {
            if (validate(emailAddress))
                this.emailAddress = emailAddress;
            else
                throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            System.out.println("Emailul trebuie sa respecte tiparul: ceav@ceva.dm");
        }

    }

    /**
     * @return how to show my object
     */
    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }

    public String printPersonDetails() {
            return "Person{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", age=" + age +
                    ", gender='" + gender + '\'' +
                    ", emailAddress='" + getEmailAddress() + '\'' +
                    '}';


    }
}
