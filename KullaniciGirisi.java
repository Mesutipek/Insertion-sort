import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName,password;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanci Adinizi Giriniz : ");
        userName = input.nextLine();
        System.out.print("Şifrenizi Giriniz : ");
        password = input.nextLine();

        if(userName.equals("muzlufistik") && password.equals("muzlu123")){
            System.out.print("Başarıyla giriş yaptınız ! ");
        }else{
            System.out.print("Yanlış giriş yaptınız ! ");
        }
    }
}
