import java.util.Scanner;

public class kdvHesabi {
    public static void main(String[] args) {
        double woKdv,wKdv,kdv;
        Scanner input = new Scanner(System.in);

        System.out.print("lütfen Kdvsiz fiyatını giriniz :");
        woKdv = input.nextDouble();

        wKdv = woKdv*1.18;
        kdv = woKdv*0.18;

        System.out.println("Kdvli fiyatınız:"+ wKdv);
        System.out.println("Kdv tutarınız:"+ kdv);






    }
}