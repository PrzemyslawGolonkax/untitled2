public class Zadanie5 {
    public static void main(String[] args) {
        int PierwszePomieszczenie = 3 * 4;
        int DrugiePomieszczenie = 3 * 4;
        int TrzeciePomieszczenie = 2 * 3;
        int CzwartePomieszczenie = 2 * 2;
        int IloscOsob = 4;
        System.out.println("1 Pomieszczenie ma:" + PierwszePomieszczenie + "metrow");
        System.out.println("2 Pomieszczenie ma:" + DrugiePomieszczenie + "metrow");
        System.out.println("3 Pomieszczenie ma:" + TrzeciePomieszczenie + "metrow");
        System.out.println("4 Pomieszczenie ma:" + CzwartePomieszczenie + "metrow");
        System.out.println("Całkowita powierzchnia mieszkania na jedna osobe" + (PierwszePomieszczenie + DrugiePomieszczenie + TrzeciePomieszczenie + CzwartePomieszczenie)/IloscOsob + " metrow");
    }
}
