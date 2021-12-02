import java.util.Scanner;

public class VirtualPetShelterApp {

    public static void main(String[] args) {
        VirtualPetShelter virtualPetShelter = new VirtualPetShelter();
        Scanner scanner = new Scanner(System.in);

        boolean shouldContinue = true;

        System.out.println("\nThanks for volunteering at Matt's Virtual Pet Shelter!\n");

        while (shouldContinue) {

            System.out.println("| Name \t\t| Hunger \t| Thirst \t| Boredom \t|");
            System.out.println("-------------------------------------------------");
            for (int i = 0; i < virtualPetShelter.getVirtualPets().size(); i++) {
                VirtualPet currentVirtualPet = virtualPetShelter.getVirtualPets().get(i);
                String name = currentVirtualPet.getPetName();
                String hunger = "" + currentVirtualPet.getPetHunger();
                String thirst = "" + currentVirtualPet.getPetThirst();
                String boredom = "" + currentVirtualPet.getPetBoredom();

                System.out.println("| " + name + "\t\t| " + hunger + "\t\t| " + thirst + "\t\t| " + boredom + "\t\t");
            }

            System.out.println("\nWhat would you like to do?\n");
            System.out.println("1. Feed the pets");
            System.out.println("2. Water the pets");
            System.out.println("3. Play with a pet");
            System.out.println("4. Adopt a pet");
            System.out.println("5. Admit a pet");
            System.out.println("6. Quit");

            System.out.println("\nPlease enter a command: \n");
            String userInput = scanner.nextLine();

            if ("1".equals(userInput)) {
                //feed
                virtualPetShelter.feedAllPets();
                virtualPetShelter.tickAllPets();

            } else if ("2".equals(userInput)) {
                //water
                virtualPetShelter.waterAllPets();
                virtualPetShelter.tickAllPets();

            } else if ("3".equals(userInput)) {
                //play with certain pet
                System.out.println("\nWhich pet would you like to play with?\n");
                System.out.println("| Name \t\t| Description \t");
                System.out.println("-------------------------------------------------");
                for (int i = 0; i < virtualPetShelter.getVirtualPets().size(); i++) {
                    VirtualPet currentVirtualPet = virtualPetShelter.getVirtualPets().get(i);
                    String name = currentVirtualPet.getPetName();
                    String description = currentVirtualPet.getPetDescription();
                    System.out.println("| " + name + "\t\t| " + description + "\t");
                }
                System.out.println("Pet Name: ");
                String petName = scanner.nextLine();
                virtualPetShelter.playWithPet(petName);
                virtualPetShelter.tickAllPets();

            } else if ("4".equals(userInput)) {
                //adopt
                System.out.println("\nWhich pet would you like to adopt?\n");
                System.out.println("| Name \t\t| Description \t");
                System.out.println("-------------------------------------------------");
                for (int i = 0; i < virtualPetShelter.getVirtualPets().size(); i++) {
                    VirtualPet currentVirtualPet = virtualPetShelter.getVirtualPets().get(i);
                    String name = currentVirtualPet.getPetName();
                    String description = currentVirtualPet.getPetDescription();
                    System.out.println("| " + name + "\t\t| " + description + "\t");
                }
                System.out.println("Pet Name: ");
                String petName = scanner.nextLine();
                virtualPetShelter.removePet(petName);
                virtualPetShelter.tickAllPets();

            } else if ("5".equals(userInput)) {
                //admit
                System.out.println("What is the pet's name?");
                String petName = scanner.nextLine();

                System.out.println("Please describe your pet");
                String petDescription = scanner.nextLine();
                VirtualPet petToBeAdmitted = new VirtualPet(petName, petDescription);
                virtualPetShelter.intakePet(petToBeAdmitted);
                virtualPetShelter.tickAllPets();

            } else if ("6".equals(userInput)) {
                //exit app
                System.out.println("Thanks for your time!");
                shouldContinue = false;
            }
        }
    }
}
