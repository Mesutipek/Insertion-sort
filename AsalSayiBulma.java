import java.util.Scanner;

public class AsalSayiBulma {
    public static void main(String[] args) {


        int number = 100;
        String asal = "";
        for(int i = 2; i <=100 ;i++ ){
            int sayac = 0;
            for(int k = i ; k > 1 ;k--){
                if(i % k == 0){
                    sayac++;
                }
            }
            if(sayac == 1){
                asal = asal + i +" ";
            }
        }
        System.out.println(asal);
    }
}
