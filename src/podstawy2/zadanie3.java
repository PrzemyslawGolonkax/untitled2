package podstawy2;

import java.util.Scanner;

public class zadanie3 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        double wzrost;
        double waga;
        System.out.println("Podaj swój wzrost: ");
        wzrost = klawiatura.nextDouble();
        klawiatura.nextLine()
        ;
        System.out.println("Podaj swoją wage: ");
        waga = klawiatura.nextDouble();
        klawiatura.nextLine();
        double potega;
        potega = Math.pow(wzrost, 2);
        double wartoscBMI = waga/potega;

        if (wartoscBMI >=18.5 && wartoscBMI<=25){
            System.out.println("MAsz optymalna wage"+wartoscBMI);
        }
        else if (wartoscBMI <18.5) {
            System.out.println("Masz niedowage"+ wartoscBMI);

        }
        else {
            System.out.println("Masz nadwage"+wartoscBMI);
        }


    }
}
