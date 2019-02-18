package madalinacaraza.person;

import madalinacaraza.madalina.person.Person;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PersonTest {

    @Test
    public void createPerson_WithMandatoryFields_CreateObjectPerson() {
        //act
        Person person = new Person("Ana", "Maria");
        //assert
        assertEquals(person.getFirstName(), "Ana");
        assertEquals(person.getLastName(), "Maria");
    }


    @Test
    public void setFirstName_WithCorrectFields_FirstNameProperty() {
        //Arrange
        Person person = new Person();
        //act
        person.setFirstName("Ana");
        //assert
        assertEquals(person.getFirstName(), "Ana");
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void setEmailAddress_WithValidFormat_ShouldSetEmailAddress() {
        String validEmailAddress = "test@test.com";

        // Arrange
        Person person = new Person("Madalina", "Ana");

        // Act
        person.setEmailAddress(validEmailAddress);
        person.getEmailAddress();
    }


    @Test
    public void setEmailAddress_WithFalse_ShouldSetEmailAddress() {
        String validEmailAddress = "test@test.com";

        // Arrange
        Person person = new Person("Madalina", "Caraza");
        person.setEmailRestricted(Boolean.FALSE);

        // Act
        person.setEmailAddress(validEmailAddress);

        // Assert
        assertEquals(person.getEmailAddress(), validEmailAddress);
    }


    @Test(expectedExceptions = IllegalArgumentException.class)
    public void setEmailAddress_WithTrue_ShouldSetEmailAddress() {
        String validEmailAddress = "test@test.com";

        //Arrange
        Person person = new Person("Madalina", "Caraza");
        person.setEmailRestricted(Boolean.TRUE);

        // Act
        person.setEmailAddress(validEmailAddress);
        person.getEmailAddress();

    }


    @Test
    public void setTestAge_With18Age_ShouldAddAge() {
        //Arrange
        Person person = new Person();
        //Act
        person.setAge(18);
        //Assert
        assertEquals(person.getAge(), 18);
    }


    @Test
    public void setTestAge_WithCorrectAge_ShouldAddAge() {
        //Arrange
        Person person = new Person();
        //Act
        person.setAge(100);
        //Assert
        assertEquals(person.getAge(), 100);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void setTestAge_WithAgeLess17_ShouldThrowException() {
        //Arrange
        Person person = new Person();
        //Act
        person.setAge(17);
        person.getAge();
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void setTestAge_WithAgeMore100_ShouldThrowException() {
        //Arrange
        Person person = new Person();
        //Act
        person.setAge(102);
        person.getAge();
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void setTestAge_WithAgeBetween_ShouldThrowException() {
        // Arrange
        Person person = new Person();
        //Act
        person.setAge(40);
        person.getAge();
    }

    @Test
    public void setAge_WithIncrease_ShouldDisplayAge() {
        // Arrange
        Person person = new Person("Ana", "Chirila");

        // Act
        person.setAge(25);
        person.setAge(26);

        // Assert
        assertEquals(person.getAge(), 26);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void setAge_WithDecrease_ShouldDisplayAge() {

        // Arrange
        Person person = new Person("Cosmina", "Popa");

        // Act
        person.setAge(23);
        person.setAge(21);

        // Assert
        assertEquals(person.getAge(), 100);
    }

}