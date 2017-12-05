
import java.util.Scanner;

public class less11ex3 {

    public static void main(String[] args) {

        int[] myTestTab = new int[10];
        Scanner input = new Scanner(System.in);
        System.out.println("Voici 10 entiers aléatoires : ");

        for (int i = 0; i < myTestTab.length; i++) {
            myTestTab[i] = (int) (Math.random() * 1000);
            System.out.print(myTestTab[i] + " ");
        }

        System.out.println("");
        System.out.println("Voici les mêmes 10 entiers en sens inverse : ");

        for (int i = myTestTab.length - 1; i >= 0; i--) {

            System.out.print(myTestTab[i] + " ");
        }

    }

}
