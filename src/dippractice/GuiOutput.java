
package dippractice;

import javax.swing.JOptionPane;

/**
 *
 * @author tim78317
 */
public class GuiOutput implements OutputStrategy {
    @Override
    public void outputMSG(String msg){
     JOptionPane.showMessageDialog(null, msg);
    }

   
}
