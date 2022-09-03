import java.util.Scanner;

public class EtkinlikOnerisi {
    public static void main(String[] args) {
        int sicaklik;
        System.out.print("Lütfen Sıcaklık Değerini Giriniz : ");
        Scanner input = new Scanner(System.in);
        sicaklik = input.nextInt();

        if(sicaklik < 5){
            System.out.print("Kayak yapabilirsiniz.");
        }else if (sicaklik <= 15){
            System.out.print("Sinemaya gidebilirsiniz.");
        }else if (sicaklik <= 25){
            System.out.print("Pikniğe gidebilirsiniz.");
        } else {
        System.out.print("Yüzmeye gidebilirsiniz. ");
        }
    }
}
