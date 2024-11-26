import java.util.Scanner;

public class DikUcgendeHipotenusBulanProgram {
    public static void main(String[] args) {
        double aKenari, bKenari, cKenari;
        Scanner input = new Scanner(System.in);

        System.out.print("Üçgenin ilk dik  kenarını yazınız: ");
        aKenari = input.nextDouble();
        System.out.print("Üçgenin ikinci dik  kenarını yazınız: ");
        bKenari = input.nextDouble();

        cKenari = Math.sqrt( (aKenari*aKenari) + (bKenari*bKenari) );
        System.out.println("Hipotenüsün Uzunluğu: "+ cKenari);
    }
}