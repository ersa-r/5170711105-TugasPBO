
package april17;


public class Darat extends Hewan {
    
    void hewanDarat(){
        System.out.println("Aku merupakan hewan yang hidup di " +super.nama2);
    }
    @Override
    void gerak(){
        System.out.println("Aku bergerak dengan kaki ");
    }
    @Override
    void nafas(){
         System.out.println("Aku bernafas dengan paru-paru");
    }
    
}