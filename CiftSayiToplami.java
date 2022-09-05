import java.util.Scanner;

public class CiftSayiToplami {
    public static void main(String[] args) {

        int n,toplam = 0;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Lütfen bir sayı giriniz : ");
            n = scan.nextInt();
            if (n % 2 == 0){
                toplam += n;
            }

        }while(n % 2 == 0);
            System.out.print("Sayıların toplamı : " + toplam);
    }
}
