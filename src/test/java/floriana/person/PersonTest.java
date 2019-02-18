package floriana.person;

import org.testng.Assert;
import org.testng.annotations.Test;


public class PersonTest {

    @Test
    public void testNameIsCorrect_ConstructorPersonSetsFirstAndLAstName() {
        // Act
        Person p = new Person("Florian", "Anghele");
        // Assert
        Assert.assertEquals(p.getFirstName(), "Florian");
        Assert.assertEquals(p.getLastname(), "Anghele");
    }

    @Test
    public void testSetFirstNameIsIncorrect_ConstructorPersonSetsFirstAndLAstName() {
        // Arrange
        Person p = new Person("Florian", "Anghele");
        // Act
        p.setFirstName("Gigi");
        // Assert
        Assert.assertEquals(p.getFirstName(),"Gigi");
    }

    @Test
    public void testGetEmailAdress_WithValidFormatButUndefinedPermision_ShouldSetValidEmailAddress() {
        // Arrange

        // Act
        Person p = new Person("Florian", "Anghele",20,"Male","flo@gmail.com");
        // Assert
        Assert.assertEquals(p.getEmailAddress(),"flo@gmail.com");
    }

    @Test
    public void testGetEmailAdress_WithValidFormatAndEmailIsRestricted_ShouldSetValidEmailAddress() {
        // Arrange
        Person p = new Person("Florian", "Anghele",20,"Male","flo@gmail.com");
        // Act
        p.setEmailRestricted(true);
        // Assert
        Assert.assertEquals(p.getEmailAddress(),"Email is restricted");
    }

    @Test
    public void testGetEmailAdress_WithValidFormatAndEmailIsNotRestricted_ShouldSetValidEmailAddress() {
        // Arrange
        Person p = new Person("Florian", "Anghele",20,"Male","flo@gmail.com");
        // Act
        p.setEmailRestricted(false);
        // Assert
        Assert.assertEquals(p.getEmailAddress(),"flo@gmail.com");
    }

    @Test
    public void testGetAge_IfAgeIsBetween18And100Years() {
        // Arange
        Person p = new Person("Florian", "Anghele");
        // Act
        p.setAge(20);
        // Assert
        Assert.assertEquals(p.getAge(),20);
    }

    @Test
    public void testGetAge_IfAgeIs18YearsOld() {
        // Arange
        Person p = new Person("Florian", "Anghele");
        // Act
        p.setAge(18);
        // Assert
        Assert.assertEquals(p.getAge(),18);
    }

    @Test
    public void testGetAge_IfAgeIs100YearsOld() {
        // Arange
        Person p = new Person("Florian", "Anghele");
        // Act
        p.setAge(100);
        // Assert
        Assert.assertEquals(p.getAge(),100);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testGetAge_IfAgeIsLessThan18() {
        // Arange
        Person p = new Person("Florian", "Anghele");
        // Act
        p.setAge(17);
        // Assert

    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testGetAge_IfAgeIsBiggerThan100() {
        // Arange
        Person p = new Person("Florian", "Anghele");
        // Act
        p.setAge(101);
        // Assert

    }

}


