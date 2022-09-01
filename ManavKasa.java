import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        // Meyvelerimizi tanımlıyoruz.
        double armut = 2.14,elma = 3.67 ,domates = 1.11 ,muz = 0.95 ,patlican = 5.00 ;

        Scanner input = new Scanner(System.in);

        double armutF,elmaF,domatesF,muzF,patlicanF,toplam;
        System.out.print("Armut kaç kilo : ");
        armutF = input.nextDouble();
        System.out.print("Elma kaç kilo : ");
        elmaF = input.nextDouble();
        System.out.print("Domates kaç kilo : ");
        domatesF = input.nextDouble();
        System.out.print("Muz kaç kilo : ");
        muzF = input.nextDouble();
        System.out.print("Patlican kaç kilo : ");
        patlicanF = input.nextDouble();

        toplam = armut*armutF+elma*elmaF+domates*domatesF+muz*muzF+patlican*patlicanF;
        System.out.print("Toplam tutarınız : " + toplam);



    }
}
