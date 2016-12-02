/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structs;

import exceptions.MissingKeyException;
import serverConfig.ServerConfig;

/**
 *
 * @author glas blaidd
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception, MissingKeyException {
        // TODO code application logic here
         Message mesaj1 = new Message ("Eu", "pa");
        
        PrivateMessage msg1 = new PrivateMessage ("Eu", "Tu", "pa");
        PrivateMessage msg2 = new PrivateMessage ("Bianca", "Iman", "te iubesc");
        
        System.out.println(mesaj1.toString());
        System.out.println(msg1);
        System.out.println("To: " + msg1.getRecipient());
        System.out.println(msg2);
        System.out.println("To: " + msg2.getRecipient());
        
        
      ServerConfig s = new ServerConfig("C:\\Users\\glas blaidd\\Documents\\NetBeansProjects\\JavaChatApplicationAttempt\\src\\server.conf.txt");
        
      System.out.println("MAX_CLIENTS este " + s.getMaxClients());
      System.out.println("TCP_PORT este " + s.getTcpPort());
        
        
    }
    
}
