package rocks.zipcodewilmington;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

import static org.junit.Assert.assertTrue;

/**
 * @author leon on 4/19/18.
 */

public class AnimalFactoryTest {

    Dog testDog;
    Cat testCat;
    AnimalFactory testFactory;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void FactoryMakesADogTest() {
        // GIVEN

        testFactory = new AnimalFactory();
        String givenName = "RoboDog";
        Date givenDate = new Date(2020, 2, 15);

        // WHEN

        Animal actual = testFactory.createDog(givenName, givenDate);

        // THEN

        assertTrue(actual instanceof Dog);
    }

    @Test
    public void FactoryMakesACatTest() {
        // GIVEN

        testFactory = new AnimalFactory();
        String givenName = "CyberKitty";
        Date givenDate = new Date(2020, 2, 14);

        // WHEN

        Animal actual = testFactory.createCat(givenName, givenDate);

        // THEN

        assertTrue(actual instanceof Cat);
    }
}