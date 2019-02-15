package preemployment.person;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PersonTests {
    private Person person;

    @BeforeMethod
    public void setUp() {
        person = new Person("First", "Last");
    }

    @Test
    public void createPerson_WithMandatoryFields_ShouldInstantiatePerson() {
        // Act
//        Person person = new Person("First", "Last");
        
        // Assert
        assertEquals(person.getFirstName(),"First");
        assertEquals(person.getLastName(),"Last");
    }

    @Test
    public void setFirstName_UWithCorrectString_ShouldSetFirstName() {
        // Arange
//        Person person = new Person("First", "Last");

        // Act
        person.setFirstName("Chuck");

        // Assert
        assertEquals(person.getFirstName(), "Chick");
    }

    @Test
    public void setAge_WithinExpectedRange_AgeSuccessfullySet() {
        // Arrange
//        Person person = new Person("First", "Last");

        // Act
        person.setAge(35);

        // Assert
        assertEquals(person.getAge(), 35);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void setAge_WithValueOutOfExpectedRange_ExceptionThrown() {
        // Arrange
//        Person person = new Person("First", "Last");

        // Act
        person.setAge(15);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void setAge_NewAgeLowerThanCurrentOne() {
        // Arrange
//        Person person = new Person("First", "Last");
        person.setAge(20);

        // Act
        person.setAge(19);
    }
}
