
public class chap7ex1 {

    public static void main(String[] args) {
        // initialisation du tableau : 4 champs d'entier
        int[] intArray = new int[4];

        // affectation des données au tableau
        
        intArray[0] = 100;
        intArray[1] = 10;
        intArray[2] = 1;
        intArray[3] = 0;

        // sortie de la 1e valeur du tableau
        System.out.println(intArray[0]);
        System.out.println(intArray[1]);
        System.out.println(intArray[2]);
        System.out.println(intArray[3]);

        //afficher le tableau
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);

        }
    }
}
