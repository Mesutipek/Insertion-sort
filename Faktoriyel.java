import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[] args) {

        System.out.print("Lütfen sayı giriniz : ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int total = 1;

        for(int i = 1; i <= n ; i++ ){
            total = total * i;
        }
        System.out.println("Faktöriyel : "+total);



    }
}
