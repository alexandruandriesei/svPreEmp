package anab.Person;
//import java.util.*;
//import java.util.Random;

public class Person {

    private String firstName;
    private String lastName;
    private String gender;
    private int age;
    private String emailAddress;

    public Person(String firstName, String lastName, String gender, int age, String emailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.emailAddress = emailAddress;
    }

    public void printPersonDetails() {
        System.out.println("Here are the person details you've asked: ");
        System.out.println("Name:" + firstName);
        System.out.println("LastName:" + lastName);
        System.out.println("Gender:" + gender);
        System.out.println("Age:" + age);
        System.out.println("Email address:" + emailAddress);
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String newFirstName) {
        firstName = newFirstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String newLastName) {
        lastName = newLastName;
    }

    public Integer getAge() {
        return age;
    }
    public void setAge(Integer newAge) {
        age = newAge;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String newGender) {

        if ((newGender == "Male") || (newGender == "Female") || (newGender == "Other")) {
            gender = newGender; //assign value given checked by if conditions

        } else {
            if ((newGender == null) || (newGender.length() == 0)) {
                System.out.println("Gender field is empty");
            } else {
                System.out.println("err: Gender type needs a valid value. Please re-enter one(Male, Female, Other): " + newGender);

            }
        }


    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String newEmailAddress) {
        if (newEmailAddress.matches("(?:[a-z0-9!#$%&'*+\\/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+\\/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:\t[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])")) {
            emailAddress = newEmailAddress;
            System.out.println("Correct Email address");
        } else {
            System.out.println("Email invalid!!!");
        }
    }
}



