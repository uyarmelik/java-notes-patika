import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int satir, sutun;
        Scanner input = new Scanner(System.in);
        System.out.print("Matrisin Satır Sayısı: ");
        satir = input.nextInt();
        System.out.print("Matrisin Sütun Sayısı: ");
        sutun = input.nextInt();
        System.out.println();

        int[][] matris = new int[satir][sutun];
        int[][] transpoz = new int[sutun][satir];

        for (int i=0;i<satir;i++) {
            for (int j=0;j<sutun;j++){
                System.out.print("Matirisin " + i + ". satırı " + j + ". sütunu: ");
                matris[i][j]=input.nextInt();
            }
        }

        for (int i=0;i<sutun;i++) {
            for (int j=0;j<satir;j++){
                transpoz[i][j]=matris[j][i];
            }
        }

        ekranaYazdir(matris,satir,sutun,"\nAsıl");
        ekranaYazdir(transpoz,sutun,satir,"\nTranspoz");


    }

    public static void ekranaYazdir(int[][] matris, int satir, int sutun, String metin){
        System.out.println(metin + " Matris: ");
        for (int i=0;i<satir;i++) {
            for (int j=0;j<sutun;j++){
                System.out.print(matris[i][j] + "\t");
            }
            System.out.println();
        }
    }

}