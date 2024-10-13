import java.util.Scanner;

public class EnchantedForestAdventure {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Enchanted Forest Adventure!");
        System.out.println("In this mysterious forest, you must choose wisely to survive...");
        System.out.println("-----------------------------------------------------------");

        // Start the game
        startAdventure(scanner);
    }

    public static void startAdventure(Scanner scanner) {
        System.out.println("You find yourself standing at the entrance of the Enchanted Forest.");
        System.out.println("You see a path leading deeper into the woods. Do you wish to enter? (yes/no)");
        String choice1 = scanner.nextLine().toLowerCase();

        if (choice1.equals("yes")) {
            System.out.println("You step into the forest, and the air around you becomes thick with magic.");
            findItem(scanner);
        } else {
            System.out.println("You decide to stay outside the forest. Perhaps adventure is not for you today.");
            System.out.println("Game over.");
        }
    }

    public static void findItem(Scanner scanner) {
        System.out.println("After walking for a while, you stumble upon a mysterious object. It's glowing faintly.");
        System.out.println("Do you pick it up? (yes/no)");
        String choice2 = scanner.nextLine().toLowerCase();

        if (choice2.equals("yes")) {
            System.out.println("You pick up the object, and it transforms into a golden key.");
            meetCreature(scanner, "golden key");
        } else {
            System.out.println("You ignore the object and continue walking deeper into the forest.");
            meetCreature(scanner, "empty hands");
        }
    }

    public static void meetCreature(Scanner scanner, String item) {
        System.out.println("Suddenly, a mythical creature appears in front of you, blocking your path.");
        System.out.println("It eyes you carefully. \"What do you bring to offer me?\" it asks.");
        System.out.println("Do you give the creature your " + item + "? (yes/no)");
        String choice3 = scanner.nextLine().toLowerCase();

        if (choice3.equals("yes") && item.equals("golden key")) {
            System.out.println("The creature smiles. \"You have passed the test of generosity,\" it says.");
            System.out.println("It gives you a magical map and vanishes.");
            findExit(scanner, "map");
        } else if (choice3.equals("yes") && item.equals("empty hands")) {
            System.out.println("The creature frowns. \"You bring me nothing,\" it says, disappointed.");
            System.out.println("You try to apologize, but the creature banishes you from the forest.");
            System.out.println("Game over.");
        } else {
            System.out.println("You refuse to give the creature anything.");
            System.out.println("The creature becomes angry and casts a spell that turns you into a tree.");
            System.out.println("Game over.");
        }
    }

    public static void findExit(Scanner scanner, String tool) {
        System.out.println("Using the " + tool + " given to you, you make your way through the forest.");
        System.out.println("You finally see the light of an exit up ahead. Do you run towards it? (yes/no)");
        String choice4 = scanner.nextLine().toLowerCase();

        if (choice4.equals("yes")) {
            System.out.println("You sprint towards the exit, leaving the magical forest behind.");
            System.out.println("Congratulations! You have successfully completed the Enchanted Forest Adventure!");
        } else {
            System.out.println("You decide to stay in the forest a little longer.");
            System.out.println("Unfortunately, the magic in the forest overwhelms you, and you get lost.");
            System.out.println("Game over.");
        }
    }
}
