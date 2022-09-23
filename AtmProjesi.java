import java.util.Scanner;

public class AtmProjesi {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String userName,password;


        int hak = 3;

        while(hak > 0){
            System.out.print("Lütfen kullanıcı adınızı giriniz : ");
            userName = scan.nextLine();
            System.out.print("Lütfen şifrenizi giriniz :");
            password = scan.nextLine();

            if(userName.equals("mesut")&&password.equals("123")){
            System.out.println("Sisteme giriş yaptınız");

            int select,balance = 2500;


            do{

                System.out.println("\n1-Para çekme\n2-Para Yatırma\n3-Bakiye sorgulama\n4-Çıkış");
                System.out.print("Yapmak istediğiniz işlemi seçiniz :");
                select = scan.nextInt();

                if(select == 1){
                    System.out.print("Lütfen çekmek istediğiniz miktarı giriniz : ");
                    int price;
                    price = scan.nextInt();
                    if(balance > price){
                        balance -= price;
                    }else{
                        System.out.print("Bakiye yetersiz");
                    }

                }else if(select == 2){
                    System.out.print("Lütfen yatırmak istediğiniz miktarı giriniz : ");
                    int price;
                    price = scan.nextInt();
                    balance += price;

                }else if(select == 3){
                    System.out.print("Bakiyeniz : "+balance);

                }
            }while(select != 4);
                System.out.println("Tekrar görüşmek üzere");
            break;
            }
            else{
            System.out.println("Yanlış bir giriş yaptınız");
            hak--;
            System.out.println("Kalan hakkınız : "+hak);
            }

        }



    }

}
