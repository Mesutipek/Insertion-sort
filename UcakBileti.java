import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        int km,age,type;
        double perKm = 0.10,price;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen mesafeyi giriniz : ");
        km = input.nextInt();
        System.out.print("Lütfen yaşınızı giriniz : ");
        age = input.nextInt();
        System.out.print("Lütfen yolculuk tipinizi seçiniz : \nGidiş => 1\nGidiş-Dönüş =>2\nSeçiminiz : ");
        type = input.nextInt();

        price = km*perKm;

        if(km <= 0 || age <= 0){
            System.out.print("Hatalı veri girdiniz !");
        } else if (type < 1 || type > 2){
            System.out.print("Hatalı veri girdiniz !");
        }else{
            if(age < 12){
                price = price*0.5;
            }
            else if(age <= 24){
                price = price*0.9;
            }
            else if(age >= 65){
                price = price*0.7;
            }
        }
        if (type == 2){
            price = price*0.8;
        }
        System.out.print("Toplam tutarınız : "+ price);
    }
}
