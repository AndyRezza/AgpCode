/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgVista;

import UpperEssential.UpperEssentialLookAndFeel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author GustavoF
 */
public class SPLASH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try
                {
                    UIManager.setLookAndFeel(new UpperEssentialLookAndFeel("C:/Users/Andres Rezza/Desktop/AgpCODE/agpcodex.theme"));
                } catch ( UnsupportedLookAndFeelException e ){ e.printStackTrace(); }
        inicio ini = new inicio();  
        ini.setVisible(true);
    
    }
    
}
