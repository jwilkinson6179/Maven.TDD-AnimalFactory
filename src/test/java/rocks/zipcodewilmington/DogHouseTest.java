package rocks.zipcodewilmington;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;
import java.util.Date;
import static org.junit.Assert.assertEquals;

    /**
     * @author leon on 4/19/18.
     */
    public class DogHouseTest {
        Dog testDogA;
        Dog testDogB;
        DogHouse testDogHouse;

        @Before
        public void setUp() throws Exception {

        }

        @After
        public void tearDown() throws Exception {
            DogHouse.clear();
        }

        @Test
        public void AddADog()
        {
            // GIVEN

            Integer expected = 2;
            testDogA = new Dog("Scraps", new Date(2018, 11, 8), 55);
            testDogB = new Dog("Milo", new Date(2018, 10, 31), 4);

            // WHEN

            testDogHouse.add(testDogA);
            testDogHouse.add(testDogB);
            Integer actual = testDogHouse.getNumberOfDogs();

            // THEN

            assertEquals(expected, actual);
        }

        @Test
        public void RemoveDogByIDTest()
        {
            // GIVEN
            Integer expectedBefore = 2;
            Integer expectedAfter = 1;
            testDogA = new Dog("Itchy", new Date(2020, 1, 1), 4);
            testDogB = new Dog("Scratchy", new Date(2019, 11, 4), 9);

            // WHEN

            testDogHouse.add(testDogA);
            testDogHouse.add(testDogB);
            Integer actualBefore = testDogHouse.getNumberOfDogs();
            testDogHouse.remove(4);
            Integer actualAfter = testDogHouse.getNumberOfDogs();

            // THEN

            assertEquals(expectedBefore, actualBefore);
            assertEquals(expectedAfter, actualAfter);
        }

        @Test
        public void RemoveDogByDogTest()
        {
            // GIVEN
            Integer expectedBefore = 2;
            Integer expectedAfter = 1;
            testDogA = new Dog("Spike", new Date(2017, 8, 65), 14);
            testDogB = new Dog("Kujo", new Date(2019, 3, 155), 19);

            // WHEN

            testDogHouse.add(testDogA);
            testDogHouse.add(testDogB);
            Integer actualBefore = testDogHouse.getNumberOfDogs();
            testDogHouse.remove(testDogA);
            Integer actualAfter = testDogHouse.getNumberOfDogs();

            // THEN

            assertEquals(expectedBefore, actualBefore);
            assertEquals(expectedAfter, actualAfter);
        }

        @Test
        public void GetDogByID() {
            // GIVEN

            testDogA = new Dog("Mr. Ruff", new Date(2008, 5, 31), 6179);

            // WHEN

            testDogHouse.add(testDogA);
            Dog actual = testDogHouse.getDogById(6179);

            // THEN

            assertEquals(testDogA, actual);
        }

        @Test
        public void GetNumberOfDog() {
            // GIVEN

            Integer expected = 0;

            // WHEN

            Integer actual = testDogHouse.getNumberOfDogs();

            // THEN

            assertEquals(expected, actual);
        }

        // TODO: Test clear
    }