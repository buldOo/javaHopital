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
            route.placeDescription();
            route.Move();
        } else if (inputUser.equals("move north") || (inputUser.equals("move west") || (inputUser.equals("move east")))) {
            System.out.println("you can't go this way");
        } else {
            System.out.println("nothing happens");
        }
    }

    @Override
    public void placeDescription() {
        System.out.println("la grosse foret");
    }
}
