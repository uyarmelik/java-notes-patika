import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armutFiyat=2.14, elmaFiyat=3.67, domatesFiyat=1.11, muzFiyat=0.95, patlicanFiyat=5.0;
        double armutKilo, elmaKilo, domatesKilo, muzKilo, patlicanKilo, toplam;
        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo? : ");
        armutKilo = input.nextDouble();
        System.out.print("Elma Kaç Kilo? : ");
        elmaKilo = input.nextDouble();
        System.out.print("Domates Kaç Kilo? : ");
        domatesKilo = input.nextDouble();
        System.out.print("Muz Kaç Kilo? : ");
        muzKilo = input.nextDouble();
        System.out.print("Patlıcan Kaç Kilo? : ");
        patlicanKilo = input.nextDouble();

        toplam = (armutFiyat*armutKilo) + (elmaFiyat*elmaKilo) + (domatesFiyat*domatesKilo) + (muzFiyat*muzKilo) + (patlicanFiyat*patlicanKilo);
        System.out.println("Toplam Tutar: " + toplam + " Tl");
    }
}
