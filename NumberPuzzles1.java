/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberpuzzles1;

/**
 *
 * @author kendrabooker
 */
public class NumberPuzzles1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for(int i=10; i <= 99; i++){
        
            for(int j=10; j <= 99; j++){
                
                if((j + i) == 60 || (j - i) == 14){
                
                    System.out.println(j + " " + i);
                }
                
                
                
            }
        }
    }
    
}
