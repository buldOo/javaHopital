package Place;

import com.company.ColossalCave;

import java.util.Scanner;

public class Vallee extends ColossalCave implements PlaceInterface{
    @Override
    public void Move() {
        Scanner scanner = new Scanner(System.in);
        String inputUser = scanner.nextLine();

        if (inputUser.equals("move west")) {
            Colline colline = new Colline();
            colline.PlaceDescription();
            colline.Move();
        } else if (inputUser.equals("move north")) {
            Route route = new Route();
            route.PlaceDescription();
            route.Move();
        }else if (inputUser.equals("move south") || (inputUser.equals("move east"))) {
            System.out.println("La route est bloquée");
        } else {
            System.out.println("Rien ne se passe");
        }
    }

    @Override
    public void PlaceDescription() {
        System.out.println("Vous êtes dans une vallée a coté d’un ruisseau. Un corps flotte là dans l’eau");
    }

    @Override
    public void Quit() {

    }
}
