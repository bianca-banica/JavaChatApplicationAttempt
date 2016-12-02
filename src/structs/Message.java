/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structs;

import java.io.Serializable;

/**
 *
 * @author glas blaidd
 */
public class Message implements Serializable {
    
     String NumeE;
    String Mesaj;
    
    public Message (String NumeE, String Mesaj)
    {
        this.NumeE = NumeE;
        this.Mesaj = Mesaj;
    }
    
    public String toString()
    {
        return NumeE + ": " + Mesaj;
    }
    
}
