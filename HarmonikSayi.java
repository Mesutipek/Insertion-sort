import java.util.Scanner;

public class HarmonikSayi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen N sayısını giriniz : ");
        int n = scan.nextInt();
        double result = 0;

        for(double i = 1.0 ; i <= n ; i++){
            result += (1.0/i);
        }
        System.out.println("Sonuç : "+ result);
    }
}
