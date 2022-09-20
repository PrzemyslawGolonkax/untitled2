package podstawy;

public class Zadanie5i6 {
    public static void main(String[] args) {
     int room1=4, room2=4, room3=3, room4=2;
     int siana1=2, sciana2=3;
     int powierzchniapomieszczenia1= room1*sciana2;
    int powDrugiegoPomieszczenia2= room2*sciana2;
    int powtrzeciegopom= room3*siana1;
     int powczwartegopom= room4*siana1;
     int powcalkowita = powierzchniapomieszczenia1+powDrugiegoPomieszczenia2+powtrzeciegopom+powczwartegopom;
        System.out.println(room1+", "+room2+", "+room3+", "+room4);
        System.out.println(powcalkowita);
        int iloscosob = 4;
        double iloscmetrownaosobe= (powcalkowita/iloscosob);
        System.out.println("ilosc metrow na osobe"+iloscmetrownaosobe);
    }
}
