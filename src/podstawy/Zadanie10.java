package podstawy;

import java.util.Scanner;
public class Zadanie10{
    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj wartość kupowanego produktu:");
        int wartoscKupowanegoProduktu = klawiatura.nextInt();
        klawiatura.nextLine();
        double podatekStanowy = 0.04;
        double podatekLokalny = 0.02;
        double wartoscPodatkuLokalnego =   (wartoscKupowanegoProduktu*podatekLokalny);
        double wartoscPodatkuStanowego =  (wartoscKupowanegoProduktu*podatekStanowy);
        double cenaPoPodatkuStanowym = (wartoscKupowanegoProduktu+wartoscPodatkuStanowego);
        double cenaPoPodatkuLokalnym = (wartoscKupowanegoProduktu+wartoscPodatkuLokalnego);
        double cenaKoncowa = (wartoscKupowanegoProduktu+wartoscPodatkuLokalnego+wartoscPodatkuStanowego);
        System.out.println("Cema po podatku stanowym:" +cenaPoPodatkuStanowym +", cena po podatku lokalnym:" + cenaPoPodatkuLokalnym);
        System.out.println("Cena po obu podatkach" +cenaKoncowa);


    }
}
