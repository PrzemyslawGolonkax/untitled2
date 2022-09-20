package podstawy2;


import java.util.Scanner;

public class zadanie2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double dzien;
        System.out.println("Podaj dzien");
        dzien = scan.nextInt();
        scan.nextLine();

        double miesiac;
        System.out.println("Podaj miesiąc");
        miesiac = scan.nextInt();
        scan.nextLine();

        double rok;
        System.out.println("{Podaj dwie ostatnie liczby roku");
        rok = scan.nextInt();
        scan.nextLine();

        double iloczyndniaimiesiaca = dzien*miesiac;

        if (iloczyndniaimiesiaca == rok) {
            System.out.println("Twoja data ejst magiczna");
        } else {
            System.out.println("Twoja data nie hest magiczna");
        }
    }

}