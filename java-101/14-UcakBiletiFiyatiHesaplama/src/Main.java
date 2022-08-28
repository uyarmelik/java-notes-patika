import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mesafe, yas, yolculukTipi;
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafe (Km.): ");
        mesafe = input.nextInt();
        System.out.print("Yaş: ");
        yas = input.nextInt();
        System.out.println("Yolculuk Tipi:   1.Tek Yön   2. Gidiş-Dönüş");
        System.out.print("Yolculuk Tipiniz Hangisi: ");
        yolculukTipi = input.nextInt();

        if (mesafe<0 || yas<0 || yas>150 || yolculukTipi<1 || yolculukTipi>2){
            System.out.println("Hatalı veri girdiniz!");
            System.exit(0);
        }

        double toplam = (double) (mesafe*0.1);

        if (yas<12) toplam = toplam/2;
        if (yas>=12 && yas <=24) toplam = toplam - (toplam*0.1);
        if (yas>65) toplam = toplam - (toplam*0.3);
        if (yolculukTipi==2){
            toplam = toplam - (toplam*0.2);
            toplam = toplam*2;
        }

        System.out.println("\nToplam Ödenecek Tutar: " + toplam + " TL");
    }
}