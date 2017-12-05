
import java.util.Scanner;

public class lesson10pt3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Combien de caractères pour le côté pour votre carré ? ");
        int cote = input.nextInt();
        System.out.print("A quelle position voulez-vous votre carré ? ");
        int x = input.nextInt();  // lignes
        int y = input.nextInt();  // colonnes
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
