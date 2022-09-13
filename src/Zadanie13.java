import java.util.Scanner;
public class Zadanie13 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        double wynikPierwszegoTestu;

        System.out.println("Podaj wynik pierwszego testu");
        wynikPierwszegoTestu = klawiatura.nextDouble();
        klawiatura.nextLine();

        double wynikDrugiegoTestu;

        System.out.println("Podaj wynik drugiego testu");
        wynikDrugiegoTestu = klawiatura.nextDouble();
        klawiatura.nextLine();

        double wynikTrzeciegotestu;

        System.out.println("Podaj wynik trzeciego testu");
        wynikTrzeciegotestu = klawiatura.nextDouble();
        klawiatura.nextLine();
        int iloscWszystkichTestów=3;

        double średniaTestów = (wynikPierwszegoTestu + wynikDrugiegoTestu + wynikTrzeciegotestu)/iloscWszystkichTestów;
        System.out.println("Srednia wszystkich tetów to:" + średniaTestów);




    }
}
