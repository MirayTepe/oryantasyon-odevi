
package sinifgecme;
import java.util.Scanner;
public class SinifGecme {

    public static void main(String[] args) {
        //Türkçe,Matematik,Fen bilgisi,Sosyal bilimler,Beden eğitimi notları girilsin
        //Notların ortalaması hesaplansın 
        //Ortalama<50 ise sınıfta kalsın değilse sınıfı geçsin
        
        double turkce,matematik,fenBilgisi,sosyalBilgiler,bedenEğitimi,ortalama;
        ortalama=0;
        Scanner not=new Scanner(System.in);
        
        
        System.out.print("\nTürkçe notunu giriniz:");
        turkce=not.nextDouble();
        
        System.out.print("\nMatematik notunu giriniz:");
        matematik=not.nextDouble();
           
        System.out.print("\nFen bilgisi notunu giriniz:");
        fenBilgisi=not.nextDouble();
        
        System.out.print("\nSosyal Bilgiler notunu giriniz:");
        sosyalBilgiler=not.nextDouble();
        
        System.out.print("\nBeden eğitimi notunu giriniz:");
        bedenEğitimi=not.nextDouble();
        
        ortalama=(turkce+matematik+fenBilgisi+sosyalBilgiler+bedenEğitimi)/5;
        
        if(ortalama<50){
            System.out.println("Sıfınıfta kaldınız.");
        }else{
            System.out.println("Tebrikler sınıfı geçtiniz.");
        }
        
        System.out.println("ortalamanız:"+ ortalama);
    }
    
    
}
