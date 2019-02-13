package alexc.person;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String emailAddress;
    private Boolean isEmailRestricted;

    public void setAge(int age) {
        this.age = age;
    }

    public Boolean getEmailRestricted() {
        return isEmailRestricted;
    }

    public void setEmailRestricted(boolean isEmailRestricted) {
        this.isEmailRestricted = isEmailRestricted;
    }

    public void setGender(String gender) {
        switch (gender.toLowerCase()) {
            case "male":
                this.gender = gender;
                break;
            case "female":
                this.gender = gender;
                break;
            case "other":
                this.gender = gender;
                break;
            default: {
                this.gender = "Invalid gender";
                System.out.println("Introduce a valid gender!");
            }
        }
    }

    public void setEmailAddress(String emailAddress) {
        if (emailAddress.matches("(?:[a-z0-9!#$%&'*+\\/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+\\/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\" +
                "x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9]" +
                "(?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25" +
                "[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\" +
                "[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])"))
            this.emailAddress = emailAddress;
        else {
            System.out.println("Email address not valid!");
            this.emailAddress = "Invalid email address";
        }
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

    public String getGender() {
        return gender;
    }

    public String getEmailAddress() {
        if (getEmailRestricted()) {
            System.out.println("Email is restricted.");
            throw new IllegalAccessError();
        } else return emailAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void getInfo() {
        System.out.println("Name: " + getLastName() + " " + getFirstName());
        System.out.println("Age: " + getAge());
        System.out.println("Gender: " + getGender());
        System.out.println("Email: " + getEmailAddress());
    }
}


