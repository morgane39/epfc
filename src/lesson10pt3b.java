
import java.util.Scanner;

public class lesson10pt3b {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Combien de caractères pour le côté pour votre carré ? ");
        int cote = input.nextInt();
        String line = "";
        System.out.print("A quelle position voulez-vous votre carré ? ");
        int posX = input.nextInt();  // lignes
        int posY = input.nextInt();  // colonnes

        for (int i = 0; i < posX; i++) {   // lignes
            System.out.println();
        }
        for (int i = 0; i < posY; i++) {   // colonnes
            line += " ";
        }

        for (int i = 0; i < cote; i++) {   // carré
            System.out.print(line);
            for (int j = 0; j < cote; j++) {
                System.out.print("#");
            }
            System.out.println(" ");
        }

    }
}
