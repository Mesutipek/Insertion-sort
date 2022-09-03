import java.util.Scanner;


public class ArtikYil {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen yıl giriniz : ");
        int yil = input.nextInt();

        if (yil % 100 == 0){
            if(yil % 400 == 0){
                System.out.print("Girdiğiniz yıl bir artık yıldır");
            }else{
                System.out.print("Girdiğiniz yıl bir artık yıl değildir");
            }
        }else if (yil % 4 == 0){
            System.out.print("Girdiğiniz yıl bir artık yıldır");
        }else {
            System.out.print("Girdiğiniz yıl bir artık yıl değildir");
        }

    }
}
