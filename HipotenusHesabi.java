import java.util.Scanner;
public class HipotenusHesabi {
    public static void main(String[] args) {
        // Değişkenlerimizi oluştuduk.
        int a,b;
        double c;

        // Kullanıcıdan a ve b verilerini alalım.
        Scanner girdi = new Scanner(System.in);
        System.out.print("1. Kenarı giriniz :");
        a = girdi.nextInt();
        System.out.print("2. Kenarı giriniz :");
        b = girdi.nextInt();

        c = Math.sqrt((a*a)+(b*b));
        System.out.print("Üçgenin Hipotenüsü : " + c);
    }
}
