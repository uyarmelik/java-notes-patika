import java.util.Scanner;

public class DaireninAlaniniVeCevresiniBulanProgram {
    public static void main(String[] args) {
        double yariCap;
        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz: ");
        yariCap = input.nextDouble();

        System.out.println("Dairenin Alanı: " + (Math.PI * yariCap * yariCap));
        System.out.println("Dairenin Çevresi: " + (2 * Math.PI * yariCap));
    }
}
