package JavaBasics;

import java.util.ArrayList;
import java.util.Scanner;

public class Vegetables {
    public static void main(String[] args) {
        // Create an ArrayList to store favorite vegetables
        ArrayList<String> vegetables = new ArrayList<>();

        // Add favorite vegetables to the list
        vegetables.add("Potato");
        vegetables.add("Tomato");
        vegetables.add("Onion");
        vegetables.add("Carrot");

        // Display the original list of vegetables
        System.out.println("Original list of vegetables: ");
        displayList(vegetables);

        // Perform operations on the list
        Scanner scanner = new Scanner(System.in);

        // Display the available commands to the user
        System.out.println("\nEnter 'add' to add a vegetable");
        System.out.println("Enter 'remove' to remove a vegetable");
        System.out.println("Enter 'display' to display the list");
        System.out.println("Enter 'exit' to exit");

        // Continuously prompt the user for commands until they choose to exit
        while (true) {
            System.out.print("\nEnter command: ");
            String command = scanner.next();

            switch (command.toLowerCase()) {
                case "add":
                    // Prompt for vegetable name and index to add it
                    System.out.println("Enter the vegetable to add: ");
                    String newVegetable = scanner.next();
                    System.out.println("Enter the index to add the vegetable: ");
                    int index = scanner.nextInt();
                    if (index >= 0 && index <= vegetables.size()) {
                        vegetables.add(index, newVegetable);
                        System.out.println(newVegetable + " has been added to the list at index " + index + ".");
                    } else {
                        System.out.println("Invalid index. Please enter a valid index.");
                    }
                    break;
                case "remove":
                    // Prompt for index to remove the vegetable
                    System.out.println("Enter the index of the vegetable to remove: ");
                    index = scanner.nextInt();
                    if (index >= 0 && index < vegetables.size()) {
                        System.out.println(vegetables.get(index) + " has been removed from the list.");
                        vegetables.remove(index);
                    } else {
                        System.out.println("Invalid index. Please enter a valid index.");
                    }
                    break;
                case "display":
                    // Display the updated list of vegetables
                    System.out.println("Updated list of vegetables: ");
                    displayList(vegetables);
                    break;
                case "exit":
                    // Exit the program
                    System.out.println("Exiting the program...");
                    scanner.close();
                    System.exit(0);
                default:
                    // Handle invalid commands
                    System.out.println("Invalid command. Please enter a valid command.");
            }
        }
    }

    // Method to display the list of vegetables
    public static void displayList(ArrayList<String> list) {
        for (String vegetable : list) {
            System.out.println(vegetable);
        }
    }
}
