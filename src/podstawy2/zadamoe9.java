package podstawy2;

import java.util.Scanner;

public class zadamoe9 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        double waga;
        double odlegloscprzebyta;
        double stawka4 = 3.80;
        double stawka3 = 3.70;
        double stawka2 = 2.20;
        double stawka1 = 1.10;
        double cenalotu;

        System.out.println("Ile wazyla twoja przesyłka(w kg)?");
        waga = klawiatura.nextInt();
        klawiatura.nextLine();

        System.out.println("Ile przeleciałes(w km)?");
        odlegloscprzebyta = klawiatura.nextInt();
        klawiatura.nextLine();


        int ratio = (int)odlegloscprzebyta / 500;

        if(odlegloscprzebyta%500 !=0){
            ratio= ratio+1;

        }
        System.out.println(ratio);
        if (waga >= 1) {
            cenalotu = stawka1 * ratio;
            System.out.println("Twoja cena to: " + cenalotu + " zł");
        } else if (waga >= 3) {
            cenalotu = stawka2 * ratio;
            System.out.println("Twoja cena to: " + cenalotu + " zł");
        } else if (waga >= 5) {
            cenalotu = stawka3 * ratio;
            System.out.println("Twoja cena to: " + cenalotu + " zł");
        } else if (waga < 5) {
            cenalotu = stawka4 * ratio;
            System.out.println("Twoja cena to: " + cenalotu + " zł");
        }
    }
}