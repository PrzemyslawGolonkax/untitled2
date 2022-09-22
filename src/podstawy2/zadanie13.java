package podstawy2;

import java.util.Scanner;

public class zadanie13 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        String litera;

        System.out.println("Jaki masz pakiet");
        litera = klawiatura.nextLine();
        int minuty;
        System.out.println("Ile minut rozmawiales?");
        minuty = klawiatura.nextInt();
        klawiatura.nextLine();

        double cena1 = 39.99;
        double cena2 = 59.99;
        double cena3 = 69.99;
        switch (litera) {
            case "A":

                if (minuty <= 450) {
                    System.out.println("Twoja cena to " + cena1);
                } else if (minuty > 450) {
                    cena1 = cena1 + (0.45 * (minuty % 450));
                    System.out.println(cena1);

                }
                break;
            case "B":
                if (minuty <= 900) {
                    System.out.println("Twoja cena to " + cena2);
                } else if (minuty > 900) {
                    cena2 = cena2 + (0.40 * (minuty%900));
                    System.out.println(cena2);

                }
                break;
            case"C":
                System.out.println("Twoja cena to "+cena3);
                break;

        }
    }
}

