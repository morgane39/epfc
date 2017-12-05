
import java.util.Scanner;


public class less11ex1bis {
   
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Quelle longueur de table souhaitez vous ? ");
        int taille = input.nextInt()-1;
        
        int[] myTestTab = new int[taille];

        Scanner clavier = new Scanner(System.in);
        System.out.print("Quelle table de multiplication voulez vous afficher : ");
        int base = clavier.nextInt();
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
