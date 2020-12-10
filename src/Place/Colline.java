package Place;

import com.company.ColossalCave;

import java.util.Scanner;

public class Colline extends ColossalCave implements PlaceInterface {

    @Override
    public void Move() {
        Scanner scanner = new Scanner(System.in);
        String inputUser = scanner.nextLine();

        if (inputUser.equals("move north")){
            Foret foret = new Foret();
            foret.PlaceDescription();
            foret.Move();

        } else if (inputUser.equals("move south") || (inputUser.equals("move west") || (inputUser.equals("move east")))) {
            System.out.println("You can't go this way");
            Colline colline = new Colline();
            colline.Move();

        } else if (inputUser.equals("quit")){
            Quit();

        } else {
            System.out.println("Nothing happens");
            Colline colline = new Colline();
            colline.Move();
        }
    }

    @Override
    public void PlaceDescription() {
        System.out.println("You are at the top of a hill overlooking the city, in the distance you see a shadow moving at high speed with a large knife..");
        System.out.println("You can \"move north\"");
    }

    @Override
    public void Quit() {
        System.out.println("You are at home in front of your computer in the middle of a Java class, it was all a dream");
        System.exit(1);
    }
}
