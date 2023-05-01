import java.time.LocalDate;

public class Mod_3_homework {

    public static void main(String[] args) {
        int currentYear = LocalDate.now().getYear();
        int yearOfMyBirth = 1973;
        int yearOfPaulaBirth = 1984;
        int yearOfMomBirth = 1947;
        int yearOfKropkaBirth = 2009;
        int yearOfRoxanBirth = 1993;

        System.out.println();
        int myAge = currentYear - yearOfMyBirth;
        System.out.println("Mój wiek to: " + myAge + " lat.");
        int PaulaAge = currentYear - yearOfPaulaBirth;
        System.out.println("Wiek Pauli to: " + PaulaAge + " lat.");
        int MomAge = currentYear - yearOfMomBirth;
        System.out.println("Wiek mamy to: " + MomAge + " lat.");
        int KropkaAge = currentYear - yearOfKropkaBirth;
        System.out.println("Wiek naszego psa to: " + KropkaAge + " lat.");
        int RoxanAge = currentYear - yearOfRoxanBirth;
        System.out.println("Wiek naszej córki to: " + RoxanAge + " lat.");

        System.out.println("============================================");
        int SumOfFamilyAge = myAge + PaulaAge + MomAge + KropkaAge + RoxanAge;
        System.out.println("Łącznie, wiek naszej rodziny wynosi: " + SumOfFamilyAge + " lat.");
    }
}
