import java.util.Scanner;

public class UsAlma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sayi,kuvvet,total = 1;

        System.out.print("Lütfen üssü alınacak sayıyı giriniz : ");
        sayi = scan.nextInt();
        System.out.print("Lütfen üssünü giriniz : ");
        kuvvet = scan.nextInt();



        for (int i = 1 ; i <= kuvvet ; i++) {
            total *= sayi;
        }

        System.out.println("Sayı : " + total);

    }
}
