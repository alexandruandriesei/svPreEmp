package petrutam.person;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class PersonTest{
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testGetEmailAddress_WithInvalidEmailAddress_InvalidEmailAddress() {
        String validEmailAdddress="cevaceva.ceva";

        //Arrange
        Person person =new Person();

        //Act
        person.setEmailAddress(validEmailAdddress);

        //Assert
        assertEquals(person.getEmailAddress(),validEmailAdddress);
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void testGetEmailAddress_WithValidEmailAddressButUndefinedPermision_InvalidEmailAddress() {
        String validEmailAdddress="ceva@ceva.ceva";

        //Arrange
        Person person =new Person();

        //Act
        person.setEmailAddress(validEmailAdddress);

        //Assert
        assertEquals(person.getEmailAddress(),validEmailAdddress);
    }
    @Test
    public void testGetEmailAddress_WithCorrectFormatAndIsNotRestricted_ShouldAddEmailAddress() {
        String validEmailAdddress="ceva@ceva.ceva";
        //Arrange
        Person person =new Person();

        //Act
         person.setEmailAddress(validEmailAdddress);
         person.setEmailRestricted(false);

        //Assert
        assertEquals(person.getEmailAddress(),validEmailAdddress);

    }
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testGetEmailAddress_WithCorrectFormatAndIsRestricted_ShouldAddEmailAddress() {
        String validEmailAdddress="ceva@ceva.ceva";
        //Arrange
        Person person =new Person();

        //Act
        person.setEmailAddress(validEmailAdddress);
        person.setEmailRestricted(true);
        person.getEmailAddress();


    }



    @Test
    public void testPersonConstuctor_WithMandatoryFields_ShouldInstantiatePerson(){
        //Act-Test Steps
        Person person =new Person("Chuck","Norris");
        //Assert
        assertEquals(person.getFirstName(),"Chuck");
        assertEquals(person.getLastName(),"Norris");

    }


    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testSetAge_WithInvalidAgeIsBiggerThat100_ShouldAddAge() {
        int age=101;
        //Arrange
        Person myPerson = new Person();
        //act
        myPerson.setAge(age);
        myPerson.getAge();
        //Assert

    }
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testSetAge_WithInvalidAge_AgeIsLess18_ShouldAddAge() {
        int age=17;
        //Arrange
        Person myPerson = new Person();
        //act
        myPerson.setAge(age);
        myPerson.getAge();
        //Assert

    }

    @Test
    public void testSetAge_WithValidAge18_ShouldAddAge() {
        int age=18;
        //Arrange
        Person myPerson = new Person();
        //act
        myPerson.setAge(age);
        //Assert
        assertEquals(myPerson.getAge(),age);

    }
    @Test
    public void testSetAge_WithValidAge100_ShouldAddAge() {
        int age=100;
        //Arrange
        Person myPerson = new Person();
        //act
        myPerson.setAge(age);
        //Assert
        assertEquals(myPerson.getAge(),age);
    }
    @Test
    public void testSetAge_WithValidAgeButAgeGoesUp_ShouldAddAge() {
        int age=18;
        //Arrange
        Person myPerson = new Person();
        //act
        myPerson.setAge(age);
        myPerson.setAge(age+1);
        //Assert
        assertEquals(myPerson.getAge(),age+1);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testSetAge_WithValidAgeButAgeGoesDown_ShouldAddAge() {
        int age=20;
        //Arrange
        Person myPerson = new Person();
        //act
        myPerson.setAge(age);
        myPerson.setAge(age-1);
        myPerson.getAge();
    }

}
