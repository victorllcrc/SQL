/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

/**
 *
 * @author Sherwin
 */
public class Consistencia {
    
    
    public void soloLetras(JTextField campo){
        campo.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e){
                char c = e.getKeyChar();
                if(c<32 || c>34 && c<65 || c>90 && c < 97 || c > 122){
                    e.consume();
                }
            }
        });
    }
    
    public void soloNumeros(JTextField campo){
        campo.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e){
                char c = e.getKeyChar();
                if(c < 48 || c >57){
                    e.consume();
                }
            }
        });
    }
    
    public void soloLetrasyNumeros(JTextField campo){
        campo.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e){
                char c = e.getKeyChar();
                if(c<32 || c>34 && c<48 || c>57&&c<65 || c>90&&c<97 || c>122){
                    e.consume();
                }
            }
        });
    }

}
