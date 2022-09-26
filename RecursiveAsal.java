import java.util.Scanner;

public class RecursiveAsal {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;

        System.out.print("Lütfen sayıyı giriniz : ");
        number = scan.nextInt();
        asal(number, 2);

    }

    static void asal(int sayi, int i) {
        if (sayi == i) {
            System.out.println("Girdiğiniz sayı asal sayıdır");
            return;
        } else if (sayi % i == 0) {
            System.out.println("Girdiğiniz sayı bir asal sayı değildir");
            return;
        }
        asal(sayi, i + 1);
    }
}
