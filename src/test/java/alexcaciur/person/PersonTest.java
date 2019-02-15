package alexcaciur.person;

import alexc.person.Person;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class PersonTest {
    @Test
    public void createPerson_WithMandatoryFields_ShouldInstantiatePerson() {
        //Act
        Person person = new Person("First", "Last");

        //Assert
        assertEquals(person.getFirstName(), "First");
        assertEquals(person.getLastName(), "Last");
    }

    @Test
    public void setFirstName_WithString_ShouldSetTheNameCorrectly() {
        //Arrange
        Person person = new Person();

        //Act
        person.setFirstName("Second");

        //Assert
        assertEquals(person.getFirstName(), "Second");
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void getEmailAddress_WithValidFormatButUndefinedDisplayPermissions_ShouldNotGetEmailAddress() {
        String validEmailAddress = "test@test.com";
        //Arrange
        Person person = new Person();

        //Act
        person.setEmailAddress(validEmailAddress);
        person.getEmailAddress();
    }

    @Test(expectedExceptions = IllegalAccessError.class)
    public void getEmailAddress_WithValidFormatButRestrictedEmail_ShouldNotGetEmailAddress() {
        //Arrange
        Person person = new Person();

        //Act
        person.setEmailRestricted(Boolean.TRUE);
        person.setEmailAddress("test@test.com");
        person.getEmailAddress();
    }

    @Test
    public void getEmailAddress_WithValidFormat_ShouldGetEmailAddress() {
        //Arrange
        Person person = new Person();

        //Act
        person.setEmailRestricted(Boolean.FALSE);
        person.setEmailAddress("test@test.com");

        //Assert
        assertEquals(person.getEmailAddress(), "test@test.com");
    }

    @Test
    public void setAge_WithLowerBoundary_ShouldSetAge() {
        //Arrange
        Person person = new Person();

        //Act
        person.setAge(18);

        //Assert
        assertEquals(person.getAge(), 18);
    }

    @Test
    public void setAge_WithUpperBoundary_ShouldSetAge() {
        //Arrange
        Person person = new Person();

        //Act
        person.setAge(100);

        //Assert
        assertEquals(person.getAge(), 100);
    }

    @Test
    public void setAge_WithValidAge_ShouldSetAge() {
        //Arrange
        Person person = new Person();

        //Act
        person.setAge(50);

        //Assert
        assertEquals(person.getAge(), 50);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void setAge_WithAgeUnder18_ShouldNotSetAge() {
        //Arrange
        Person person = new Person();

        //Act
        person.setAge(9);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void setAge_WithAgeOver100_ShouldNotSetAge() {
        //Arrange
        Person person = new Person();

        //Act
        person.setAge(105);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void setAge_WithAgeLowerThanAlreadySetAge_ShouldNotSetAge() {
        //Arrange
        Person person = new Person();

        //Act
        person.setAge(20);
        person.setAge(19);

        //Assert
        assertEquals(person.getAge(),20);
    }
}