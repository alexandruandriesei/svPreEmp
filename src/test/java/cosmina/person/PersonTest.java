package cosmina.person;

import cosminac.person.Person;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PersonTest {

    @Test
    public void createPerson_WithMandatoryFields_ShouldInstantiatePerson() {

        // Act
        Person person = new Person("Cosmina", "Chirila");

        // Assert
        Assert.assertEquals(person.getFirstName(), "Cosmina");
        Assert.assertEquals(person.getLastName(), "Chirila");

    }

    @Test
    public void testFirstName_WithCorrectData_NameProperlySet() {

       // Arrange
        Person person = new Person();

        // Act
        person.setFirstName("Cosmina");

        // Assert
        Assert.assertEquals(person.getFirstName(), "Cosmina");
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void setEmailAddress_WithNullFormat_ShouldSetEmailAddress() {
        String validEmailAddress = "test@test.com";

        // Arrange
        Person person = new Person("Cosmina", "Chirila");

        // Act
        person.setEmailAddress(validEmailAddress);
        person.getEmailAddress();
    }

    @Test
    public void setEmailAddress_WithFalse_ShouldSetEmailAddress() {
        String validEmailAddress = "test@test.com";

        // Arrange
        Person person = new Person("Cosmina", "Chirila");
        person.setEmailRestricted(Boolean.FALSE);

        // Act
        person.setEmailAddress(validEmailAddress);

        // Assert
        Assert.assertEquals(person.getEmailAddress(), validEmailAddress);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void setEmailAddress_WithTrue_ShouldSetEmailAddress() {
        String validEmailAddress = "test@test.com";

        //Arrange
        Person person = new Person("Cosmina", "Chirila");
        person.setEmailRestricted(Boolean.TRUE);

        // Act
        person.setEmailAddress(validEmailAddress);
        person.getEmailAddress();

    }



    @Test
    public void setAge_WithValidValues_ShouldSetAge() {

        // Arrange
        Person person = new Person("Cosmina", "Chirila");

        // Act
        person.setAge(18);

        // Assert
        Assert.assertEquals(person.getAge(), 18);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void setAge_WithLessValue_ShouldSetAge() {

        // Arrange
        Person person = new Person("Cosmina", "Chirila");

        // Act
        person.setAge(15);
        person.getAge();
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void setAge_WithMoreValue_ShouldSetAge() {

        // Arrange
        Person person = new Person("Cosmina", "Chirila");

        // Act
        person.setAge(101);
        person.getAge();
    }

    @Test
    public void setAge_WithValid_ShouldSetAge() {

        // Arrange
        Person person = new Person("Cosmina", "Chirila");

        // Act
        person.setAge(100);

        // Assert
        Assert.assertEquals(person.getAge(), 100);
    }

    @Test
    public void setAge_WithValidValue_ShouldSetAge() {

        // Arrange
        Person person = new Person("Cosmina", "Chirila");

        // Act
        person.setAge(19);

        // Assert
        Assert.assertEquals(person.getAge(), 19);
    }

    @Test
    public void setAge_WithValidValue_ShouldDisplayAge() {

        // Arrange
        Person person = new Person("Cosmina", "Chirila");

        // Act
        person.setAge(99);

        // Assert
        Assert.assertEquals(person.getAge(), 99);
    }

    @Test
    public void setAge_WithIncrease_ShouldDisplayAge() {

        // Arrange
        Person person = new Person("Cosmina", "Chirila");

        // Act
        person.setAge(25);
        person.setAge(26);

        // Assert
        Assert.assertEquals(person.getAge(), 26);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void setAge_WithDecrease_ShouldDisplayAge() {

        // Arrange
        Person person = new Person("Cosmina", "Chirila");

        // Act
        person.setAge(101);
        person.setAge(100);

        // Assert
        Assert.assertEquals(person.getAge(), 100);
    }






}



