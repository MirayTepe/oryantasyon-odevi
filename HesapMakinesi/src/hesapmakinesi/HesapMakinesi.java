
package hesapmakinesi;

import java.util.Scanner;

public class HesapMakinesi {

    public static void main(String[] args) {
       Scanner giris=new Scanner(System.in);
       Scanner islem=new Scanner(System.in);
       double sayi1,sayi2;
       int secim;
       
       System.out.println("Birinci sayıyı giriniz");
       sayi1= giris.nextDouble();

       System.out.println("\nİkinci sayıyı giriniz");
       sayi2=giris.nextDouble();
       
       System.out.println("\nLütfen yapmak istediğiniz işlemi seçiniz");
       System.out.println("1)Toplama\n2)Çıkarma\n3)Çarpma\n4)Bölme");
       
        System.out.println("Seçiminiz");
        secim=islem.nextInt();
        
        if(secim==1){
            System.out.println("Toplama:"+(sayi1 + sayi2));
        }else if(secim==2){
            System.out.println("Çıkarma:"+(sayi1 - sayi2));
        }else if(secim==3){
            System.out.println("Çarpma:"+(sayi1 * sayi2));
        }else if(secim==4){
         if(sayi2==0){
            System.out.println("ikinci sayı 0'a eşitse sonuç belirsizdir!");
         }else{
             System.out.println("Bölme:"+(sayi1 / sayi2));
         }
        }else{
            System.out.println("Geçersiz sayı girdiniz.Lütfen tekrar deneyiniz!");
        }
    }
    
}
