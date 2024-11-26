import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Hava Sıcaklığı: ");
        int hava = input.nextInt();

        System.out.print("Önerilen Etlinlik: ");
        if (hava<5) System.out.println("Kayak");
        if (hava>=5 && hava<15) System.out.println("Sinema");
        if (hava>=15 && hava<25) System.out.println("Piknik");
        if (hava>=25) System.out.println("Yüzme");
    }
}