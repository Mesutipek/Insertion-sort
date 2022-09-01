import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        double matematik,fizik,kimya,turkce,tarih,muzik;

        Scanner inp = new Scanner(System.in);

        System.out.println("Lütfen Matematik notunuzu giriniz");
        matematik = inp.nextDouble();

        System.out.println("Lütfen Fizik notunuzu giriniz");
        fizik = inp.nextDouble();

        System.out.println("Lütfen Kimya notunuzu giriniz");
        kimya = inp.nextDouble();

        System.out.println("Lütfen Türkçe notunuzu giriniz");
        turkce = inp.nextDouble();

        System.out.println("Lütfen Tarih notunuzu giriniz");
        tarih = inp.nextDouble();

        System.out.println("Lütfen Müzik notunuzu giriniz");
        muzik = inp.nextDouble();

        double a = (matematik+fizik+kimya+turkce+tarih+muzik);
        double b = a/6;
        System.out.println("Ortalamanız :"+ b);

        boolean sonuc = b >= 60.0;
        String str = sonuc ? "Geçtiniz" : "Kaldınız" ;
        System.out.println(str);







    }
}
