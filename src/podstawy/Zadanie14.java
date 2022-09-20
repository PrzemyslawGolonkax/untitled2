package podstawy;

import java.util.Scanner;
public class Zadanie14 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        double cenaDetalicznaPłytki;

        System.out.println("Podaj cene detaliczną płytki");
        cenaDetalicznaPłytki = klawiatura.nextDouble();
        klawiatura.nextLine();

        double marża = 0.4;
        double zysk = (cenaDetalicznaPłytki*marża);
        System.out.println("Zysk wynosi:"+ zysk);


    }
}
