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

        }else if (inputUser.equals("move south") || (inputUser.equals("move west") || (inputUser.equals("move east")))) {
            System.out.println("La route est bloquée");
        } else {
            System.out.println("Rien ne se passe");
        }
    }

    @Override
    public void PlaceDescription() {
        System.out.println("Vous êtes tout en haut d’une colline qui surplombe la ville, au loin vous voyez une ombre se déplacer a grande vitesse avec un grand couteau.");
    }

    @Override
    public void Quit() {

    }
}
