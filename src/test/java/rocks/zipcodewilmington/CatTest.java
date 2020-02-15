package rocks.zipcodewilmington;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;

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

    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
}
