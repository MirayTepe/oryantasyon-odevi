
package ucakbiletihesaplama;

import java.util.Scanner;
public class UcakBiletiHesaplama {

    
    public static void main(String[] args) {
      //km birim fiyatı=5TL
      //12 yaşından küçükse toplam fiyata %50 indirim
      //12 ve 24 yaş arasındaysa %20 indirim
      //65 yaşından büyükse %30 indirim
      //Gidiş-DÖNÜŞ %15indirim
      //Bu koşulları sağlayarak bilet fiyatı hesaplayan program
      Scanner klavye=new Scanner(System.in);
      int km,yas,ucus;
        System.out.println("Mesafe Giriniz:");
        km=klavye.nextInt();
        System.out.println("Yaşınızı giriniz:");
        yas=klavye.nextInt();
        System.out.println("Hangi yolculuk tipiyle seyahat etmek istediğinizi seçiniz=(1-Gidiş ,2-Gidiş/Dönüş ,3-Dönüş):");
        ucus=klavye.nextInt();
        
        double normalFiyat,yasIndirimi,ucusIndirimi;
        
        if(km>0 && yas>0 &&(ucus==1 || ucus==2 || ucus==3)){
            normalFiyat=km*5;
            if(yas<12){
            yasIndirimi=normalFiyat*0.5;//indirim oranı
         
            }else if(yas>=12 && yas<=24){
               yasIndirimi=normalFiyat*0.20;
             
            }else if(yas>65) {
            yasIndirimi=normalFiyat*0.30;
           
            }else{
            yasIndirimi=0;
            }   
         normalFiyat-=yasIndirimi;//Fiyattan indirim  payını çıkardım
         if(ucus==2){
         ucusIndirimi=normalFiyat*0.15;
         normalFiyat=(normalFiyat-ucusIndirimi)*2;
         }
       System.out.print("Bilet fiyatı:"+normalFiyat);
        }else {
            System.out.println("Yanlış giriş yaptınız!");
        }
        
    }
    
}
