import java.util.Scanner;


public class YeniNotHesabi {
    public static void main(String[] args) {
        double matematik,fizik,kimya,turkce,muzik;

        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen Matematik notunuzu giriniz : ");
        matematik = inp.nextDouble();

        System.out.print("Lütfen Fizik notunuzu giriniz : ");
        fizik = inp.nextDouble();

        System.out.print("Lütfen Kimya notunuzu giriniz : ");
        kimya = inp.nextDouble();

        System.out.print("Lütfen Türkçe notunuzu giriniz : ");
        turkce = inp.nextDouble();

        System.out.print("Lütfen Müzik notunuzu giriniz : ");
        muzik = inp.nextDouble();

        double ortalama = (matematik+fizik+kimya+turkce+muzik)/5 ;
        System.out.println("Ortalamanız : " +ortalama);

        if(ortalama >= 55){
            System.out.print("Tebrikler,Başarıyla sınıfı geçtiniz. ");
        }else{
            System.out.print("Maalesef,Sınıfı geçemediniz. ");
        }
    }
}
