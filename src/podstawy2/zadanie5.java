package podstawy2;

import java.util.Scanner;

public class zadanie5 {
    public static void main(String[] args) {
        Scanner klawiatura =new Scanner(System.in);

        double masa;

        System.out.println("Podaj mase: ");
        masa = klawiatura.nextDouble();
        klawiatura.nextLine();

        double ciezar = masa*9.8;

        if (ciezar <=10){
            System.out.println("Ciezar jest zbyt lekki.");
        } else if (ciezar >=1000) {
            System.out.println("Twoj ciezar jest zbyt ciezki.");

        }
        System.out.println("twoj ciezar t:" +ciezar);
    }
}
