import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double kilo, boy, kitle;
        Scanner input = new Scanner(System.in);

        System.out.print("Boy (m): ");
        boy = input.nextDouble();
        System.out.print("Kilo (kg): ");
        kilo = input.nextDouble();

        kitle = (kilo)/(boy*boy);
        System.out.println("Vücut Kitle İndeksiniz: " + kitle);
    }
}
