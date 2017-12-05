
import java.util.Scanner;

public class lesson10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Combien de caractères pour le côté pour votre carré ? ");
        int cote = input.nextInt();

        String line = "";

        for (int i = 0; i < cote; i++) {
            line += "#";
        }
        // écrire cote * line 
        for (int i = 0; i < cote; i++) {
            System.out.println(line);

        }
    }
}
