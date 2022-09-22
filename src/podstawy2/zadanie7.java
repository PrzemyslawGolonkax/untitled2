package podstawy2;

import java.util.Scanner;

public class zadanie7 {
    public static void main(String[] args) {
        Scanner klawiatura =  new Scanner(System.in);

        String imie1;
        System.out.println("Wprowadz imie pierwsze: ");
        imie1 = klawiatura.nextLine();
        String imie2;
        System.out.println("Wprowadz imie drugie: ");
        imie2 = klawiatura.nextLine();
        String imie3;
        System.out.println("Wprowadz imie trzecie: ");
        imie3 = klawiatura.nextLine();

        if (imie1.compareTo(imie2)<0 && imie2.compareTo(imie3)<0 && imie1.compareTo(imie3)<0) {
            System.out.println(imie1+"jest pierwszy alfabetycznie");
            System.out.println(imie2+ "jest drugie alfabetycznie");
            System.out.println(imie3+ "jest trzecie alfabetycznie");
        } else if (imie1.compareTo(imie2)<0 && imie2.compareTo(imie3)>0 && imie1.compareTo(imie3)<0){
            System.out.println(imie1+"jest pierwsze alfabetycznie");
            System.out.println(imie3+"jest drugie alfabetycznie");
            System.out.println(imie2+"jest trzecie alfabetycznie");
        }else if (imie2.compareTo(imie3)<0  && imie3.compareTo(imie1)<0){
            System.out.println(imie2+"jest pierwsze alfabetycznie");
            System.out.println(imie3+"jest drugie alfabetycznie");
            System.out.println(imie1+"jest trzecie alfabetycznie");
        }else if (imie2.compareTo(imie1)<0 && imie1.compareTo(imie3)<0){
            System.out.println(imie2+"jest pierwsze alfabetycznie");
            System.out.println(imie1+"jest drugie alfabetycznie");
            System.out.println(imie3+"jest trzecie alfabetycznie");
        }else if (imie3.compareTo(imie2)<0 && imie2.compareTo(imie1)<0){
            System.out.println(imie3+"jest pierwsze alfabetycznie");
            System.out.println(imie2+"jest drugie alfabetycznie");
            System.out.println(imie1+"jest trzecie alfabetycznie");
        }else if (imie3.compareTo(imie1)<0 && imie1.compareTo(imie2)<0){
            System.out.println(imie3+"jest pierwsze alfabetycznie");
            System.out.println(imie1+"jest drugie alfabetycznie");
            System.out.println(imie2+"jest trzecie alfabetycznie");

        }


    }
}
