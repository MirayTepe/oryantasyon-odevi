
package buyuktenkucugesiralama;
import java.util.Scanner;
public class BuyuktenKucugeSiralama {

    public static void main(String[] args) {
      //a>b>c veya a>c>b 
      //b>a>c veya b>c>a 
      //c>b>a veya c>a>b 
    
      int a,b,c;
      Scanner klavye=new Scanner(System.in);
        System.out.println("Birbirinden farklı üç sayı giriniz:");
        System.out.println("a:");
        a=klavye.nextInt();
        System.out.println("b:");
        b=klavye.nextInt();
        System.out.println("c:");
        c=klavye.nextInt();
        
        if(a>b && a>c){
          if(b>c){
              System.out.println("a>b>c");
          
          }else{
              System.out.println("a>c>b");
          }
        
        }else if(b>a && b>c){
         if(a>c){
             System.out.println("b>a>c");
       
         }else{
             System.out.println("b>c>a");
         }
         
        }else {
         if(b>a){
             System.out.println("c>b>a");
         
         }else{
             System.out.println("c>a>b");
         }
         
        }

    }
    
}
