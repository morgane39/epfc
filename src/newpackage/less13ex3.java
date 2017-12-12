
package newpackage;

import java.util.Arrays;

public class less13ex3 {
    
    public static void main(String[] args) {
        
        int[] base = new int [9];
        Arrays.fill(base, 9);
        
        for (int i : base) {
            System.out.println(i);
        }
        
        System.out.println(Arrays.toString(base));
        
        Arrays.fill(base, 4, 6 , 0);
        
        System.out.println(Arrays.toString(base));
    }
    
}
