package newpackage;

public class less13ex4 {

    public static void main(String[] args) {

        int[][] matrix = new int[10][10];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
                //matrix[i][j] = 1;
            }
        }
        printTable(matrix);
    }

    public static void printTable(int[][] matrix) {
        System.out.println("Impression du tableau :");
        for (int i = 0; i < matrix.length; i++) { //i est indice des lignes
            for (int j = 0; j < matrix[i].length; j++) { //j est indice des cellules
                //System.out.println(i + "," + j + " => " + matrix[i][j]);
                System.out.printf("%8d", matrix[i][j]); // f =format, chaque entrée à 8 espaces
            }
            System.out.println(""); // retour à la ligne après chaque ligne du tableau
        }
    }
}
