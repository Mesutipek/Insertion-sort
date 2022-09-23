import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number1,number2;
        System.out.print("Lütfen numara 1'i giriniz : ");
        number1 = scan.nextInt();
        System.out.print("Lütfen numara 2'yi giriniz : ");
        number2 = scan.nextInt();

        int i = 1,ebob =1;

        while(i <= number1){

            if(number1 % i == 0 && number2 % i == 0){
                ebob = i;
            }i++;
        }
        System.out.println(ebob);
         int ekok;
         ekok = number1*number2/ebob;
         System.out.println(ekok);

    }
}
