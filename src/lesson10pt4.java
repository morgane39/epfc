
import java.util.Scanner;

public class lesson10pt4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int cote;
        int x;
        int y;

        do {
            System.out.println("L'espace de dessin est limité à 20 lignes et 20 colonnes");
            System.out.print("Combien de caractères pour le côté pour votre carré ? ");
            cote = input.nextInt();
            System.out.print("A quelle position voulez-vous votre carré ? ");
            x = input.nextInt();  // lignes
            y = input.nextInt();  // colonnes
            //if ((cote+x)>20 || (cote+y)>20){
        } while ((cote + x) > 20 || (cote + y) > 20);

        String line = "";

        for (int i = 0; i < x; i++) {   // lignes
            System.out.println();
        }
        for (int i = 0; i < y; i++) {   // colonnes
            line += " ";
        }
        for (int i = 0; i < cote; i++) {  // coté
            line += "#";
        }
        // écrire cote * line 
        for (int i = 0; i < cote; i++) {
            System.out.println(line);
        }
    }
}
