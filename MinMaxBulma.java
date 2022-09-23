import java.util.Scanner;

public class MinMaxBulma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

            int adet,sayi,max = 1,min = 1;
            System.out.print("Kaç adet sayı gireceksiniz : ");
            adet = scan.nextInt();

            for(int i = 1 ;i <= adet;i++){
                System.out.print(i+". sayıyı giriniz : ");
                sayi = scan.nextInt();

                    if(i == 1){
                        max = sayi;
                        min = sayi;
                    }if(sayi > max){
                        max = sayi;
                    }if(sayi < min){
                        min = sayi;
                }
            }
        System.out.println("En büyük sayı : "+ max);
        System.out.print("En küçük sayı : "+ min);
    }
}
