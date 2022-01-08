
package sayitahminoyunu;
import java.util.Random;
import java.util.Scanner;
public class SayiTahminOyunu {

    public static void main(String[] args) {
      int tahmin,can=5,i=0;
      
      Random rastgele=new Random();
      
      Scanner klavye=new Scanner(System.in);
      
      int sayi=rastgele.nextInt(50);
      
      boolean oyunDurumu=false ,hata=false;
     
      int[] tahminler=new int[5];
        //System.out.println(sayi);
        System.out.println("Sayı Tahmin oyununa hoşgeldiniz!");
        System.out.println("0-49 arasında bulunan bir sayı tuttum");
        
        while( can>0){
        System.out.println("Tahmininiz:");  
        tahmin= klavye.nextInt();
        
        if(tahmin<sayi){
            System.out.println("Daha büyük bir sayı düşün");
        }else if(tahmin>sayi){
            System.out.println("Daha küçük bir sayı düşün");
        }
        
        if((tahmin<0) ||(tahmin >50)){
            if(hata){
                System.out.println("Çok fazla hatalı giriş yaptınız 1 can kaybettiniz.");
                System.out.println("Kalan can:"+ --can);
            }else{
                hata=true;
                System.out.println("Lütfen 0-49 arasında bulunan bir sayı giriniz");
            }
            continue;
        }
         tahminler[i++]=tahmin;
        if(tahmin ==sayi){
        oyunDurumu=true;
        
        break;
        }else{
            System.out.println("Yanlış,tekrar deneyiniz! Kalan can:"+ --can);
        }
        }
        if(oyunDurumu==true){
            System.out.println("Tuttuğum sayı:"+sayi);          
            System.out.println("Sayıyı buldunuz.Tebrikler!");
        }else{
            System.out.println("Başaramadınız!");
        }
          System.out.println("Tahminleriniz:");
          
        for(int value:tahminler){
            if(value!=0)
            System.out.println(value+",");
        }
        }
    
}
