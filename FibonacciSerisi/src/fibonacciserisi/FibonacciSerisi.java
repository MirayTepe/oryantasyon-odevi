
package fibonacciserisi;

import java.util.Scanner;
public class FibonacciSerisi {

    public static void main(String[] args) {
        //Fibonacci serisi 0,1,1,2,3,5,8,13,21..
        Scanner giriş=new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        
        int sayi=giriş.nextInt();
        
        int s1=0;
        int s2=1;
        int toplam;
        System.out.println(sayi+" Sayısının Fibonacci Serisi:");
        
        for(int i=1;i<=sayi;i++){
            System.out.println(s1+",");
            
        toplam=s1+s2;
        s1=s2;
        s2=toplam;
        }
        
    }
    
}
