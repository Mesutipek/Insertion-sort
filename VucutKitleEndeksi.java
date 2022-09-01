import java.util.Scanner;

public class VucutKitleEndeksi {
    public static void main(String[] args) {
        double kilo,boy,Indeks;

        System.out.print("Lütfen kilonuzu giriniz : ");
        Scanner input = new Scanner(System.in);
        kilo = input.nextDouble();

        System.out.print("Lütfen boyunuzu giriniz : ");
        boy = input.nextDouble();

        Indeks = (kilo)/(boy*boy);
        System.out.print("Vücut kitle indeksiniz : "+ Indeks);

    }
}
