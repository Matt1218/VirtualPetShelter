import java.util.ArrayList;

public class VirtualPetShelter {

    private ArrayList<VirtualPet> virtualPets = new ArrayList<>();

    public VirtualPetShelter() {
        VirtualPet defaultVirtualPet1 = new VirtualPet("Bob", "He has been in the shelter for a very long time");
        virtualPets.add(defaultVirtualPet1);

        VirtualPet defaultVirtualPet2 = new VirtualPet("Jesus", "He enjoys changing his water into something stronger", 20, 30, 50);
        virtualPets.add(defaultVirtualPet2);

    }

    public ArrayList<VirtualPet> getVirtualPets() {
        return virtualPets;
    }

    public VirtualPet findByName(String name) {

        for (int i = 0; i < virtualPets.size(); i++) {
            VirtualPet currentVirtualPetToCompare = virtualPets.get(i);
            if (name.equals(currentVirtualPetToCompare.getPetName())) {
                return currentVirtualPetToCompare;
            }
        }
        return null;
    }

    public void intakePet(VirtualPet newVirtualPet) {
        virtualPets.add(newVirtualPet);
    }


    public void removePet(String name) {
        for (int i = 0; i < virtualPets.size(); i++) {
            VirtualPet currentVirtualPetToCompare = virtualPets.get(i);
            if (name.equals(currentVirtualPetToCompare.getPetName())) {
                virtualPets.remove(i);
            }
        }

    }

    public void feedAllPets() {
        for (int i = 0; i < virtualPets.size(); i++) {
            virtualPets.get(i).feed();
        }

    }

    public void waterAllPets() {
        for (int i = 0; i < virtualPets.size(); i++) {
            virtualPets.get(i).water();
        }
    }

    public void playWithPet(String name) {
        VirtualPet virtualPetToPlayWith = findByName(name);
        if (virtualPetToPlayWith != null) {
            virtualPetToPlayWith.play();

        }

    }

    public void tickAllPets() {
        for (int i = 0; i < virtualPets.size(); i++) {
            virtualPets.get(i).tick();
        }

    }
}
