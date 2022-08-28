import java.util.Scanner;

public class UcgendeAlanHesaplayanProgram {
    public static void main(String[] args) {
        int a, b, c;
        double u, alan;
        Scanner input = new Scanner(System.in);

        System.out.print("Üçgenin 1. Kenarı: ");
        a = input.nextInt();
        System.out.print("Üçgenin 2. Kenarı: ");
        b = input.nextInt();
        System.out.print("Üçgenin 3. Kenarı: ");
        c = input.nextInt();

        u = (double) (a+b+c)/2;
        alan = (double) Math.sqrt(u * (u-a) * (u-b) * (u-c));

        System.out.println("Üçgenin Çevresi: " + (2*u));
        System.out.println("Üçgenin Alanı: " + alan);
    }
}