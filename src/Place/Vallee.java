package Place;

import com.company.ColossalCave;

import java.util.Scanner;

public class Vallee extends ColossalCave implements PlaceInterface{

    @Override
    public void Move() {
        Scanner scanner = new Scanner(System.in);
        String inputUser = scanner.nextLine();

        //creation of the different move choice
        if (inputUser.equals("move west")) {
            Colline colline = new Colline();
            colline.PlaceDescription();
            colline.Move();
        } else if (inputUser.equals("move north")) {
            Route route = new Route();
            route.PlaceDescription();
            route.Move();
        } else if (inputUser.equals("move south") || (inputUser.equals("move east"))) {
            System.out.println("You can't go this way");
            Vallee valee = new Vallee();
            valee.Move();
        } else if (inputUser.equals("quit")){
            Quit();

        } else {
            System.out.println("Nothing happens");
            Vallee valee = new Vallee();
            valee.Move();
        }
    }

    @Override
    public void PlaceDescription() {
        System.out.println("You are in a valley next to a stream. A body floats there in the water");
        System.out.println("You can \"move north\"");
        System.out.println("You can \"move west\"");
    }

    @Override
    public void Quit() {
        System.out.println("You are at home in front of your computer in the middle of a Java class, it was all a dream");
        System.exit(1);
    }
}
