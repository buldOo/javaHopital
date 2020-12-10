package Place;

import com.company.ColossalCave;

import java.util.Scanner;

public class Foret extends ColossalCave implements PlaceInterface {

    @Override
    public void Move() {
        Scanner scanner = new Scanner(System.in);
        String inputUser = scanner.nextLine();

        //creation of the different move choice
        if (inputUser.equals("move south")) {
            Route route = new Route();
            route.PlaceDescription();
            route.Move();
        } else if (inputUser.equals("move north") || (inputUser.equals("move west") || (inputUser.equals("move east")))) {
            System.out.println("You can't go this way");
            Foret foret = new Foret();
            foret.Move();
        } else if (inputUser.equals("quit")){
            Quit();
        } else {
            System.out.println("Nothing happens");
            Foret foret = new Foret();
            foret.Move();
        }
    }

    @Override
    public void PlaceDescription() {
        System.out.println("You are in the black forest. You hear shrill screams");
        System.out.println("You can \"move south\"");
    }

    @Override
    public void Quit() {
        System.out.println("You are at home in front of your computer in the middle of a Java class, it was all a dream");
        System.exit(1);
    }
}
