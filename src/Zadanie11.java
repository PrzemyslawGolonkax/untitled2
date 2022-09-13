import java.util.Scanner;
public class Zadanie11 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        double przejechaneKilometry;
        System.out.println("Podaj ilosc przejechanyk km:");
        przejechaneKilometry = klawiatura.nextDouble();
        klawiatura.nextLine();
        double litryPaliwa;
        System.out.println("Podaj ilosc litrów paliwa:");
        litryPaliwa = klawiatura.nextDouble();
        klawiatura.nextLine();
        double kilometryNaLitrze = (przejechaneKilometry/litryPaliwa);
        System.out.println("Liczba kilometrow prazejechanych na litrze:" +kilometryNaLitrze);
    }
}
