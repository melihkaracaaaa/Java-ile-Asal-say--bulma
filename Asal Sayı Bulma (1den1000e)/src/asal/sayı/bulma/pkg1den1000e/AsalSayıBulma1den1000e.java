
package asal.sayi.bulma.pkg1den1000e;

public class AsalSayiBulma1den1000e {
    public static boolean asalMi(int sayi) {
        
        for (int i = 2 ; i < sayı ; i++) {
            
            if (sayi % i == 0) {
                
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
