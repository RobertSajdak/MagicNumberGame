import java.util.Random;
import java.util.Scanner;

public class Mod_6_homework {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("-----------------------------");
        System.out.println("Witaj w grze Magiczna Liczba!" +
                "\nSpróbuj zgadnąć wylosowaną przeze mnie liczbę całkowitą z przedziału 1-50.");

        int magicNumber = new Random().nextInt(1, 50 + 1);
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        int counter = 0;

        while (magicNumber != input) {
            input = scanner.nextInt();

            if (input == magicNumber) {
                counter++;
                System.out.println("Brawo! Wygrałeś!" +
                        "\n--------------------------------------------" +
                        "\n>>> Podałeś właściwą liczbę w " + counter + " próbach! <<<");
            } else if (input > magicNumber) {
                counter++;
                System.out.println("Zimno... Twoja liczba jest za duża.\nSpróbuj ponownie.");
            } else {
                counter++;
                System.out.println("Zimno... Twoja liczba jest za mała.\nSpróbuj raz jeszcze.");
            }
        }
    }
}
