public class VirtualPet {

    private int petHunger;
    private int petThirst;
    private int petBoredom;
    private String petName;
    private String petDescription;


    //Constructor
    public VirtualPet(String petName, String petDescription) {
        this.petName = petName;
        this.petDescription = petDescription;
        this.petHunger = 10;
        this.petThirst = 15;
        this.petBoredom = 5;
    }

    public VirtualPet(String petName, String petDescription, int petHunger, int petThirst, int petBoredom) {
        this.petName = petName;
        this.petDescription = petDescription;
        this.petHunger = petHunger;
        this.petThirst = petThirst;
        this.petBoredom = petBoredom;
    }

    public void tick() {
        petHunger += 5;
        petThirst += 5;
        petBoredom += 5;
    }

    public void feed() {
        petHunger -= 15;
        petThirst += 10;
        petBoredom += 5;
        if (petHunger < 0) {
            petHunger = 0;
        }
    }

    public void water() {
        petThirst -= 15;
        petHunger += 10;
        petBoredom += 5;
        if (petThirst < 0) {
            petThirst = 0;
        }
    }

    public void play() {
        petBoredom -= 15;
        petThirst += 10;
        petHunger += 10;
        if (petBoredom < 0) {
            petBoredom = 0;
        }
    }

    public String getPetName() {
        return petName;
    }

    public int getPetHunger() {
        return petHunger;
    }

    public int getPetThirst() {
        return petThirst;
    }

    public int getPetBoredom() {
        return petBoredom;
    }

    public String getPetDescription() {
        return petDescription;
    }

    @Override
    public boolean equals(Object o) {
        VirtualPet that = (VirtualPet) o;
        return this.petName.equals(that.getPetName());

    }

}
