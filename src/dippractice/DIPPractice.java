
package dippractice;

/**
 *
 * @author tim78317
 */
public class DIPPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        
        
        

        InputStrategy inputStrategy = new GuiInput();
        inputStrategy.inputMSG(null);
        MessageService msgService = new MessageService();
        msgService.setInput(null);
        
        
        
        
        OutputStrategy OutputService = new GuiOutput();
        
        
        MessageService msgService2 = new MessageService();
        msgService2.getInput();
        OutputService.outputMSG(null);
        
        
        
        
        
        
        
        
    }
}
