package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    @Test
    public void testSetName() {
        // Given
        String expectedName = "Zula";
        Cat cat = AnimalFactory.createCat(null, null);

        // When
        cat.setName(expectedName);

        // Then
        String actual = cat.getName();
        Assert.assertEquals(expectedName, actual);
    }

    // TODO - Create tests for `speak`
    @Test
    public void testSpeak() {
        // given
        String expectedSpoke = "meow!";
        Cat speaker = AnimalFactory.createCat(null, null);

        // Then
        speaker.speak();
        Assert.assertEquals("meow!", speaker.speak());
    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void testSetBirthDate() {
        // Given
        Date birthdate = new Date(1990, 3, 22);
        Cat cat = AnimalFactory.createCat(null, birthdate);

        // When
        cat.setBirthDate(birthdate);

        // Then
        Assert.assertEquals(birthdate, cat.getBirthDate());
    }

    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void testEat() {
    //Given
    Cat cat = AnimalFactory.createCat(null, null);

    // When
        cat.eat(new Food());
        int fed = 1;
        int actual = cat.getNumberOfMealsEaten();
    // Then
        Assert.assertEquals(fed, actual);
    }
    // TODO - Create tests for `Integer getId()`
    @Test
    public void testGetId() {
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Cat cat = AnimalFactory.createCat(null, null);
        Assert.assertEquals(cat.getId(), givenId);

    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void testAnimalInheritance() {
        Cat cat = AnimalFactory.createCat(null, null);
        Assert.assertTrue(cat instanceof Animal);
    }
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void testMammalInheritance() {
        Cat cat = AnimalFactory.createCat(null, null);
        Assert.assertTrue(cat instanceof Mammal);
    }
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }




}
