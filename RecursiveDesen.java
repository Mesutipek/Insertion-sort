import java.util.Scanner;
public class RecursiveDesen {
    static void desen(int number,int tempNumber,int x){
        if(number > 0 && x == 0){
            System.out.print(number + " ");
            number -= 5;
            desen(number,tempNumber,0);
        }else if(number == 0 || number < 0){
            System.out.print(number + " ");
            number += 5;
            desen(number,tempNumber,1);
        }else if(number > 0 && number <= tempNumber && x == 1){
            System.out.print(number + " ");
            number += 5;
            desen(number,tempNumber,1);
        }


    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number ;
        System.out.print("Lütfen sayıyı giriniz : ");
        number = scan.nextInt();
        desen(number,number,0);


    }
}
