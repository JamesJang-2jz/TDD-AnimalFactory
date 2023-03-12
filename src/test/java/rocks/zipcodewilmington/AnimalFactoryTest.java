package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Calendar;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void testCreatedog() {
        // Given
        String givenName = "Daisy";
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2002);
        cal.set(Calendar.MONTH, Calendar.MARCH);
        cal.set(Calendar.DAY_OF_MONTH, 22);
        Date birthdate = cal.getTime();
        Dog doggo = AnimalFactory.createDog(givenName, birthdate);
        // When

        // Then
        Assert.assertEquals(givenName, doggo.getName());
        Assert.assertEquals(birthdate, doggo.getBirthDate());
    }
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
        @Test
        public void testCreateCat() {
            // given
            String givenName = "mocho";
            Date birthdate = new Date (1900, 4, 2);
            Cat catto = AnimalFactory.createCat(givenName, birthdate);
            // When

            // Then
            Assert.assertEquals(givenName, catto.getName());
            Assert.assertEquals(birthdate, catto.getBirthDate());

        }
//        //Given
//        String expectedName = "Daisy";
//        Date expectedDate = new Date();
//
//        // When
//        createDog dog = new AnimalFactory(expectedName, expectedDate);
//
//        // Then
//        String actualName = AnimalFactory.getName();
//        Date actualDate = AnimalFactory.getDate();
//
//        Assert.assertEquals(expectedName, actualName);
//        Assert.assertEquals(expectedDate, actualDate);
    }

