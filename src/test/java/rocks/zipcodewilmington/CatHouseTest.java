package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Optional;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void testAddCat() {
        // Given
        Integer givenId = 33;
        Cat cat = new Cat(null, null, givenId);

        // When
        CatHouse.add(cat);

        // Then
        Assert.assertEquals(cat, CatHouse.getCatById(givenId));
    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void testRemoveId() {
        // given
        String givenName = "nemo";
        Cat cat = AnimalFactory.createCat(givenName, null);
        CatHouse.clear();
        CatHouse.add(cat);

        // When
        CatHouse.remove(givenId);


        // Then
        Assert.assertEquals(null,CatHouse.getCatById(givenId));
    }
    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void testRemoveCat() {
        // Given
         String givenName = "goku";
         Cat cat = new Cat(givenName, null, null);
        CatHouse.add(cat);
         // When
        CatHouse.remove(cat);

        // Then
        Assert.assertEquals(givenName,cat.getName());
    }
    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void testGetCatById(){
        // Given
        Integer givenId = 5;
        Cat cat = new Cat(null, null, givenId);

        // When
        CatHouse.add(cat);
        // Then
        Assert.assertEquals(cat, CatHouse.getCatById(givenId));
    }
    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void testGetNumberOfCats() {
        // given
        String givenName = "Jaxo";
        Integer givenId = 22;
        Cat cat = new Cat(givenName, null, null);
        Cat cat2 = new Cat(null, null, givenId);

        // When
        CatHouse.add(cat);
        CatHouse.add(cat2);
        int numCats = 2;
        int getNumberCats = CatHouse.getNumberOfCats();

        // Then
        Assert.assertEquals(numCats, getNumberCats);
    }
}











