package oana.m.person;

public class Person {

    public Person(){

    }
        protected String firstName;
        protected String lastName;
        private int age;
        private String gender;
        private String emailAddress;
        boolean isEmailRestricted;


    public Person(String firstName, String lastName, int age, String gender, String emailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.emailAddress = emailAddress;
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
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender == "Male") {//gender=="Female"//gender=="Other"){
            this.gender = gender;
        } else
            System.out.println("Wrong gender");
    }

    public String getEmailAddress() {
        if(isEmailRestricted){
            return "Acces restrictionat la adressa de e-mail";
        }
        else
            return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        if (emailAddress.matches("(?:[a-z0-9!#$%&'*+\\/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+\\/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])")) {

            this.emailAddress = emailAddress;
        }
        else
            System.out.println(emailAddress+ "is not a valid email address");
    }

    public void showDetails(){

        System.out.println("Numele persoanei este: "+this.firstName+" "+this.lastName+", varsta este: "+this.age+". Genul persoanei este:"+this.gender+", iar adresa sa de email este: "+getEmailAddress());

    }


    public boolean getIsEmailRestricted() {
        return isEmailRestricted;
    }

    public void setIsEmailRestricted(boolean emailRestricted) {
        isEmailRestricted = emailRestricted;
    }
}
