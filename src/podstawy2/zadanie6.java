package podstawy2;

import java.util.Scanner;

public class zadanie6 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        int sec;
        System.out.println("Podaj ilosc sekund");
        sec = klawiatura.nextInt();
        klawiatura.nextLine();
        int min = (sec/60);
        int godz = (sec/3600);
        int dzien = (sec/86400);
        int sec2 = (sec % 3600) % 60;

        if(sec < 60){
            System.out.println(sec + " sec"+ dzien+ " dni" +godz+ " h"+min+" min" + sec2 + "sekund");
        }else if (sec >= 60 && sec <=3600) {
            System.out.println(sec + " sec"+ dzien+ " dni" +godz+ " h"+min+" min" + sec2 + "sekund");
        }
        else if (sec >= 3600 && sec <=86400) {
            System.out.println(sec + " sec"+ dzien+ " dni" +godz+ " h"+min+" min" + sec2 + "sekund");
        }
        else if (sec >= 86400) {
            System.out.println(sec + " sec"+ dzien+ " dni" +godz+ " h"+min+" min" + sec2 + "sekund");
        }

        }
    }
}
