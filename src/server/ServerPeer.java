/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.net.Socket;

/**
 *
 * @author glas blaidd
 */
public class ServerPeer implements Serializable{
      private final Socket socket;
    public ServerPeer (Socket socket){
        this.socket = socket;
    }
    void run() throws IOException, ClassNotFoundException{
        ObjectInputStream stream = new ObjectInputStream(socket.getInputStream());
         while (true) {
                System.out.println(stream.readObject().toString().trim());
            }
    }
}
