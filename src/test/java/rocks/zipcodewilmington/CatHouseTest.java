package rocks.zipcodewilmington;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.awt.*;
import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    Cat testCatA;
    Cat testCatB;
    Dog testDog;
    CatHouse testCatHouse;
    DogHouse testDogHouse;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
        CatHouse.clear();
        DogHouse.clear();
    }

    @Test
    public void AddACat()
    {
        // GIVEN

        Integer expected = 2;
        testCatA = new Cat("Ash", new Date(2018, 11, 8), 55);
        testCatB = new Cat("Cinder", new Date(2018, 10, 31), 4);

        // WHEN

        testCatHouse.add(testCatA);
        testCatHouse.add(testCatB);
        Integer actual = testCatHouse.getNumberOfCats();

        // THEN

        assertEquals(expected, actual);
    }

    @Test
    public void RemoveCatByIDTest()
    {
        // GIVEN
        Integer expectedBefore = 2;
        Integer expectedAfter = 1;
        testCatA = new Cat("Fleabag", new Date(2020, 1, 1), 4);
        testCatB = new Cat("Dirtball", new Date(2019, 11, 4), 9);

        // WHEN

        testCatHouse.add(testCatA);
        testCatHouse.add(testCatB);
        Integer actualBefore = testCatHouse.getNumberOfCats();
        testCatHouse.remove(4);
        Integer actualAfter = testCatHouse.getNumberOfCats();

        // THEN

        assertEquals(expectedBefore, actualBefore);
        assertEquals(expectedAfter, actualAfter);
    }

    @Test
    public void RemoveCatByCatTest()
    {
        // GIVEN
        Integer expectedBefore = 2;
        Integer expectedAfter = 1;
        testCatA = new Cat("Fluff", new Date(2017, 8, 65), 14);
        testCatB = new Cat("Snuffle", new Date(2019, 3, 155), 19);

        // WHEN

        testCatHouse.add(testCatA);
        testCatHouse.add(testCatB);
        Integer actualBefore = testCatHouse.getNumberOfCats();
        testCatHouse.remove(testCatA);
        Integer actualAfter = testCatHouse.getNumberOfCats();

        // THEN

        assertEquals(expectedBefore, actualBefore);
        assertEquals(expectedAfter, actualAfter);
    }

    @Test
    public void GetCatByID() {
        // GIVEN

        testCatA = new Cat("Mad Max", new Date(2008, 5, 31), 6179);

        // WHEN

        testCatHouse.add(testCatA);
        Cat actual = testCatHouse.getCatById(6179);

        // THEN

        assertEquals(testCatA, actual);
    }

    @Test
    public void GetNumberOfCat() {
        // GIVEN

        Integer expected = 0;

        // WHEN

        Integer actual = testCatHouse.getNumberOfCats();

        // THEN

        assertEquals(expected, actual);
    }

    // TODO: Test clear()
}
