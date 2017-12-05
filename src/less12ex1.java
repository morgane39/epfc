
import java.util.Scanner;

public class less12ex1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String choix;

        do {
            System.out.println("Tapez A pour ajouter un segment"
                    + " Tapez I pour imprimer le tableau"
                    + " ou tapez Q pour quitter : ");
            choix = input.next();
            switch (choix) {
                case "A":
                    System.out.println("Section Commerciale");
                    break;
                case "I":
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
