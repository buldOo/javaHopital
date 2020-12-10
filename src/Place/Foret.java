package Place;

import com.company.ColossalCave;

import java.util.Scanner;

public class Foret extends ColossalCave implements PlaceInterface {
    @Override
    public void Move() {
        Scanner scanner = new Scanner(System.in);
        String inputUser = scanner.nextLine();

        if (inputUser.equals("move south")) {
            Route route = new Route();
            route.PlaceDescription();
            route.Move();
        } else if (inputUser.equals("move north") || (inputUser.equals("move west") || (inputUser.equals("move east")))) {
            System.out.println("La route est bloquée");
        } else {
            System.out.println("Rien ne se passe");
        }
    }

    @Override
    public void PlaceDescription() {
        System.out.println("Vous êtes dans la foret noire. Vous entendez des hurlements stridents");
    }

    @Override
    public void Quit() {

    }
}
