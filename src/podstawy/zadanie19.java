package podstawy;

import java.util.Scanner;
public class zadanie19 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        int iloscciasteczek;
        System.out.println("Podaj liczbe ciasteczek");
        iloscciasteczek = klawiatura.nextInt();
        klawiatura.nextLine();
        int poczatlpwailoscciasteczek = 48;
        double szklankicukru = 1.5;
        double szklanekmasla = 1;
        double szklankimaki = 2.75;
        double cukiernaciasteczko = szklankicukru/poczatlpwailoscciasteczek;
        double  maslonaciasteczko = szklanekmasla/poczatlpwailoscciasteczek;
        double makanamaslo = szklankimaki/poczatlpwailoscciasteczek;
        double potrzebnycukier = cukiernaciasteczko*iloscciasteczek;
        double potrzebnymaslo = maslonaciasteczko*iloscciasteczek;
        double potrzebnymaka = makanamaslo*iloscciasteczek;

                System.out.println("ilosc szklenek cukru to="+ potrzebnycukier);
        System.out.println("ilosc szklanek masła to="+ potrzebnymaslo);
        System.out.println("ilosc szklanek maki to="+potrzebnymaka);


    }
}
