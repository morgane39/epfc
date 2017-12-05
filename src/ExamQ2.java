
import java.util.Scanner;

public class ExamQ2 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.print("Ecrivez une phrase : ");
        String message = clavier.nextLine();
        int espace = 0;
        int index = message.indexOf(" ");
        while (index > 0) {
            index = message.indexOf(" ", index + 1);
            espace++;
        }
        int lettres = message.length() - espace;
        System.out.println("Le texte contient : ");
        System.out.println(".) " + espace + " espaces");
        System.out.println(".) " + lettres + " lettres");
    }
}
