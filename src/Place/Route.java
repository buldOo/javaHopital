package Place;

import com.company.ColossalCave;

import java.util.Scanner;

public class Route extends ColossalCave implements PlaceInterface {
    @Override
    public void Move() {
        Scanner scanner = new Scanner(System.in);
        String inputUser = scanner.nextLine();

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
            default -> System.out.println("Rien ne se passe");
        }

    }

    @Override
    public void PlaceDescription() {
        System.out.println("Vous êtes au bout de la route devant un petit immeuble en brique. Un petit ruisseau coule");
    }

    @Override
    public void Quit() {

    }
}
