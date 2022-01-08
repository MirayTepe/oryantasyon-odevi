
package maashesaplama;

import java.util.Scanner;
public class MaasHesaplama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Sicil no,çalışma saati ve saatlik ücret giriliyor
        // SSK pirimi maaşın %14'ü
        //vergi maaşın %15'i
        //net maaş=maaş-(vergi+pirim)
        Scanner klavye=new Scanner(System.in);
        System.out.println("Sicil No giriniz:");
        String sicilNo=klavye.nextLine();
        System.out.println("Çalışma saatini giriniz:");
        int Calısma_Saati=klavye.nextInt();
        System.out.println("Saatlik ücreti giriniz:");
        int Saatlik_Ücret=klavye.nextInt();
        double Maas,Pirim,Vergi,netMaas;
        Maas=Calısma_Saati*Saatlik_Ücret;
        Pirim=Maas*0.14;
        Vergi=Maas*0.15;
        netMaas=Maas-(Vergi+Pirim);
        System.out.println("Sicil No,Pirim,Vergi,Net Maas:"+sicilNo+","+Pirim+","+Vergi+","+netMaas);
    }
    
}
