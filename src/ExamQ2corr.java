
import java.util.Scanner;

public class ExamQ2corr {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.print("Ecrivez une phrase : ");
        String message = clavier.nextLine();

        int espace = message.length() - message.replaceAll(" ", "").length();

        System.out.println("Le texte contient : ");
        System.out.println(".) " + espace + " espaces");
        System.out.println(".) " + (message.length() - espace) + " lettres");
    }
}
