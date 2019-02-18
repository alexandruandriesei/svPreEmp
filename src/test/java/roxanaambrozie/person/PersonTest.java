package roxanaambrozie.person;

import org.testng.annotations.Test;
import roxanaa.person.Person;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class PersonTest {


    @Test
    public void createPerson_WithMandatoryFields_ShouldInstantiatePerson(){
        //Arrange
        Person person = new Person("Audrey", "Hepburn");

        //Act
        assertEquals(person.getFirstName(),"Audrey");
        assertEquals(person.getLastName(),"Hepburn");
    }

    @Test
    public void setFirstName_WithValidInput_ShouldInstantiatePerson() {
        //Arrange
        Person person1 = new Person("Cary", "Grant");

        //Act
        person1.setFirstName("Cary");
        person1.setLastName("Grant");

        //Assert
        assertEquals(person1.getFirstName(), "Cary");
        assertEquals(person1.getLastName(), "Grant");
    }

    @Test
    public void setFirstName_WithInvalidInput_ShouldNotInstantiatePerson() {
        //Arrange
        Person cineva = new Person("Prenume","Nume");

        //Act
        cineva.setFirstName("Prenume");
        cineva.setFirstName("Nume");

        //Assert
        assertNotEquals(cineva.getFirstName(), "Eu");
        assertNotEquals(cineva.getFirstName(), "Nu");
    }

    @Test(expectedExceptions =  NullPointerException.class)
    public void getEmailAddress_withValidFormat_ShouldSetEmailAddress() {
       String validEmail = "email@email.com";
        //Arrange
        Person myPerson = new Person("Chuck", "Norris");
        //Act
        myPerson.setEmailAddress(validEmail);
        myPerson.getEmailAddress();
    }

    @Test
    public void getEmailAddress_EmailRestrictedFalse_ShouldSetEmailAddress() {
        String validEmail = "email@email.com";
        //Arrange
        Person myPerson1 = new Person(false);
        //Act
        myPerson1.setEmailAddress(validEmail);
        assertEquals(myPerson1.getEmailAddress(), validEmail );
    }

    @Test
    public void getEmailAddress_EmailRestrictedValid_ShouldSetEmailAddress() {
        String validEmail1 = "email@email.com";
        //Arrange
        Person myPerson2 = new Person(true);
        //Act
        myPerson2.setEmailAddress(validEmail1);
        assertEquals(myPerson2.getEmailAddress(), "Mail is restricted.");
    }

    @Test
    public void setAge_WithValidValuesHighestLimit_ShouldSetAge() {
        int age = 100;
        //Arrange
        Person myPerson2 = new Person(100);
        //Act
        myPerson2.setAge(age);
        assertEquals(myPerson2.getAge(), 100);
    }

    @Test
    public void setAge_WithValidValuesLowestLimit_ShouldSetAge() {
        int age = 18;
        //Arrange
        Person myPerson2 = new Person(18);
        //Act
        myPerson2.setAge(age);
        assertEquals(myPerson2.getAge(), 18);
    }

    @Test
    public void setAge_withValidFormatBelow_ShouldNotSetAge() {
        int age = 20;
        //Arrange
        Person myPerson = new Person(20);
        //Act
        myPerson.setAge(age);
        assertEquals(myPerson.getAge(), age);
    }

    @Test(expectedExceptions =  IllegalArgumentException.class)
    public void setAge_withInValidValueBelowLimit_ShouldNotSetAge() {
        int age = 17;
        //Arrange
        Person myPerson = new Person(10);
        //Act
        myPerson.setAge(age);
        myPerson.getAge();
    }
    @Test(expectedExceptions =  IllegalArgumentException.class)
    public void setAge_withInValidValueOverLimit_ShouldNotSetAge() {
        int age = 101;
        //Arrange
        Person myPerson = new Person(101);
        //Act
        myPerson.setAge(age);
        myPerson.getAge();
    }

    @Test(expectedExceptions =  IllegalArgumentException.class)
    public void setAge_CannotGetYoungerInAge(){
        //Arrange
        Person notGettingYounger = new Person(66);
        //Act
        notGettingYounger.setAge(18);
    }
}
