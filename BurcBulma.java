import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args) {
        int day,month;
        String burc = "";

        Scanner input = new Scanner(System.in);
        System.out.print("Ay giriniz : ");
        month = input.nextInt();
        System.out.print("Gün giriniz : ");
        day = input.nextInt();
        if(day < 1 || day > 31){
            System.out.print("Yanlış bir giriş yaptınız");
        }else if(month < 1 || month > 12){
            System.out.print("Yanlış bir giriş yaptınız");
        }else if(month == 1){
            if(day < 22){
            burc = "Oğlak";
            }else{
            burc = "Kova";
            }
    }   else if(month == 2){
            if(day < 20){
                burc = "Kova";
            }else{
                burc = "Balık";
            }
        }
        else if(month == 3){
            if(day < 21){
                burc = "Balık";
            }else{
                burc = "Koç";
            }
        }
        else if(month == 4){
            if(day < 22){
                burc = "Koç";
            }else{
                burc = "Boğa";
            }
        }
        else if(month == 5){
            if(day < 22){
                burc = "Boğa";
            }else{
                burc = "İkizler";
            }
        }
        else if(month == 6){
            if(day < 23){
                burc = "İkizler";
            }else{
                burc = "Yengeç";
            }
        }
        else if(month == 7){
            if(day < 23){
                burc = "Yengeç";
            }else{
                burc = "Aslan";
            }
        }
        else if(month == 8){
            if(day < 23){
                burc = "Aslan";
            }else{
                burc = "Başak";
            }
        }
        else if(month == 9){
            if(day < 23){
                burc = "Başak";
            }else{
                burc = "Terazi";
            }
        }
        else if(month == 10){
            if(day < 23){
                burc = "Terazi";
            }else{
                burc = "Akrep";
            }
        }
        else if(month == 11){
            if(day < 22){
                burc = "Akrep";
            }else{
                burc = "Yay";
            }
        }
        else{
            if(day < 22){
                burc = "Yay";
            }else{
                burc = "Oğlak";
            }
        }
        if(!(day < 1 || day > 31) && !(month < 1 || month > 12)){
            System.out.print("Burcunuz : "+ burc);
        }


}}
