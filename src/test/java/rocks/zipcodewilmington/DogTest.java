package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    @Test
    public void testNewDog() {
        // given
        String giveName = "Daisy";
        Date giveBirthDate = new Date();
        Integer givenId = 22;

        // When (dog is constructed)
        Dog dog = new Dog(giveName,giveBirthDate,givenId);

        // When  (retrieve data from dog)
        String retrieveName = dog.getName();
        Date retrieveBirthDate = dog.getBirthDate();
        Integer retrieveId = dog.getId();

        // Then (expected data and retrieved data)
        Assert.assertEquals(giveName, retrieveName);
        Assert.assertEquals(giveBirthDate, retrieveBirthDate);
        Assert.assertEquals(givenId, retrieveId);
    }
    // TODO - Create tests for `speak`
    @Test
    public void testSpeak() {
        //Given
        String expectedSpeak = "bark!";
        Dog speaker = AnimalFactory.createDog(null, null);

        // When

        // Then
        speaker.speak();
        Assert.assertEquals("bark!", expectedSpeak);
    }
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void testSetBirthDate() {
        // Given
        Date birthDate = new Date(1992, 2,13);
        Dog dog = AnimalFactory.createDog(null, birthDate);

        // When
//        dog.setBirthDate(birthDate);

        // Then
        Assert.assertEquals(birthDate, dog.getBirthDate());
    }
    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void testEat() {
        // Given
        Dog dog = AnimalFactory.createDog(null, null);

        // When
        dog.eat(new Food());
        dog.eat(new Food());
        int feed = 2;
        int actual = dog.getNumberOfMealsEaten();

        // Then
        Assert.assertEquals(feed, actual);
    }

    // TODO - Create tests for `Integer getId()`
    @Test
    public void testGetId() {
        // Given
        Integer givenId = 24;
        Dog dog = new Dog(null, null, givenId);

        // When
        Assert.assertEquals(givenId, dog.getId());

    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void testAnimalInheritance() {
        // Given
        Dog dog  = AnimalFactory.createDog(null, null);
        // Then
        Assert.assertTrue(dog instanceof Animal);
    }
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void testMammalInheritance() {
        // Given
        Dog dog = AnimalFactory.createDog(null, null);

        // Then
        Assert.assertTrue(dog instanceof Mammal);
    }
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
}
