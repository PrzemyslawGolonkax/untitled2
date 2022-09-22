package podstawy2;

import java.util.Scanner;

public class zadanie11 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        String imie1;
        String imie2;
        String imie3;
        double czas1biegacza;
        double czas2biegacza;
        double czas3biegacza;

        System.out.println("Podaj imie pierwszego biegacza");
        imie1 = klawiatura.nextLine();

        System.out.println("Podaj czas pierwszego biegacza");
        czas1biegacza = klawiatura.nextDouble();
        klawiatura.nextLine();

        System.out.println("Podaj imie drugie biegacza");
        imie2 = klawiatura.nextLine();

        System.out.println("Podaj czas drugiego biegacza");
        czas2biegacza = klawiatura.nextDouble();
        klawiatura.nextLine();

        System.out.println("Podaj imie trzeicego biegacza");
        imie3 = klawiatura.nextLine();

        System.out.println("Podaj czas trzeciego biegacza");
        czas3biegacza = klawiatura.nextDouble();
        klawiatura.nextLine();

        if (czas1biegacza < czas2biegacza && czas2biegacza < czas3biegacza) {
            System.out.println("Przypadek1");
            System.out.println(imie1 + " Byl pierwszy" + " i mial czas " + czas1biegacza);
            System.out.println(imie2 + " Byl drugi" + " i mial czas " + czas2biegacza);
            System.out.println(imie3 + " Byl trzeci" + " i mial czas " + czas3biegacza);

        } else if (czas1biegacza < czas2biegacza && czas2biegacza > czas3biegacza) {
            System.out.println("Przypadek2");
            System.out.println(imie1 + " Byl pierwszy" + " i mial czas " + czas1biegacza);
            System.out.println(imie3 + " Byl drugi" + " i mial czas " + czas3biegacza);
            System.out.println(imie2 + " Byl trzeci" + " i mial czas " + czas2biegacza);

        } else if (czas2biegacza < czas1biegacza && czas3biegacza > czas1biegacza) {
            System.out.println("Przypadek3");
            System.out.println(imie2 + " Byl pierwszy" + " i mial czas " + czas2biegacza);
            System.out.println(imie1 + " Byl drugi" + " i mial czas " + czas1biegacza);
            System.out.println(imie3 + " Byl trzeci" + " i mial czas " + czas3biegacza);
        } else if (czas2biegacza < czas3biegacza && czas1biegacza > czas2biegacza) {
            System.out.println("Przypadek4");
            System.out.println(imie2 + " Byl pierwszy" + " i mial czas " + czas2biegacza);
            System.out.println(imie3 + " Byl drugi" + " i mial czas " + czas3biegacza);
            System.out.println(imie1 + " Byl trzeci" + " i mial czas " + czas1biegacza);
        } else if (czas3biegacza < czas1biegacza && czas1biegacza < czas2biegacza) {
            System.out.println("Przypadek5");
            System.out.println(imie3 + " Byl pierwszy" + " i mial czas " + czas3biegacza);
            System.out.println(imie1 + " Byl drugi" + " i mial czas " + czas1biegacza);
            System.out.println(imie2 + " Byl trzeci" + " i mial czas " + czas2biegacza);
        } else if (czas3biegacza < czas2biegacza && czas3biegacza < czas1biegacza) {
            System.out.println("Przypadek6");
            System.out.println(imie3 + " Byl pierwszy" + " i mial czas " + czas3biegacza);
            System.out.println(imie2 + " Byl drugi" + " i mial czas " + czas2biegacza);
            System.out.println(imie1 + " Byl trzeci" + " i mial czas " + czas1biegacza);
        }
    }
}

