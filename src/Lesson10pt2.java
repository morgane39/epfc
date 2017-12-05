
import java.util.Scanner;

public class Lesson10pt2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Combien de caractères pour le côté pour votre carré ? ");
        int cote = input.nextInt();

        for (int i = 0; i < cote; i++) {   // lignes
            for (int j = 0; j < cote; j++) {
                System.out.print("#");
            }
            System.out.println(" ");
        }
    }
}
