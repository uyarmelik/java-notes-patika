import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fiz, tur, kim, muz;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notu: ");
        mat = input.nextInt();
        while(mat<0 || mat>100){
            System.out.print("Geçerli Bir Matematik Notu Giriniz: ");
            mat = input.nextInt();
        }

        System.out.print("Fizik Notu: ");
        fiz = input.nextInt();
        while(fiz<0 || fiz>100){
            System.out.print("Geçerli Bir Fizik Notu Giriniz: ");
            fiz = input.nextInt();
        }

        System.out.print("Türkçe Notu: ");
        tur = input.nextInt();
        while(tur<0 || tur>100){
            System.out.print("Geçerli Bir Türkçe Notu Giriniz: ");
            tur = input.nextInt();
        }

        System.out.print("Kimya Notu: ");
        kim = input.nextInt();
        while(kim<0 || kim>100){
            System.out.print("Geçerli Bir Kimya Notu Giriniz: ");
            kim = input.nextInt();
        }

        System.out.print("Müzik Notu: ");
        muz = input.nextInt();
        while(muz<0 || muz>100){
            System.out.print("Geçerli Bir Müzik Notu Giriniz: ");
            muz = input.nextInt();
        }

        double ortalama = (double)((mat+fiz+tur+kim+muz)/5);
        System.out.println(ortalama<55 ? "Sınıfta kaldınız!" : "Sınıfı Geçtiniz.");


    }
}
