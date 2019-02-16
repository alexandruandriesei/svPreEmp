package preemployment.person;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PersonTests {
//    private Person person;
//
//    @BeforeMethod
//    public void setUp() {
//        person = new Person("First", "Last");
//    }

    @Test
    public void createPerson_WithMandatoryFields_ShouldInstantiatePerson() {
        // Act - Test Steps
        Person person = new Person("Chuck", "Norris");

        // Assert - Test Expected vs Actual Results
        assertEquals(person.getFirstName(),"Chuck");
        assertEquals(person.getLastName(),"Norris");
    }

    @Test
    public void setFirstName_UWithCorrectString_ShouldSetFirstName() {
        // Arange
        Person person = new Person("First", "Last");

        // Act
        person.setFirstName("Chuck");

        // Assert
        assertEquals(person.getFirstName(), "Chuck");
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void getEmailAddress_WithValidFormatButUndefinedDisplayPermission_ShouldSetEmailAddress() {
//        String validEmailAddress = "test@test.com";

        // Arrange
        Person myPerson = new Person("Chuck", "Norris");

        // Act
        myPerson.setEmailAddress("test@test.com");
        myPerson.getEmailAddress();

    }

    @Test
    public void setAge_WithinExpectedRange_AgeSuccessfullySet() {
        // Arrange
        Person person = new Person("First", "Last");

        // Act
        person.setAge(35);

        // Assert
        assertEquals(person.getAge(), 35);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void setAge_WithValueOutOfExpectedRange_ExceptionThrown() {
        // Arrange
        Person person = new Person("First", "Last");

        // Act
        person.setAge(15);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void setAge_NewAgeLowerThanCurrentOne() {
        // Arrange
        Person person = new Person("First", "Last");
        person.setAge(20);

        // Act
        person.setAge(19);
    }
}
