
package login;
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        Scanner giris=new Scanner(System.in);
        
        String kullanıcıAdı,sifre;
        
        System.out.println("Lütfen kullannıcı adınızı giriniz");
        kullanıcıAdı =giris.nextLine();
        
        System.out.println("\nLütfen şifre giriniz");
        sifre=giris.nextLine();
        
        if(kullanıcıAdı.equals("Miray")&& sifre.equals("2022")){
            System.out.println("Başarılı giriş yaptınız.");
                      
        }else{
            System.out.println("Kullanıcı adınızı veya şifrenizi yanlış girdiniz!");
        }
    }   
    
}
