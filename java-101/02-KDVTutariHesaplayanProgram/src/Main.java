import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double fiyat, kdvliFiyat, kdvTutari;
        Scanner input = new Scanner(System.in);

        System.out.print("Fiyat: ");
        fiyat = input.nextDouble();

        boolean sonuc = (fiyat > 0 && fiyat < 1001);
        kdvTutari = sonuc ? (fiyat*0.18) : (fiyat*0.08);
        kdvliFiyat = fiyat + kdvTutari;

        System.out.println("KDV Tutari: " + kdvTutari);
        System.out.println("KDV'li Fiyat: " + kdvliFiyat);
    }
}