package newpackage;

public class less13ex2a {

    public static int[] copy(int[] source) {

// créer nouveau tableau
        int[] result = new int[2];
// faire une boucle for
        for (int i = 0; i < result.length; i++) {
            result[i] = source[i];
        }
        return result;
// il existe une fonction de copie de tableau !     
   
    }

    public static void main(String[] args) {

        int[] base = {1, 2};
        int[] copie = copy(base);

        for (int i : copie) {
            System.out.println(i);
        }
        if (copie[0] == base[0] && copie[1] == base[1]) {
            System.out.println("Réussi");
        } else {
            System.out.println("Raté");
        }
    }

}
