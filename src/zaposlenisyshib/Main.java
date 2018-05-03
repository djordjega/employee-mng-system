/*
 * Zaposleni Sistem / Hibernate
 */
package zaposlenisyshib;

import java.awt.Color;
import javax.swing.UIManager;

/**
 *
 * @author Djordje Gavrilovic
 */
public class Main {
    public static void main(String[] args) {
        
        try { 
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"); 
        } catch(Exception e){ }
        
        zaposleni.ui.InitialFrame frame = new zaposleni.ui.InitialFrame();
        frame.setSize(650,400);
        frame.getContentPane().setBackground(Color.decode("#8593ae"));
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
    }
    
}
