package Place;

import com.company.ColossalCave;

import java.util.Scanner;

public class Colline extends ColossalCave implements PlaceInterface {
    @Override
    public void placeDescription() {
        System.out.println("woaw la grooooooooooose colline");
    }

    @Override
    public void Move() {
        Scanner scanner = new Scanner(System.in);
        String inputUser = scanner.nextLine();

        if (inputUser.equals("move north")){
            Foret foret = new Foret();
            foret.placeDescription();
            foret.Move();

        }else if (inputUser.equals("move south") || (inputUser.equals("move west") || (inputUser.equals("move east")))) {
            System.out.println("you can't go this way");
        } else {
            System.out.println("nothing happens");
        }
    }

}
