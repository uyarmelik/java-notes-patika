import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int ay, gun;
        Scanner input = new Scanner(System.in);

        System.out.print("Doğduğunuz Gün: ");
        gun = input.nextInt();
        System.out.print("Doğduğunuz Ay: ");
        ay = input.nextInt();
        System.out.print("Burcunuz: ");

        if (ay==1) {
            if (gun>=1 && gun<=21) System.out.println("Oğlak");
            else if (gun>=22 && gun<=31) System.out.println("Kova");
            else System.out.println("Bulunamadı\nYanlış tarih girdiniz.");
        }
        if (ay==2) {
            if (gun>=1 && gun<=19) System.out.println("Kova");
            else if (gun>=20 && gun<=29) System.out.println("Balık");
            else System.out.println("Bulunamadı\nYanlış tarih girdiniz.");
        }
        if (ay==3) {
            if (gun>=1 && gun<=20) System.out.println("Balık");
            else if (gun>=21 && gun<=31) System.out.println("Koç");
            else System.out.println("Bulunamadı\nYanlış tarih girdiniz.");
        }
        if (ay==4) {
            if (gun>=1 && gun<=20) System.out.println("Koç");
            else if (gun>=21 && gun<=30) System.out.println("Boğa");
            else System.out.println("Bulunamadı\nYanlış tarih girdiniz.");
        }
        if (ay==5) {
            if (gun>=1 && gun<=21) System.out.println("Boğa");
            else if (gun>=22 && gun<=31) System.out.println("İkizler");
            else System.out.println("Bulunamadı\nYanlış tarih girdiniz.");
        }
        if (ay==6) {
            if (gun>=1 && gun<=22) System.out.println("İkizler");
            else if (gun>=23 && gun<=30) System.out.println("Yengeç");
            else System.out.println("Bulunamadı\nYanlış tarih girdiniz.");
        }
        if (ay==7) {
            if (gun>=1 && gun<=22) System.out.println("Yengeç");
            else if (gun>=23 && gun<=31) System.out.println("Aslan");
            else System.out.println("Bulunamadı\nYanlış tarih girdiniz.");
        }
        if (ay==8) {
            if (gun>=1 && gun<=22) System.out.println("Aslan");
            else if (gun>=23 && gun<=31) System.out.println("Başak");
            else System.out.println("Bulunamadı\nYanlış tarih girdiniz.");
        }
        if (ay==9) {
            if (gun>=1 && gun<=22) System.out.println("Başak");
            else if (gun>=23 && gun<=30) System.out.println("Terazi");
            else System.out.println("Bulunamadı\nYanlış tarih girdiniz.");
        }
        if (ay==10) {
            if (gun>=1 && gun<=22) System.out.println("Terazi");
            else if (gun>=23 && gun<=31) System.out.println("Akrep");
            else System.out.println("Bulunamadı\nYanlış tarih girdiniz.");
        }
        if (ay==11) {
            if (gun>=1 && gun<=21) System.out.println("Akrep");
            else if (gun>=22 && gun<=30) System.out.println("Yay");
            else System.out.println("Bulunamadı\nYanlış tarih girdiniz.");
        }
        if (ay==12) {
            if (gun>=1 && gun<=21) System.out.println("Yay");
            else if (gun>=22 && gun<=31) System.out.println("Oğlak");
            else System.out.println("Bulunamadı\nYanlış tarih girdiniz.");
        }
        if (ay<1 || ay>12) System.out.println("Bulunamadı\nYanlış tarih girdiniz.");
    }
}
