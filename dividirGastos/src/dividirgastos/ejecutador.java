/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dividirgastos;

import javax.swing.JOptionPane;

/**
 *
 * @author chris
 */
public class ejecutador {
    
    
    public static void launch(){
        
        int enter = 1;
        
        while (enter == 1){
            
            enter = Integer.parseInt(JOptionPane.showInputDialog(null,"Agregar nueva cuenta \n1.Yes \n2.No"));
            
            if (enter == 1 ){
                
            
            
            }
            
            else if (enter == 2){
                enter = Integer.parseInt(JOptionPane.showInputDialog(null,"Ver cuentas a pagar \n1.Yes \n2.No"));
        
        }
            
            
            
            
            
            
    }
        

    
    
    }
    
    
    
    
}
