import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double gidilenMesafe, odenecekTutar;
        Scanner input = new Scanner(System.in);

        System.out.print("Kilometre Cinsinden Gidilen Mesafe: ");
        gidilenMesafe = input.nextDouble();

        odenecekTutar = 10 + (gidilenMesafe * 2.2);
        boolean sonuc = (odenecekTutar<20);

        System.out.println("Ödenecek Tutar: " + (sonuc ? 20 : odenecekTutar));
    }
}
