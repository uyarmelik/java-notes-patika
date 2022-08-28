import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username, password, usernameDogruMu, passwordDogruMu;

        System.out.print("Kullanıcı Adınız Ne Olsun: ");
        username = input.nextLine();
        System.out.print("Şifreniz Ne Olsun: ");
        password = input.nextLine();
        System.out.println();

        boolean dongu1=true, dongu2=true;

        while(dongu1){
            System.out.println("1. Giriş\n2. Şifre Değiştirin");
            System.out.print("Bir Seçim Yapınız: ");
            int secim = input.nextInt();
            input.nextLine();
            System.out.println();

            switch (secim){
                case 1 -> {
                    System.out.print("Kullanıcı Adınız: ");
                    usernameDogruMu = input.nextLine();
                    System.out.print("Şifreniz: ");
                    passwordDogruMu = input.nextLine();
                    if (usernameDogruMu.equals(username) && passwordDogruMu.equals(password)){
                        System.out.println("Giriş Yaptınız.");
                        dongu1 =false;
                    }
                    else{
                        System.out.println("Hatalı Giriş Yaptınız!\n");
                    }
                }

                case 2 -> {
                    System.out.print("Yeni Şifrenizi Giriniz: ");
                    passwordDogruMu = input.nextLine();
                    while(dongu2){
                        if (passwordDogruMu.equals(password)){
                            System.out.print("Eski Şifrenizi Girdiniz. Yeni Bir Şifre Giriniz: ");
                            passwordDogruMu = input.nextLine();
                        }
                        else{
                            password=passwordDogruMu;
                            System.out.println("Yeni Şifreniz Oluşturuldu.\n");
                            dongu2=false;
                        }
                    }
                }
            }
        }
    }
}