package podstawy2;

import java.util.Scanner;

public class zadanie12 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        String pierwszy;


        System.out.println("wprowadz nazwe powietrze woda lub stal");
        pierwszy=klawiatura.nextLine();

        double odleglosc;
        System.out.println("wprowadz odleglosc");
        odleglosc= klawiatura.nextDouble();
        klawiatura.nextLine();



                switch (pierwszy){
                case"powietrze":
                odleglosc=odleglosc/343;
                    System.out.println("Twoja odległosc to"+ odleglosc);
                break;
                    case"woda":
                        odleglosc=odleglosc/1480;
                        System.out.println("Twoja odległosc to"+ odleglosc);
                        break;
                    case"stal":
                    odleglosc=odleglosc/5100;
                        System.out.println("Twoja odległosc to"+ odleglosc);
                       break;


        }



    }
}
