package rocks.zipcodewilmington;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.Assert.assertEquals;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {

    Cat testCat;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        testCat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = testCat.getName();
        Date retrievedBirthDate = testCat.getBirthDate();
        Integer retrievedId = testCat.getId();

        // Then (we expect the given data, to match the retrieved data)
        assertEquals(givenName, retrievedName);
        assertEquals(givenBirthDate, retrievedBirthDate);
        assertEquals(givenId, retrievedId);
    }

    @Test
    public void SetNameTest(){
        // GIVEN
        String expected = "Biggles";
        String givenName = "Toughie";
        Date givenBirthDate = new Date(2011, 5, 11);
        Integer givenId = 6;
        testCat = new Cat(givenName, givenBirthDate, givenId);

        //WHEN
        testCat.setName("Biggles");
        String actual = testCat.getName();
        //THEN


        assertEquals(expected, actual);
    }

    @Test
    public void SpeakTest()
    {
        // GIVEN

        String givenName = "Santa Paws";
        Date givenBirthDate = new Date(2019, 12, 25);
        Integer givenId = 88;
        testCat = new Cat(givenName, givenBirthDate, givenId);
        String expected = "meow!";
        // WHEN

        String actual = testCat.speak();
        // THEN

        assertEquals(expected, actual);
    }

    @Test
    public void SetBirthDateTest()
    {
        // GIVEN
        Date expected = new Date(2010, 6, 1);
        String givenName = "Fritz";
        Date givenBirthDate = new Date(2020, 1, 1);
        Integer givenId = 100;
        testCat = new Cat(givenName, givenBirthDate, givenId);
        // WHEN
        Date updatedBirthDate = new Date(2010, 6, 1);
        testCat.setBirthDate(updatedBirthDate);
        Date actual = testCat.getBirthDate();
        // THEN

        assertEquals(expected, actual);
    }

    @Test
    public void EatFoodTestThreeMeals()
    {
        // GIVEN
        Food givenMeal = new Food();
        Integer expected = 3;
        String givenName = "Mr. Meow";
        Date givenBirthDate = new Date(2016, 1, 1);
        Integer givenId = 74;
        testCat = new Cat(givenName, givenBirthDate, givenId);

        // WHEN
        testCat.eat(givenMeal);
        testCat.eat(givenMeal);
        testCat.eat(givenMeal);
        Integer actual = testCat.getNumberOfMealsEaten();

        //THEN

        assertEquals(expected, actual);
    }

    @Test
    public void GetIdTest() {
        // GIVEN
        Integer expected = 321;
        String givenName = "Bojangles";
        Date givenBirthDate = new Date(2009, 4, 20);
        Integer givenId = 321;
        testCat = new Cat(givenName, givenBirthDate, givenId);

        // WHEN
        Integer actual = testCat.getId();

        // THEN

        assertEquals(expected, actual);
    }

    @Test
    public void IsItACatTest() {
        // GIVEN
        String givenName = "Mittens";
        Date givenDate = new Date( 2019, 6, 11);
        Integer givenId = 5555;
        testCat = new Cat(givenName, givenDate, givenId);

        // WHEN

        Boolean actual = (testCat instanceof Cat);

        // THEN

        assertEquals(true, actual);
    }

    @Test
    public void IsItAMammalTest() {
        // GIVEN
        String givenName = "Scruffie";
        Date givenDate = new Date( 2005, 3, 10);
        Integer givenId = 1;
        testCat = new Cat(givenName, givenDate, givenId);

        // WHEN

        Boolean actual = (testCat instanceof Mammal);

        // THEN

        assertEquals(true, actual);
    }
}
