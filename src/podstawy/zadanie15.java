package podstawy;

import java.util.Scanner;
public class zadanie15 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        String nazwaMiasta;
        System.out.println("Podaj nazwe twojego ulubionego miasta");
        nazwaMiasta = klawiatura.nextLine();

        System.out.println(nazwaMiasta);
        int dlugosc;
        dlugosc = nazwaMiasta.length();

        String male, duze;

        male = nazwaMiasta.toLowerCase();
        duze = nazwaMiasta.toUpperCase();

        char inicjal = nazwaMiasta.charAt(0);

        System.out.println(dlugosc +"\n "+ male+ "\n"+duze + "\n" + inicjal );


    }
}
