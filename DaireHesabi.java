import java.util.Scanner;

public class DaireHesabi {
    public static void main(String[] args) {
        // Dairenin yarıçapını alıyoruz
        int r;
        double pi = 3.14,alan,cevre;

        System.out.print("Dairenin yarıçapını giriniz : ");

        Scanner input = new Scanner(System.in);
        r = input.nextInt();

        alan = pi*r*r;
        cevre = 2*pi*r;

        System.out.print("Dairenin alanı : "+ alan);
        System.out.print("Dairenin cevresi : "+ cevre);
    }
}
