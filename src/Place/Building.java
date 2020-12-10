package Place;

import com.company.ColossalCave;

import java.util.Scanner;

public class Building extends ColossalCave implements PlaceInterface {

    @Override
    public void Move() {
        Scanner scanner = new Scanner(System.in);
        String inputUser = scanner.nextLine();

        //creation of the different move choice
        if (inputUser.equals("move west")) {
            Route route = new Route();
            route.PlaceDescription();
            route.Move();
        } else if (inputUser.equals("move south") || (inputUser.equals("move north") || (inputUser.equals("move east")))) {
            System.out.println("You can't go this way");
            Building building = new Building();
            building.Move();
        } else if (inputUser.equals("quit")){
            Quit();

        } else {
            System.out.println("Nothing happens");
            Building building = new Building();
            building.Move();
        }
    }

    @Override
    public void PlaceDescription() {
        System.out.println("You are inside a brick building, a small shelter for the animals. A man lies there in the middle of a pool of blood..");
        System.out.println("You can \"move west\"");
    }

    @Override
    public void Quit() {
        System.out.println("You are at home in front of your computer in the middle of a Java class, it was all a dream");
        System.exit(1);
    }
}
