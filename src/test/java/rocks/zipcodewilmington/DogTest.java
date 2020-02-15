package rocks.zipcodewilmington;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;

import java.util.Date;

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
        Assert.assertEquals("Milo", actual);
    }

    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
}
