import java.util.Scanner;


public class TaksimetreHesabi {
    public static void main(String[] args) {
        int km;
        double perKm = 2.2, toplam , baslangic = 10.0 ;

        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi km cinsinden giriniz : ");
        km = input.nextInt();
        toplam = baslangic + (km*perKm);
        toplam = (toplam < 20) ? 20 : toplam;
        System.out.print("Toplam ödenmesi gereken fiyat : " + toplam);

    }
}
