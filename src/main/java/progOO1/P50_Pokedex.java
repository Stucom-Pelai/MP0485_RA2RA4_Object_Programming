package main.java.progOO1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * <b>Content</b> arraylist, wrappers and methods
 * <hr/>
 * <br/>
 * <img src="../../../../javadoc/resources/P50_Pokedex.png">
 */
public class P50_Pokedex {

    private static final int MAX_POKEMON = 30;
    private static ArrayList<String> pokemonList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1) Fill Pokedex automatically");
            System.out.println("2) Add Pokemon");
            System.out.println("3) Add Pokemon at position");
            System.out.println("4) Delete Pokemon by name");
            System.out.println("5) Delete Pokemon at position");
            System.out.println("6) Find Pokemon");
            System.out.println("7) Show All Pokemon");
            System.out.println("8) Get Pokemon at position");
            System.out.println("9) Count Pokemon");
            System.out.println("10) Hack Pokedex");
            System.out.println("11) Erase Pokedex info");
            System.out.println("12) Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
//                    fillPokedexAuto();
                    break;
                case 2:
                    System.out.print("Enter the name of the Pokemon: ");
//                    addPokemon(scanner.nextLine());
                    break;
                case 3:
                    System.out.print("Enter the position: ");
                    int pos = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    System.out.print("Enter the name of the Pokemon: ");
//                    addPokemonAtPosition(pos, scanner.nextLine());
                    break;
                case 4:
                    System.out.print("Enter the name of the Pokemon to delete: ");
//                    deletePokemon(scanner.nextLine());
                    break;
                case 5:
                    System.out.print("Enter the position to delete: ");
//                    deletePokemonAtPosition(scanner.nextInt());
                    scanner.nextLine();
                    break;
                case 6:
                    System.out.print("Enter the name of the Pokemon to find: ");
//                    findPokemon(scanner.nextLine());
                    break;
                case 7:
//                    showAllPokemon();
                    break;
                case 8:
                    System.out.print("Enter the position: ");
//                    getPokemonAtPosition(scanner.nextInt());
                    scanner.nextLine();
                    break;
                case 9:
//                    countPokemon();
                    break;
                case 10:
//                    hackPokedex();
                    break;
                case 11:
//                    erasePokedexInfo();
                    break;
                case 12:
                    System.out.println("Exiting the Pokedex. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option.");
            }
        }
    }

    /**
     * Fills the Pokedex with 5 default Pokemon entries for testing purposes.
     * Ensures that no duplicate Pokemon are added. Displays how many of the 5
     * Pokemon were actually added.
     */
    // complete the method fillPokedexAuto here    

    /**
     * Adds a Pokemon to the first available position in the Pokedex. Asks the
     * user for a Pokemon name. If the Pokemon already exists, it is not added
     * and the user is notified.
     */
    // complete the method addPokemon here 
    

    /**
     * Adds a Pokemon to a specific position in the Pokedex. Prompts the user
     * for a position and a Pokemon name. If the position is occupied, notifies
     * the user. Otherwise, adds the Pokemon at that position.
     */
    // complete the method addPokemonAtPosition here 
    

    /**
     * Deletes a Pokemon from the Pokedex by its name. Prompts the user for the
     * Pokemon name. If the Pokemon does not exist, the user is informed.
     */
    // complete the method deletePokemon here 
    

    /**
     * Deletes the Pokemon located at a specific position in the Pokedex.
     * Prompts the user for a position. If no Pokemon is found at that position,
     * the user is informed.
     */
    // complete the method deletePokemonAtPosition here 
    

    /**
     * Searches for a Pokemon in the Pokedex by its name. Displays the Pokemon's
     * name and its position. If the Pokemon is not found, the user is notified.
     */
    // complete the method findPokemon here 
    

    /**
     * Displays all Pokemon currently stored in the Pokedex. Each Pokemon is
     * shown on a separate line, prefixed with a dash (e.g., "- Pikachu"). If
     * the Pokedex is empty, the user is informed.
     */
    // complete the method showAllPokemon here 
    

    /**
     * Retrieves and displays the Pokemon at a specified position in the
     * Pokedex. If no Pokemon is found at the given position, the user is
     * informed.
     */
    // complete the method getPokemonAtPosition here 
    

    /**
     * Displays the total number of Pokemon currently stored in the Pokedex.
     */
    // complete the method countPokemon here 
    

    /**
     * Fills all positions in the Pokedex with "Ditto".
     *
     */
    // complete the method hackPokedex here 
    

    /**
     * Clears all Pokemon data from the Pokedex, resetting it to an empty state.
     */
    // complete the method erasePokedexInfo here 
    
}
