import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetShelterTest {

    @Test
    public void findByNameBobShouldReturnVirtualPetNameBob() {
//      arrange
        VirtualPetShelter underTest = new VirtualPetShelter();
        String searchName = "Bob";

//      act
        VirtualPet actualVirtualPet = underTest.findByName(searchName);

//      assert
        VirtualPet expectedVirtualPet = new VirtualPet("Bob", "He has been in the shelter for a very long time");

        assertEquals(expectedVirtualPet, actualVirtualPet);
    }

    @Test
    public void findByNameJesusShouldReturnVirtualPetNameJesus() {
//      arrange
        VirtualPetShelter underTest = new VirtualPetShelter();
        String searchName = "Jesus";

//      act
        VirtualPet actualVirtualPet = underTest.findByName(searchName);

//      assert
        VirtualPet expectedVirtualPet = new VirtualPet("Jesus", "He enjoys changing his water into something stronger", 20, 30, 50);
        assertEquals(expectedVirtualPet, actualVirtualPet);
    }

    @Test
    public void intakePetShouldAddVirtualPetToShelter() {
//      arrange
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet newVirtualPet = new VirtualPet("New Pet", "New Pet Description");


//      act
        underTest.intakePet(newVirtualPet);
        int actualSize = underTest.getVirtualPets().size();

//      assert
        int expectedSize = 3;
        assertEquals(expectedSize, actualSize);
    }

    @Test
    public void removePetShouldRemoveVirtualPetBasedOnNameFromShelter() {
//      arrange
        VirtualPetShelter underTest = new VirtualPetShelter();
        String adoptedVirtualPet = "Bob";


//      act
        underTest.removePet(adoptedVirtualPet);
        int actualSize = underTest.getVirtualPets().size();

//      assert
        int expectedSize = 1;
        assertEquals(expectedSize, actualSize);
    }

    @Test
    public void shouldChangeHungerValueForFirstPetInShelter() {
//      arrange
        VirtualPetShelter underTest = new VirtualPetShelter();


//      act
        underTest.feedAllPets();


//      assert
        assertEquals(0, underTest.getVirtualPets().get(0).getPetHunger());

    }

    @Test
    public void shouldChangeHungerValueForSecondPetInShelter() {
//      arrange
        VirtualPetShelter underTest = new VirtualPetShelter();


//      act
        underTest.feedAllPets();


//      assert
        assertEquals(5, underTest.getVirtualPets().get(1).getPetHunger());

    }

    @Test
    public void shouldChangeThirstValueForSecondPetInShelter() {
//      arrange
        VirtualPetShelter underTest = new VirtualPetShelter();


//      act
        underTest.waterAllPets();


//      assert
        assertEquals(15, underTest.getVirtualPets().get(1).getPetThirst());

    }

    @Test
    public void usingTheTickMethodShouldChangeThirstValueForSecondPetInShelter() {
//      arrange
        VirtualPetShelter underTest = new VirtualPetShelter();


//      act
        underTest.tickAllPets();


//      assert
        assertEquals(35, underTest.getVirtualPets().get(1).getPetThirst());

    }

    @Test
    public void playWithPetShouldChangeBoredomValueToZeroForBob() {
//      arrange
        VirtualPetShelter underTest = new VirtualPetShelter();
        String name = "Bob";

//      act
        underTest.playWithPet(name);


//      assert
        assertEquals(0, underTest.getVirtualPets().get(0).getPetBoredom());

    }


}
