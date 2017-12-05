
import java.util.Scanner;

public class ExamQ1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Entrez une température en degré celsius : ");
        double celsius = input.nextDouble();
        double kelvin = celsius + 273.15;
        System.out.println(celsius + " celsius est " + kelvin + " Kelvin.");

    }
}
