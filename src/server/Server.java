/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import exceptions.InvalidFormatException;
import exceptions.MissingKeyException;
import exceptions.UnknownKeyException;
import java.io.IOException;
import java.net.ServerSocket;
import serverConfig.ServerConfig;

/**
 *
 * @author glas blaidd
 */
public class Server {
    public static void main(String[] args) throws IOException, InvalidFormatException, UnknownKeyException, MissingKeyException, Exception{
        ServerConfig config = new ServerConfig("C:\\Users\\glas blaidd\\Documents\\NetBeansProjects\\JavaChatApplicationAttempt\\src\\server.conf.txt");
        System.out.println("Tcp port: " + config.getTcpPort());
        ServerSocket welcomeSocket = new ServerSocket(config.getTcpPort());
        ServerPeer peer = new ServerPeer(welcomeSocket.accept());
            peer.run();
    }
    
}
