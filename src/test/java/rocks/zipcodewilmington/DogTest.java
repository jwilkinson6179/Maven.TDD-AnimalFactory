package rocks.zipcodewilmington;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {

    Dog testDog;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void DogConstructorTest() {
        // GIVEN

        String givenName = "Joe";
        Date givenBDay = new Date(2013, 11, 6);
        Integer givenId = 790;
        testDog = new Dog(givenName, givenBDay,givenId);

        // WHEN

        String retrievedName = testDog.getName();
        Date retrievedBDay = testDog.getBirthDate();
        Integer retrievedId = testDog.getId();

        // THEN

        assertEquals(givenName, retrievedName);
        assertEquals(givenBDay, retrievedBDay);
        assertEquals(givenId, retrievedId);
    }

    @Test
    public void setNameTest() {

        String givenName = "Scraps";
        String newDogName = "Milo";
        Date givenBDay = new Date(2011, 5, 11);
        Integer givenId = 43;
        testDog = new Dog(givenName, givenBDay, givenId);

        // When (a dog's name is set to the given name)
        testDog.setName(newDogName);

        // Then (we expect to get the given name from the dog)
        String actual = testDog.getName();
        assertEquals("Milo", actual);
    }

    @Test
    public void DogSpeaksTest()
    {
        // GIVEN

        String givenName = "Ski";
        Date givenBDay = new Date(1988, 11, 4);
        Integer givenId = 41;
        testDog = new Dog(givenName, givenBDay, givenId);
        String expected = "bark!";

        // WHEN

        String actual = testDog.speak();

        // THEN

        assertEquals(expected, actual);
    }

    @Test
    public void SetBDayTest()
    {
        // GIVEN
        Date expected = new Date(2008, 6, 6);
        String givenName = "Roofus";
        Date givenBDay = new Date(2016, 5, 1);
        Integer givenId = 55;
        testDog = new Dog(givenName, givenBDay, givenId);
        Date newBDay = new Date (2008, 6, 6);
        // THEN

        testDog.setBirthDate(newBDay);
        Date actual = testDog.getBirthDate();

        // WHEN

        assertEquals(expected, actual);
    }

    @Test
    public void EatFoodTwiceTest()
    {
        // GIVEN

        Integer expected = 2;
        Food givenMeal = new Food();
        String givenName = "Puggles";
        Date givenDate = new Date(2018, 3, 4);
        Integer givenId = 1122;
        testDog = new Dog(givenName, givenDate, givenId);

        // WHEN

        testDog.eat(givenMeal);
        testDog.eat(givenMeal);
        Integer actual = testDog.getNumberOfMealsEaten();
        // THEN

        assertEquals(expected, actual);
    }

    @Test
    public void GetIdTest()
    {
        // GIVEN

        Integer expected = 666;
        String givenName = "Devildog";
        Date givenBDay = new Date(1066, 6, 6);
        Integer givenId = 666;
        testDog = new Dog(givenName, givenBDay, givenId);

        // WHEN

        Integer actual = testDog.getId();

        // THEN

        assertEquals(expected, actual);
    }

    @Test
    public void IsItADogTest()
    {
        // GIVEN

        String givenName = "I'm Not a Dog!";
        Date BDay = new Date(1979, 6, 1);
        Integer givenId = 1;
        testDog = new Dog(givenName, BDay, givenId);

        // WHEN

        Boolean actual = (testDog instanceof Dog);
        // THEN

        assertTrue(actual);
    }

    @Test
    public void IsItAMammalTest()
    {
        // GIVEN

        String givenName = "OK I Am A Mammal";
        Date BDay = new Date(1986, 2, 11);
        Integer givenId = 122;
        testDog = new Dog(givenName, BDay, givenId);

        // WHEN

        Boolean actual = (testDog instanceof Mammal);
        // THEN

        assertTrue(actual);
    }
}
