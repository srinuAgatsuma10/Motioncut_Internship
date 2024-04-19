package com.MotionCut.innternship;

import java.util.Scanner;

public class TextBasedAdventureGame {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Welcome message
        System.out.println("------------Welcome to the Haunted Mansion!------------");
        System.out.println("You find yourself standing at the entrance of a spooky mansion.");
        System.out.println("Do you want to go inside or run away? (enter 'inside' or 'run')");

        // Get user decision (go inside or run away)
        String decision = scanner.nextLine();

        if (decision.equalsIgnoreCase("inside")) {
            // If user chooses to go inside
            System.out.println("You cautiously enter the mansion.");

            // Offer choices to explore different rooms
            System.out.println("Do you want to explore the living room or the kitchen? (enter 'living room' or 'kitchen')");
            decision = scanner.nextLine();

            if (decision.equalsIgnoreCase("living room")) {
                // If user chooses to explore the living room
                System.out.println("You find an old portrait of the mansion's previous owner.");

                // Offer choices to investigate the portrait or move on
                System.out.println("Do you want to investigate the portrait or move on? (enter 'investigate' or 'move on')");
                decision = scanner.nextLine();

                if (decision.equalsIgnoreCase("investigate")) {
                    // If user chooses to investigate the portrait
                    System.out.println("The portrait suddenly comes to life and attacks you!");

                    // Game over
                    System.out.println("You fight back and eventually defeat the portrait.");
                    System.out.println("Congratulations, you've made it out of the mansion alive!");
                } else if (decision.equalsIgnoreCase("move on")) {
                    // If user chooses to move on
                    System.out.println("You move on to the next room.");

                    // Game over
                    System.out.println("You find a secret passage leading to the mansion's exit.");
                    System.out.println("Congratulations, you've made it out of the mansion alive!");
                } else {
                    // Invalid input
                    System.out.println("That's not a valid decision. Please try again.");
                }
            } else if (decision.equalsIgnoreCase("kitchen")) {
                // If user chooses to explore the kitchen
                System.out.println("You find a large knife on the kitchen counter.");

                // Offer choices to take the knife or leave it
                System.out.println("Do you want to take the knife or leave it behind? (enter 'take' or 'leave')");
                decision = scanner.nextLine();

                if (decision.equalsIgnoreCase("take")) {
                    // If user chooses to take the knife
                    System.out.println("You take the knife and cautiously explore the mansion.");

                    // Offer choices to fight or run from the ghost
                    System.out.println("You find a ghostly figure in the living room.");
                    System.out.println("Do you want to fight the ghost with the knife or run away? (enter 'fight' or 'run')");
                    decision = scanner.nextLine();

                    if (decision.equalsIgnoreCase("fight")) {
                        // If user chooses to fight the ghost
                        System.out.println("You successfully fight off the ghost and make it out of the mansion alive!");
                    } else if (decision.equalsIgnoreCase("run")) {
                        // If user chooses to run away from the ghost
                        System.out.println("You drop the knife and run away as fast as you can.");
                        System.out.println("You make it out of the mansion alive, but you left the knife behind.");
                    } else {
                        // Invalid input
                        System.out.println("That's not a valid decision. Please try again.");
                    }
                } else if (decision.equalsIgnoreCase("leave")) {
                    // If user chooses to leave the knife
                    System.out.println("You leave the knife behind and explore the mansion without it.");

                    // Offer choices to fight or run from the ghost
                    System.out.println("You find a ghostly figure in the living room.");
                    System.out.println("Do you want to fight the ghost or run away? (enter 'fight' or 'run')");
                    decision = scanner.nextLine();

                    if (decision.equalsIgnoreCase("fight")) {
                        // If user chooses to fight the ghost
                        System.out.println("You bravely fight off the ghost, but you sustain some injuries.");
                        System.out.println("You make it out of the mansion alive, but you're injured.");
                    } else if (decision.equalsIgnoreCase("run")) {
                        // If user chooses to run away from the ghost
                        System.out.println("You run away as fast as you can and make it out of the mansion alive!");
                    } else {
                        // Invalid input
                        System.out.println("That's not a valid decision. Please try again.");
                    }
                } else {
                    // Invalid input
                    System.out.println("That's not a valid decision. Please try again.");
                }
            } else {
                // Invalid input
                System.out.println("That's not a valid decision. Please try again.");
            }
        } else if (decision.equalsIgnoreCase("run")) {
            // If user chooses to run away from the mansion
            System.out.println("You run away as fast as you can and make it out of the mansion alive!");
        } else {
            // Invalid input
            System.out.println("That's not a valid decision. Please try again.");
        }

        // Close the scanner to release resources
        scanner.close();
    }
}
