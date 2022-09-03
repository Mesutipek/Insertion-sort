import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {
        int year,kalan;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen doğum yılınızı giriniz : ");
        year = input.nextInt();

        kalan = year % 12;

        switch (kalan){
            case 0:
                System.out.print("Çin Zodyağı burcunuz : Maymun");
                break;
            case 1:
                System.out.print("Çin Zodyağı burcunuz : Horoz");
                break;
            case 2:
                System.out.print("Çin Zodyağı burcunuz : Köpek");
                break;
            case 3:
                System.out.print("Çin Zodyağı burcunuz : Domuz");
                break;
            case 4:
                System.out.print("Çin Zodyağı burcunuz : Fare");
                break;
            case 5:
                System.out.print("Çin Zodyağı burcunuz : Öküz");
                break;
            case 6:
                System.out.print("Çin Zodyağı burcunuz : Kaplan");
                break;
            case 7:
                System.out.print("Çin Zodyağı burcunuz : Tavşan");
                break;
            case 8:
                System.out.print("Çin Zodyağı burcunuz : Ejderha");
                break;
            case 9:
                System.out.print("Çin Zodyağı burcunuz : Yılan");
                break;
            case 10:
                System.out.print("Çin Zodyağı burcunuz : At");
                break;
            case 11:
                System.out.print("Çin Zodyağı burcunuz : Koyun");
                break;
            default :
                System.out.print("Yanlış bir tuşa bastınız !");
        }


    }
}
