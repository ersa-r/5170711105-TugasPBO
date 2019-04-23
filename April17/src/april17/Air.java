
package april17;


public class Air extends Hewan{
    
    public void hewanAir(){
        System.out.println("Aku merupakan hewan yang hidup di "+ super.nama1)
        ;
    }
    @Override
     void gerak(){
         System.out.println("Aku bergerak dengan sirip");
     }
     @Override
     void nafas(){
         System.out.println("Aku bernafas dengan insang");
     }
     
}
