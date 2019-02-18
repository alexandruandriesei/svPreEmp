package adriang.person;

import org.testng.annotations.Test;
import org.testng.Assert.*;

import static org.testng.Assert.assertEquals;

public class PersonTests {
    @Test
    public void createPerson_WithMandatoryFields_PersonInitiated(){
        //Arrange

        //Act - Test Steps
        Person person = new Person("Chuck","Norris");

        //Assert - Test Expected vs Actual Result
        assertEquals(person.getFirstName(),"Chuck");
    }

    @Test(expectedExceptions = NullPointerException.class)

    public void setEmailAdress_WithValidFormatButUndefinedValidFormat_ShouldSetEmailAdress() {
        String ValidEmailAdress = "andreigrigore@yahoo.com";
        //Arrange
        Person myPerson = new Person("Andrei","Grigore");

        //Act
        myPerson.setEmailAddress(ValidEmailAdress);
        myPerson.getEmailAddress();
        //Assert
        //assertEquals(myPerson.getEmailAddress(),ValidEmailAdress);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void setEmailAdress_WithInvalidFormat_ShouldSetEmailAdress(){
        //Arrange
        Person myPerson = new Person("Mircea","Andrei");
        //Act
        myPerson.setEmailAddress("andreeidoru*com");
        //Assert
        assertEquals(myPerson.getEmailAddress(),"andreeidoru*com");
    }

    @Test
    public void setAge_WithCorrectNumber_ShouldSetAge(){
        //Arrange
        Person myPerson = new Person("Zizou","Xulescu");
        //Act
        myPerson.setAge(21);
        //Assert
        assertEquals(myPerson.getAge(),21);
    }

    @Test(expectedExceptions = IndexOutOfBoundsException.class)
    public void setAge_WithNumberSmallerThanMin_ShouldSetAge(){
        //Arrange
        Person myPerson = new Person("Zizou","Xulescu");
        //Act
        myPerson.setAge(9);
        myPerson.getAge();
    }

    @Test(expectedExceptions = IndexOutOfBoundsException.class)
    public void setAge_WithNumberGreaterThanMax_ShouldSetAge(){
        //Arrange
        Person myPerson = new Person("Zizou","Xulescu");
        //Act
        myPerson.setAge(101);
        myPerson.getAge();
    }

    @Test(expectedExceptions = IndexOutOfBoundsException.class)
    public void setAge_WithNumberEqualWithMin_ShouldSetAge(){
        //Arrange
        Person myPerson = new Person("Zizou","Xulescu");
        //Act
        myPerson.setAge(18);
        myPerson.getAge();
    }

    @Test(expectedExceptions = IndexOutOfBoundsException.class)
    public void setAge_WithNumberEqualMax_ShouldSetAge(){
        //Arrange
        Person myPerson = new Person("Zizou","Xulescu");
        //Act
        myPerson.setAge(100);
        myPerson.getAge();
    }
}


