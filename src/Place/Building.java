package Place;

import com.company.ColossalCave;

import java.util.Scanner;

public class Building extends ColossalCave implements PlaceInterface {
    @Override
    public void Move() {
        Scanner scanner = new Scanner(System.in);
        String inputUser = scanner.nextLine();

        if (inputUser.equals("move west")) {
            Route route = new Route();
            route.PlaceDescription();
            route.Move();
        } else if (inputUser.equals("move south") || (inputUser.equals("move north") || (inputUser.equals("move east")))) {
            System.out.println("La route est bloquée");
        } else {
            System.out.println("Rien ne se passe");
        }
    }

    @Override
    public void PlaceDescription() {
        System.out.println("Vous êtes a l’intérieur d’un building en brique, un petit refuge pour les bêtes. Un homme git là au milieu d’une marre de sang.");
    }

    @Override
    public void Quit() {

    }
}
