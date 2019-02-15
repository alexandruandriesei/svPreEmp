package claudiu.person;

import claudiuc.person.Person;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PersonTests {


    @Test
    public void createPerson_WithMandatoryFields_ShouldInstantiatePerson() {
        //ACT;
        Person person = new Person("Claudiu", "Iacob");
        //ASSERT
        assertEquals(person.getFirstName(), "Claudiu");
    }

    @Test
    public void validateSet_First_Name() {

        //ACT
        Person person1 = new Person("Claudiu", "Iacob");
        person1.setFirstName("Claudiu");


        //ASSERT
        assertEquals(person1.getFirstName(), "Claudiu");

    }

    @Test
    public void validateSet_Last_Name() {
        //ACT
        Person person2 = new Person("Claudiu", "Iacob");
        person2.setLastName("Iacob");

        //ASSERT

        assertEquals(person2.getLastName(), "Iacob");

    }

    @Test
    public void setEmailAdress_WithEmailAdressValid() {
        //ARRANGE
        Person person3 = new Person("Ana", "Noris");
        //ACT
        person3.setEmailAddress("test@test.com");


        //ASSERT
        assertEquals(person3.getEmailAdress(), "test@test.com");


    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void setEmailAdress_WithnoValidData() {
        //ARRANGE
        Person person4 = new Person("Ana", "Maria");

        //ACT

        person4.setEmailAddress("bill");


    }

    @Test
    public void verify_Age_Interval() {
        //ARRANGE
        Person person5 = new Person("Maria", "Ioana");
        //ACT
        person5.setAge(20);
        //ASSERT
        assertEquals(person5.getAge(), 20);

    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void age_under_18() {//ARRANGE
        Person person6 = new Person("Maria", "Ioana");
        //ACT
        person6.setAge(13);
        //ASSERT

    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void age_over_100() {//ARRANGE
        Person person7 = new Person("Maria", "Ioana");
        //ACT
        person7.setAge(101);
        //ASSERT

    }

    @Test
    public void boundlower_Age_Interval() {
        //ARRANGE
        Person person5 = new Person("Maria", "Ioana");
        //ACT
        person5.setAge(18);
        //ASSERT
        assertEquals(person5.getAge(), 18);

    }

    @Test
    public void boundhigher_Age_Interval() {
        //ARRANGE
        Person person5 = new Person("Maria", "Ioana");
        //ACT
        person5.setAge(100);
        //ASSERT
        assertEquals(person5.getAge(), 100);

    }

    @Test(expectedExceptions =IllegalArgumentException.class)
    public void decrease_Year() {
        //ARRANGE
        Person person8 = new Person("Maria", "Ioan");
        //ACT
        person8.setAge(45);
        person8.setAge(43);



    }

    public void increase_Year()
    {
        //ARRANGE
        Person person9 = new Person("Maria", "Ioan");
        //ACT
        person9.setAge(45);
        person9.setAge(49);



    }


}
