
import java.util.Scanner;


public class ExamQ2corr2 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.print("Ecrivez une phrase : ");
        String message = clavier.nextLine();

        int espace = 0;

        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) == ' ') {
                espace++;
            }
        }

        System.out.println("Le texte contient : ");
        System.out.println(".) " + espace + " espaces");
        System.out.println(".) " + (message.length() - espace) + " lettres");
    }
    
}
