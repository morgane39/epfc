package newpackage;

import java.util.Scanner;

public class less13ex1 {

    public static void main(String[] args) {
        String[] nomMois = {"janvier", "février", "mars", "avril", "mai", "juin",
            "juillet", "aout", "septembre", "octobre", "novembre", "décembre"};
        Scanner clavier = new Scanner(System.in);
        System.out.print("Veuillez introduire le numéro du mois (1-12) : ");
        int numMois = clavier.nextInt();

        while (numMois < 1 || numMois > nomMois.length) {
            System.out.print("Erreur. Veuillez introduire le numéro du mois : ");
            numMois = clavier.nextInt();
        }
        System.out.println("Le mois est " + nomMois[(numMois - 1)]);

    }

}
