package podstawy2;
import java.util.Scanner;

public class zadanie10 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        double liczbakalorii;
        double liczbatlusczow;

        System.out.println("ile zjadles kalorii?");
        liczbakalorii= klawiatura.nextDouble();
        klawiatura.nextLine();

        System.out.println("ile zjadles tluszczow?(w gramach)");
        liczbatlusczow= klawiatura.nextDouble();
        klawiatura.nextLine();

        double kalorieztluszczow= liczbatlusczow*9;
        double kaloriewsumie= kalorieztluszczow+liczbakalorii;
        double procentkaloriitluszczowych=kalorieztluszczow/kaloriewsumie;

        int strznik = 1;
        if(procentkaloriitluszczowych<0.3){
            System.out.println("Twoj produkt jest niskotluszczowy");
        } else if (kalorieztluszczow>liczbakalorii) {
            System.out.println("Dane są nieprawidlowe");
            strznik=0;

        }
        if(strznik!=0){
            System.out.println("Twoj procent kalorii tluszczowych to:"+procentkaloriitluszczowych+"%");
        }



    }
}
