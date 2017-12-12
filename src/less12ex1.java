
import java.util.Scanner;

public class less12ex1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String choix;

        char[] tableau = new char[80];

        // optionnel : initialiser le tableau
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = '.';
        }
        Scanner entree = new Scanner(System.in);
        do {
            System.out.print("Tapez A pour ajouter un segment"
                    + " Tapez I pour imprimer le tableau"
                    + " ou tapez Q pour quitter : ");
            choix = input.next();
            switch (choix) {
                case "A":
                    System.out.print("Quel caractère voulez-vous ajouter ? ");
                    char caractere = entree.next().charAt(0);
                    int fin;
                    int position;
                    do {
                        System.out.print("A quelle position voulez-vous ajouter le caractère ? ");
                        position = entree.nextInt();
                        System.out.print("De quelle longueur voulez-vous ajouter le caractère ? ");
                        int longueur = entree.nextInt();
                        fin = position + longueur;
                        if (fin > 80) {
                            System.out.println("Vous dépassez la longueur du tableau.");
                        }
                    } while (fin > 80);

                    for (int i = position; i < fin; i++) {
                        tableau[i] = caractere;
                    }
                    break;
                case "I":
                    System.out.println("Voici le tableau : ");
                    System.out.println(tableau);
                    break;
                case "Q":
                    break;
                default:
                    System.out.println("Erreur de commande");
            }
        } while (!choix.equals("Q"));
        System.out.println("Aurevoir");
    }
}
