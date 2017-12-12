package newpackage;

import java.util.Arrays;

public class less13ex2 {

    public static int[] reverse(int[] source) {
// source = n'importe quel tableau
// (int[] source) : obligatoire sinon ne créé pas de nouveau tableau

// créer nouveau tableau
        int[] result = new int[source.length];
// faire une boucle for
        for (int i = 0; i < source.length; i++) {
            result[source.length - 1 - i] = source[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] base = {1, 2, 9, 99, 100};
        int[] inverse = reverse(base);

        String s = Arrays.toString(base);

        for (int i : inverse) {
            System.out.println(i);
        }
        // test facultatif
        if (inverse[0] == base[4] && inverse[1] == base[3]) {
            System.out.println("Réussi");
        } else {
            System.out.println("Raté");
        }

    }
}
