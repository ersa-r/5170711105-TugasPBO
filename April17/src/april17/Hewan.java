
package april17;

import java.util.Scanner;


public class Hewan {

    String nama1 = "Air";
    String nama2 = "Darat";
    
    
    void gerak(){
        System.out.println("Maju");
    }
    void nafas(){
        System.out.println("Mengambil oksigen");
    }

    void aku(){
        System.out.println("Aku merupakan Mahkluk hidup");
    }
    protected void pilih(int pil){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukan pilihan : ");
        System.out.println("1. Makhluk yang hidup di Darat");
        System.out.println("2. Makhluk yang hidup di Air");
        System.out.print("Masukan Pilihan : ");
        pil = input.nextInt();
      
    
    }
}
