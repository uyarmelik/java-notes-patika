import java.util.Scanner;

public class DaireDilimininAlaniniBulanProgram {
    public static void main(String[] args) {
        double r, a;
        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz: ");
        r = input.nextDouble();
        System.out.print("Dairenin merkez açısının ölçüsünü giriniz: ");
        a = input.nextDouble();

        System.out.println("Daire Diliminin Alanı: " + ((Math.PI * r * r * a)/360));
    }
}
