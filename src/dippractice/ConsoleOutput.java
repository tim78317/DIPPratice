/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dippractice;

/**
 *
 * @author tim78317
 */
public class ConsoleOutput implements OutputStrategy {
    @Override
    public void outputMSG(String msg){
        System.out.println(msg);
    }
}
