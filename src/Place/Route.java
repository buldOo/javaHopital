package Place;

import com.company.ColossalCave;

import java.util.Scanner;

public class Route extends ColossalCave implements PlaceInterface {
    @Override
    public void placeDescription() {
        System.out.println("woaw la grosse route");
    }

    @Override
    public void Move() {
        Scanner scanner = new Scanner(System.in);
        String inputUser = scanner.nextLine();

        if (inputUser.equals("move west")) {
            Colline colline = new Colline();
            colline.placeDescription();
            colline.Move();
        } else if (inputUser.equals("move south") || (inputUser.equals("move north") || (inputUser.equals("move east")))) {
            System.out.println("you can't go this way");
        } else {
            System.out.println("nothing happens");
        }

    }
}
