/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dippractice;

import java.util.Scanner;

/**
 *
 * @author tim78317
 */
public class KeyboardReader implements Reader {

    @Override
    public String readln(String msg) {
         System.out.println("Please enter some text, then press return:");

            Scanner input = new Scanner(System.in);
            return input.nextLine();
             
            
    }
    
  
}
