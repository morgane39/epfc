
import java.util.Scanner;

public class ExamQ3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String choix;

        do {
            System.out.print("Tapez 1 pour afficher Section Commerciale"
                    + " Tapez 2 pour afficher Section Comptabilité"
                    + " ou tapez Q pour quitter : ");
            choix = input.next();
            switch (choix) {
                case "1":
                    System.out.println("Section Commerciale");
                    break;
                case "2":
                    System.out.println("Section Comptabilité");
                    break;
                case "Q":
                    System.out.println("Aurevoir");
                    break;
                default:
                    System.out.println("Erreur");
            }
        } while (!choix.equals("Q"));

    }
}
