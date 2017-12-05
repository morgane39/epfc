
import java.util.Scanner;


public class less11ex2 {
   
     public static void main(String[] args) {

        int[] myTestTab = new int[100];

        Scanner input = new Scanner(System.in);
        System.out.print("Donner une valeur minimum et une valeur maximum : ");
        int min = input.nextInt();
        int max = input.nextInt();
        
        System.out.println("Voici 100 entiers aléatoires entre  " + min + " et " + max + " : ");
        
        // soit comme ceci :
         
        for (int i = 0; i < myTestTab.length; i++) {
        
            myTestTab[i] = (int) (Math.random() * (max-min+1) + min);
            System.out.print(myTestTab[i] + ", ");
}
        // soit simplifier le code : 
        
         for (int element : myTestTab) {
             element = (int) (Math.random() * (max-min+1) + min);
         }
        
     }
}
