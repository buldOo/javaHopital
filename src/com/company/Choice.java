package com.company;

import java.util.Scanner;



public class Choice {

    private Scanner scan = new Scanner(System.in);
    private Playlist playlist = new Playlist();

    public int choice() {
        int selection2;

        System.out.print("\nWelcome dear patient! You can listen your playlist or play to Colossal Cave!"
                + "\n1- Play to Colossal Cave" + "\n2- Listen your Music" + "\n3- Exit" + "\nSelection: ");
        selection2 = scan.nextInt();
        System.out.print("\n");

        return selection2;
    }

    public void choiceMenu() {

        int selection = choice();

        switch (selection) {
            case 1:
                ColossalCave.jeu();
                break;
            case 2:

                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("\nPlease enter 1, 2 or 3.\n");
                choiceMenu();
        }


    }
}
