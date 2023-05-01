import java.time.LocalDate;

public class Mod_4_homework {

    public static void main(String[] args) {
        int currentYear = getYear();
        int yearOfMyBirth = 1973;
        int yearOfPaulaBirth = 1984;
        int yearOfMomBirth = 1947;
        int yearOfKropkaBirth = 2009;
        int yearOfRoxanBirth = 1993;

        int myAge = currentYear - yearOfMyBirth;
        int paulaAge = currentYear - yearOfPaulaBirth;
        int momAge = currentYear - yearOfMomBirth;
        int kropkaAge = currentYear - yearOfKropkaBirth;
        int roxanAge = currentYear - yearOfRoxanBirth;

        System.out.println();
        displayAge(myAge, paulaAge, momAge, kropkaAge, roxanAge);
        System.out.println("============================================");

        int sum = getSumOfFamilyAge(myAge, paulaAge, momAge, kropkaAge, roxanAge);
        System.out.println("Łącznie, wiek naszej rodziny wynosi: " + sum + " lat.");

        double avg = getAverage(myAge, paulaAge, momAge, kropkaAge, roxanAge);
        System.out.println("Średni wiek naszej rodziny to: " + avg + " lat.");
        System.out.println("-------------------------------------------");

        System.out.println("Robert jest pełnoletni => " + isAdult(myAge));
        System.out.println("Paula jest pełnoletnia => " + isAdult(paulaAge));
        System.out.println("Mama jest pełnoletnia => " + isAdult(momAge));
        System.out.println("Kropka jest pełnoletnia :) => " + isAdult(kropkaAge));
        System.out.println("Roksana jest pełnoletnia => " + isAdult(roxanAge));
    }

    static boolean isAdult(int age) {
        return age >= 18;
    }

    static double getAverage(int a, int b, int c, int d, int e) {
        return getSumOfFamilyAge(a, b, c, d, e) / 5.0;
    }

    static int getSumOfFamilyAge(int a, int b, int c, int d, int e) {
        return a + b + c + d + e;
    }

    static void displayAge (int myAge, int paulaAge, int momAge, int kropkaAge, int roxanAge) {
        System.out.println("Mój wiek to: " + myAge + " lat.");
        System.out.println("Wiek Pauli to: " + paulaAge + " lat.");
        System.out.println("Wiek mamy to: " + momAge + " lat.");
        System.out.println("Wiek naszego psa to: " + kropkaAge + " lat.");
        System.out.println("Wiek naszej córki to: " + roxanAge + " lat.");
    }

    static int getYear() {
        return LocalDate.now().getYear();
    }
}
