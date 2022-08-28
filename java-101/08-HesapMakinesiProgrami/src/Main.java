import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("İlk Sayıyı Yazınız: ");
        double ilk = input.nextDouble();
        System.out.print("İkinci Sayıyı Yazınız: ");
        double ikinci = input.nextDouble();
        System.out.println("1. Toplama\n2. Çıkarma\n3. Çarpma\n4. Bölme");
        System.out.print("Seçtiğiniz İşlemin Numarasını Yazınız: ");
        int secim = input.nextInt();

        switch (secim) {
            case 1 -> System.out.println("Toplama Sonucu: " + (ilk + ikinci));
            case 2 -> System.out.println("Çıkarma Sonucu: " + (ilk - ikinci));
            case 3 -> System.out.println("Çarpma Sonucu: " + (ilk * ikinci));
            case 4 -> System.out.println("Bölme Sonucu: " + (ilk / ikinci));
        }
    }
}
