
package asal.sayı.bulma.pkg1den1000e;

public class AsalSayıBulma1den1000e {
    public static boolean asalMi(int sayı) {
        
        for (int i = 2 ; i < sayı ; i++) {
            
            if (sayı % i == 0) {
                
                return false;
                
            }
            
        }
        return true;
        
        
    }
    public static void main(String[] args) {
        
        for (int i = 2 ; i < 1000 ; i++){
            
            if (asalMi(i)) {
                
                System.out.println(i);
                 
            }
        }
        
        
        
    }
    
}
