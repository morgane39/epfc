
import java.util.Scanner;

public class less11ex1 {

    public static void main(String[] args) {

        int[] myTestTab = new int[100];

        Scanner input = new Scanner(System.in);
        System.out.print("Quelle table de multiplication voulez vous afficher : ");
        int base = input.nextInt();
        System.out.println("La table de " + base + " est : ");
        System.out.print(base + ", ");
        
        int sum = base;

        for (int i = 0; i < myTestTab.length; i++) {
            
            sum += base;
            myTestTab[i] = sum;
            System.out.print(myTestTab[i] + ", ");

        }

    }
}
