import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Doğum yılınızı giriniz: ");
        int yil = input.nextInt();

        if (yil%12==0) System.out.println("Çin Zodyağı: Maymun");
        if (yil%12==1) System.out.println("Çin Zodyağı: Horoz");
        if (yil%12==2) System.out.println("Çin Zodyağı: Köpek");
        if (yil%12==3) System.out.println("Çin Zodyağı: Domuz");
        if (yil%12==4) System.out.println("Çin Zodyağı: Fare");
        if (yil%12==5) System.out.println("Çin Zodyağı: Öküz");
        if (yil%12==6) System.out.println("Çin Zodyağı: Kaplan");
        if (yil%12==7) System.out.println("Çin Zodyağı: Tavşan");
        if (yil%12==8) System.out.println("Çin Zodyağı: Ejderha");
        if (yil%12==9) System.out.println("Çin Zodyağı: Yılan");
        if (yil%12==10) System.out.println("Çin Zodyağı: At");
        if (yil%12==11) System.out.println("Çin Zodyağı: Koyun");
    }
}
