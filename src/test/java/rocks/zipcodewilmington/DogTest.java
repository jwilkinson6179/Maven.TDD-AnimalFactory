package rocks.zipcodewilmington;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;

import java.util.Date;

import static org.junit.Assert.assertEquals;

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

        // THEN

        // WHEN

        assertEquals(1, 2);
    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
}
