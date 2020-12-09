package com.company;


import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {


    public static void display_menu1() {

        System.out.println("1) Add and delete a song\n2) game\n3) delete all");
        System.out.print("Selection : ");

    }

    public static void menu1() {

        while (true) {
            Scanner menuInput1 = new Scanner(System.in);
            String letter = menuInput1.nextLine();


            if (letter.equals("1")) {
                System.out.println("you are going to modify the playlist");
                menu2();
                break;
            } else if (letter.equals("2")) {
                System.out.println("you are going to play a game");
                System.exit(0);
                break;
            } else if (letter.equals("3")) {
                System.out.println("you are going to delete all song");
                System.exit(0);
                break;
            } else {
                System.err.println("Please enter 1 2 or 3");

            }
        }

    }


    public static void display_menu2() {


    }

    public static void menu2() {

        while (true) {
            System.out.println("1) Add a song\n2) delete a song");
            System.out.print("Selection : ");
            Scanner menuInput2 = new Scanner(System.in);
            String letter = menuInput2.nextLine();


            if (letter.equals("1")) {
                System.out.println("you are going to Add a song");
                try (Scanner scannerchansonadd = new Scanner(System.in)) {
                    System.out.print(" Add a song : ");
                    String chansonadd = scannerchansonadd.nextLine();
                    List playlist = new ArrayList();
                    playlist.add(chansonadd);
                    Iterator success = playlist.iterator();
                    System.out.print(playlist);
                    System.out.print(" you add " + chansonadd);

                }
                System.exit(0);

            } else if (letter.equals("2")) {
                System.out.println("you are going to delete a song");
                break;
            } else {
                System.err.println("Please enter 1 or 2");

            }
        }

    }

    public static void main(String[] args) {
        // Menu
        display_menu1();
        menu1();
        display_menu2();
        menu2();

    }
}