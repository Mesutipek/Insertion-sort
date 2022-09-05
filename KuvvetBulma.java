import java.util.Scanner;



public class KuvvetBulma {
    public static void main(String[] args) {

        System.out.print("Lütfen bir sayı giriniz : ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for( int i = 1 ; i <= n ; i *= 4) {
            System.out.println("4'ün katları : " + i);
        }
        System.out.println("-------------------");
        for( int i = 1 ; i <= n ; i *= 5) {
            System.out.println("5'in katları : " + i);
        }
        }
    }

