/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structs;

/**
 *
 * @author glas blaidd
 */
public class PrivateMessage extends Message{
    private final String NumeD;
    
    @Override
    public String toString(){
        return "priv()" + super.toString();
    }
    
    public PrivateMessage (String NumeD, String NumeE, String Mesaj){
        super(NumeE, Mesaj);
        this.NumeD = NumeD;
    }
    
    public String getRecipient(){
        return NumeD;
    }
   
}
