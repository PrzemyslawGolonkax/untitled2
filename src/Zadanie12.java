import java.util.Scanner;
public class Zadanie12 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        int iloscCiasteczekwPudełku = 40;
        int informacjeNaPudełki = 10;
        int iloscPorcji = (iloscCiasteczekwPudełku / informacjeNaPudełki);
        double iloscKaloriiNaPorcje = 300;
        double iloscKaloriiNaCiastko = (iloscKaloriiNaPorcje / iloscPorcji);

        int liczbaZjedzonychCiastek;
        System.out.println("Ile zjadłes ciastek:");
        liczbaZjedzonychCiastek = klawiatura.nextInt();
        klawiatura.nextLine();

        double iloscSkonsumowanychKalorii = (iloscKaloriiNaCiastko * liczbaZjedzonychCiastek);
        System.out.println("Zjadłeś:" + iloscSkonsumowanychKalorii + "kalorii");
    }
}


