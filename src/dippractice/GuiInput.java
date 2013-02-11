
package dippractice;

import javax.swing.JOptionPane;

/**
 *
 * @author tim78317
 */
public class GuiInput implements InputStrategy {

    @Override
    public void inputMSG(String msg) {
       JOptionPane.showInputDialog("Enter your input here");
    }
    
}
