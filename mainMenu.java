package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class mainMenu {

    public static void display_menu1() {

        System.out.println("Welcome dear patient! You can listen your favorite songs or play to the best game ever!\n");

        System.out.println("1) Listen your Playlist. Write '1'\n2) Play to Colossal Cave. Write '2'\n");
        System.out.print("Selection : ");
    }

    public static void menu1() {

        while (true) {
            Scanner menuInput1 = new Scanner(System.in);
            String letter = menuInput1.nextLine();


            if (letter.equals("1")) {
                System.out.println("You are going to modify the playlist.");
                break;
            } else if (letter.equals("2")) {
                System.out.println("You are going to play a game.");
                break;
            }else {
                System.err.println("Please enter 1 or 2.");
            }
        }
    }


    public static void display_menu2() {

        System.out.println("1) Add a song. Write '1'\n2) Delete a song. Write '2'\n3) Delete all songs. Write'3'");
        System.out.print("Selection : \n");

    }

    public static void menu2() {

        while (true) {
            Scanner menuInput2 = new Scanner(System.in);
            String letter = menuInput2.nextLine();


            if (letter.equals("1")) {
                System.out.println("You are going to Add a song.\n");
                try (Scanner scannerChansonAdd = new Scanner(System.in)) {
                    System.out.print(" Add a song : ");
                    String chansonAdd = scannerChansonAdd.nextLine();
                    List playlist = new ArrayList();
                    playlist.add(chansonAdd);
                    Iterator success = playlist.iterator();
                    System.out.print(playlist);
                    System.out.print(" You add " + chansonAdd);
                    mainMenu.display_menu2();
                    return;
                }

            } else if (letter.equals("2")) {
                System.out.println("You are going to delete a song");
                break;
            } else if (letter.equals("3")) {
                System.out.println("You are going to delete all song.");
                break;
            } else {
                System.err.println("Please enter 1, 2 or 3.");

            }
        }

    }
}
