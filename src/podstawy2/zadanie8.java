package podstawy2;

import java.util.Scanner;

public class zadanie8 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        int liczbakupionychpaklietow;
        System.out.println("Ile kupiłeś pakietów?");
        liczbakupionychpaklietow = klawiatura.nextInt();
        klawiatura.nextLine();
        double koncowacena;
        int cenazapakiet = 99;
        int rabat;
        double cenaprzedrabatem = liczbakupionychpaklietow*cenazapakiet;
        if(liczbakupionychpaklietow>=10 && liczbakupionychpaklietow<=19){
            koncowacena=cenaprzedrabatem*0.8;
            rabat=20;
            System.out.println("Twoja cena to"+ koncowacena);
            System.out.println("Twoj rabat to"+ rabat+"procent");
        } else if(liczbakupionychpaklietow>=20 && liczbakupionychpaklietow<=49){
            koncowacena=cenaprzedrabatem*0.7;
            rabat=30;
            System.out.println("Twoja cena to"+ koncowacena);
            System.out.println("Twoj rabat to"+ rabat+"procent");
        }else if(liczbakupionychpaklietow>=50 && liczbakupionychpaklietow<=99){
            koncowacena=cenaprzedrabatem*0.6;
            rabat=40;
            System.out.println("Twoja cena to"+ koncowacena);
            System.out.println("Twoj rabat to"+ rabat+"procent");
        }else if(liczbakupionychpaklietow>=100){
            koncowacena=cenaprzedrabatem*0.5;
            rabat=50;
            System.out.println("Twoja cena to"+ koncowacena);
            System.out.println("Twoj rabat to"+ rabat+"procent");
        }

    }
}

