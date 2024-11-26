import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double mat, fiz, kim, tur, tar, muz, ortalama;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        mat = input.nextDouble();

        System.out.print("Fizik notunuzu giriniz: ");
        fiz = input.nextDouble();

        System.out.print("Kimya notunuzu giriniz: ");
        kim = input.nextDouble();

        System.out.print("Türkçe notunuzu giriniz: ");
        tur = input.nextDouble();

        System.out.print("Tarih notunuzu giriniz: ");
        tar = input.nextDouble();

        System.out.print("Müzik notunuzu giriniz: ");
        muz = input.nextDouble();

        ortalama = (mat+fiz+kim+tur+tar+muz) / 6.0;
        boolean sonuc = (ortalama > 60.0);

        System.out.print(sonuc ? "Sınıfı geçti." : "Sınıfta kaldı.");
    }
}