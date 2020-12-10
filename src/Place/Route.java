package Place;

import com.company.ColossalCave;

import java.util.Scanner;

public class Route extends ColossalCave implements PlaceInterface {

    @Override
    public void Move() {
        //creation of a scanner
        Scanner scanner = new Scanner(System.in);
        String inputUser = scanner.nextLine();

        //creation of the different move choice
        switch (inputUser) {
            case "move west" -> {
                Colline colline = new Colline();
                colline.PlaceDescription();
                colline.Move();
            }
            case "move south" -> {
                Vallee vallee = new Vallee();
                vallee.PlaceDescription();
                vallee.Move();
            }
            case "move north" -> {
                Foret foret = new Foret();
                foret.PlaceDescription();
                foret.Move();
            }
            case "move east" -> {
                Building building = new Building();
                building.PlaceDescription();
                building.Move();
            }
            case "quit" -> {
                Quit();
            }
            //it happens if we don't enter into any case
            default -> {
                System.out.println("Nothing happens");
                Route route = new Route();
                route.Move();
            }

        }

    }

    @Override
    public void PlaceDescription() {
        System.out.println("You are at the end of the road in front of a small brick building. A small brook flows next to the building at the bottom of a gutter..");
        System.out.println("You can move in any direction \"north\" \"south\" \"west\" \"east\" ");
    }

    @Override
    public void Quit() {
        System.out.println("You are at home in front of your computer in the middle of a Java class, it was all a dream");
        System.exit(1);
    }
}
