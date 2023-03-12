package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void testAddDog() {
        // given
        String givenName = "Kobe";
        Dog doggo = AnimalFactory.createDog(givenName, null);
        // When
        DogHouse.add(doggo);
        // Then
        Assert.assertEquals(givenName, doggo.getName());
    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void testRemoveId() {
        // Given
        String givenName = "popo";
        Dog dog = AnimalFactory.createDog(givenName, null);
        DogHouse.clear();
        DogHouse.add(dog);

        // When
        Dog newDogId = DogHouse.getDogById(dog.getId());
        // Then
        Assert.assertEquals(dog, newDogId);
    }

    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void testRemoveDog(){
        // Given
        String givenName = "piccolo";
        Dog doggo = AnimalFactory.createDog(givenName, null);
        DogHouse.add(doggo);
        // When
        DogHouse.remove(doggo);

        // Then
        Assert.assertEquals(null,DogHouse.getDogById(doggo.getId()));
    }
    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void testGetDogById() {
        // given
        String givenName = "Levi";
        Dog dog = AnimalFactory.createDog(givenName, null);
        // When
        DogHouse.add(dog);
        // Then
        Assert.assertEquals(dog, DogHouse.getDogById(dog.getId()));
    }

    // TODO - Create tests for `Integer getNumberOfDogs()`
    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
}
