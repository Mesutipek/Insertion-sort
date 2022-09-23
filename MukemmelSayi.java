import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number,counter = 0;
        System.out.print("Lütfen sayinizi giriniz : ");
        number = scan.nextInt();

        for(int i = 1;i < number ;i++){
            if(number % i == 0){
                counter += i;
            }
        }
        if(counter == number){
            System.out.println(number + " sayısı bir mükemmel sayıdır");
        }else{
            System.out.println(number + " sayısı bir mükemmel sayı değildir");
        }

    }
}
