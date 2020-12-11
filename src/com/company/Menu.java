package com.company;

import java.util.Scanner;

public class Menu {

    public static void printError(){
        System.out.println("\nThat is not a valid selection!\n");
    }
    public static void playlistEmpty(){ System.out.println("\nThe Playlist is empty\n"); }


    private Scanner scan = new Scanner(System.in);
    private Playlist playlist = new Playlist();

    //Display a menu, prompts for user input (int selection), and returns the input.
    public String showMenu() {
        String selection;

        System.out.print("\nWhat would you like to do?"
                + "\n1- Add song" + "\n2- View playlist"
                +"\n3- Remove song" + "\n4- Delete playlist"
                + " \n5- Play" + "\n6- Exit" + "\nSelection: ");
        selection = scan.nextLine();
        System.out.print("\n");

        return selection;
    }

    //Displays menu from showMenu(): Contains a switch,
    //executes case based on returned int from showMenu().
    public void runMenu() {

        String selection = showMenu();

        switch (selection) {
            case "1" -> {
                addSong();
                runMenu();
            }
            case "2" -> {
                viewPlaylist();
                runMenu();
            }
            case "3" -> {
                removeSong();
                runMenu();
            }
            case "4" -> {
                playlist.deletePlaylist();
                runMenu();
            }
            case "5" -> {
                Play(0);
                runMenu();
            }
            case "6" -> System.exit(0);
            default -> {
                printError();
                runMenu();
            }
        }

    }

    //Creates a new Song with user to input for artist, title,
    //length, genre, rating; adds Song to a Playlist.
    /* I had a lot of trouble getting the scanner get the input and assign it correctly.
     * Someone suggested I utilize scanner.reset(), but I'd get a scanner exception. This way worked.*/
    public void addSong() {
        Music newSong = new Music(null, null, null);

        System.out.print("Enter artist: ");
        newSong.setArtist(scan.nextLine());
        System.out.print("Enter title: ");
        newSong.setTitle(scan.nextLine());
        do {
            try {
                System.out.print("Enter length: ");
                newSong.setLength(scan.nextLine());
            } catch (ExeptionTime invalidLength) {
                System.out.print(invalidLength.toString());
                System.out.print("Enter length as \"minutes:seconds\".\n");
            }
        } while (newSong.getLength() == null);

        playlist.addSong(newSong);
        System.out.println("the song has been added");
    }

    //Formats and displays all Songs in Playlist.
    public void viewPlaylist() {
        if (playlist.getPlaylistSize() == 0) {
            System.out.println("\nPlaylist empty!");
        } else {
            for (int i = 0; i < playlist.getPlaylistSize(); i++) {
                System.out.print("\n#" + (i + 1) + " ");
                System.out.print("" + playlist.getArtist(i) + " - ");
                System.out.print("\"" + playlist.getTitle(i) + "\"" + ", ");
                System.out.print(playlist.getLength(i));
            }
            System.out.print("\n");
        }
    }

    //Displays Playlist; prompts user to select Song to delete and removes it from Playlist.
    public void removeSong() {
        if (playlist.getPlaylistSize() == 0) {
            System.out.println("\nPlaylist is empty!");
        } else {
            viewPlaylist();
            boolean flag = false;
            do {
                System.out.print("\nSelect a song to remove: ");
                int removeSelection = scan.nextInt();

                if (removeSelection < playlist.getPlaylistSize() || removeSelection > playlist.getPlaylistSize()) {
                    printError();
                } else {
                    playlist.removeSong(--removeSelection);
                    flag = true;
                }
            } while (!flag);
        }
    }

    public void Play(int index) {
        if(playlist.getPlaylistSize() == 0){
            playlistEmpty();
            System.out.println("Please create a playlist before to play it.");
            addSong();
        } else if (playlist.getPlaylistSize() != 0){
                System.out.println("Currently listening:\n");
                System.out.println(playlist.getArtist(index) + " - " + "'"
                        + playlist.getTitle(index) + "'" + ", "
                        + playlist.getLength(index));
                String selection;
                selection = scan.nextLine();
                if (selection.equals("next")) {
                    System.out.println(playlist.getArtist(index +1) + " - " + "'"
                            + playlist.getTitle(index +1) + "'" + ", "
                            + playlist.getLength(index +1));
                } else if (selection.equals("previous")) {
                    System.out.println(playlist.getArtist(index -1) + " - " + "'"
                            + playlist.getTitle(index -1) + "'" + ", "
                            + playlist.getLength(index -1));
                }
        }
        else {
            printError();
            System.out.println("weshueh");
        }
    }




}//End class
