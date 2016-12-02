/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.Socket;
import structs.Message;
import structs.PrivateMessage;

/**
 *
 * @author glas blaidd
 */
public class ClientPeer implements Serializable{
    private final String mSender;
    private final ObjectOutputStream mObjectStream;
    public ClientPeer (String sender, Socket socket) throws IOException
    {
        mSender = sender;
        mObjectStream = new ObjectOutputStream(socket.getOutputStream());
    }
    
    void sendMessage (String message) throws FileNotFoundException, IOException {
        
           mObjectStream.writeObject(new Message(mSender, message));
            
        }
    void sendMessage(String message, String recipient) throws FileNotFoundException, IOException {
         mObjectStream.writeObject(new PrivateMessage(recipient, mSender, message));
    }
    
}
