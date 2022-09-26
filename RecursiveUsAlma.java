import java.util.Scanner;

public class RecursiveUsAlma {
    static int result = 1;
    static int power (int a ,int b){

        if(b == 0){
            return 1;
        }
        result *= a;
        power(a,b-1);
        return result ;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,b;
        System.out.print("Lütfen 1.sayıyı giriniz : ");
        a = scan.nextInt();
        System.out.print("Lütfen 2.sayıyı giriniz : ");
        b = scan.nextInt();

        System.out.print("Sonuç : " +power(a,b));

    }
}
