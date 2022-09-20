package podstawy;

public class zadanie17 {
    public static void main(String[] args) {
        double cenaAkcji = 21.77;
        double iloscKupionychAkcji = 600;
        double cenaZaSameAkcje = (cenaAkcji*iloscKupionychAkcji);
        double wysokoscProwizji = 0.02;
        double cenaprowizji = wysokoscProwizji*cenaZaSameAkcje;
        double cenapoprowizji = cenaZaSameAkcje+cenaprowizji;
        System.out.println(cenaZaSameAkcje+ ", "+cenaprowizji+ ", "+cenapoprowizji);
    }
}
