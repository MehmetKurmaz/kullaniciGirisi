import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName,password;
        int secim,sifre;
        Scanner input=new Scanner(System.in);
        System.out.print("Kullanici Adinizi Giriniz :");
        userName=input.nextLine();
        System.out.print("Sifrenizi  Giriniz :");
        password=input.nextLine();
        if (userName.equals("Mehmet_02")&&password.equals("123456")){
            System.out.println("Giris Basarili yonlendiriliyorsunuz...");
            return;
        }else if (!userName.equals("Mehmet_02")){
            System.out.println("Kullanici Adi Hatali..!");
         return;
        }
        if (!password.equals("123456")){
            System.out.println("Sifreniz Hatali..!\n1.Sifre Yenile\n2.IPTAL\nSECIMINIZ :");

        }
        secim=input.nextInt();
        if (secim==1){
            System.out.println("Yeni Sifrenizi Giriniz :");
        }else if (secim==2){System.out.println("Hoscakalin");return;}

        sifre=input.nextInt();
        if (sifre==123456){
            System.out.println("Sifre Olusturulamadi...");
        }else System.out.println("Sifre Olusturma Basarili... ");







    }
}