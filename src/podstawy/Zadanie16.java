package podstawy;

import java.util.Scanner;
public class Zadanie16 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        double cenaPosilku;
        System.out.println("Podaj cene posiłku: ");
        cenaPosilku = klawiatura.nextDouble();
        double podatek = 0.0675;
        double cenapopodatku = (cenaPosilku + cenaPosilku*podatek);
        double napiwek = 0.2;
        double cenaponapiwku = cenapopodatku+(cenaPosilku*napiwek);
        double podatekzposilku = (cenaPosilku*podatek);
        double cenaostateczna = (cenaponapiwku+podatekzposilku);
        System.out.println("cena po napiwku" + cenaponapiwku);
        System.out.println("cena po podatku"+cenapopodatku);
        System.out.println("cena ostateczna"+cenaostateczna);

    }
}
