import java.util.Scanner;

public class BasamakBulma {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen Bir Sayı giriniz : ");
        int number = scan.nextInt();

        int basamakSayisi = 0, basamakToplami = 0;

        while (number != 0){
            basamakToplami += (number % 10);
            number /= 10;
            basamakSayisi++;
        }
        System.out.println("Basamak sayisi : " +basamakSayisi);
        System.out.println("Basamak toplami : " +basamakToplami);

    }
}
