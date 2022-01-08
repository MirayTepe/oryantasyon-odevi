
package kartdestesi;


public class KartDestesi {

    public static void main(String[] args) {
       
       int[] deste =new int[52];
       String[] gruplar={"Maça","Kupa","Karo","Sinek"};
       String[] siralar={"As","2","3","4","5","6","7","8","9","10","Joker","Kız","Papaz"};
      
       //kartların başlangıcı
      for(int i=0; i<deste.length;i++){
       deste[i]=i;
         
         
      }
        //kartları karıştır
      for(int i=0; i<deste.length;i++){
      //rastgele bir indeks
      int index=(int)(Math.random()*deste.length);
      int temp=deste[i];
      deste[i]=deste[index];
      deste[index]=temp;
       
      }
       
      //ilk dört kartı göster
      for(int i=0; i<4 ; i++){
      String grup=gruplar[deste[i]/13];
      String sira=siralar[deste[i]%13];
      System.out.println("Kart numarası"+deste[i]+":"+ sira +"-"+grup);
      }
       
     }
}
