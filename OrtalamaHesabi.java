import java.util.Scanner;


public class OrtalamaHesabi {
    public static void main(String[] args) {

        System.out.print("Lütfen bir sayı giriniz : ");
        Scanner input = new Scanner(System.in);
        double sayi,toplam = 0 ,sayac = 0, sonuc;
        sayi = input.nextDouble();

        for(int i = 1; i<=sayi;i++){
            if(i % 3 == 0 && i % 4 == 0){
                toplam += i;
                sayac++;
                System.out.println("3'e ve 4'e Tam bölünen Sayı : " + i);

            }
        }sonuc = toplam/sayac;
        System.out.print("Sonuç : " + sonuc);


    }
}
