/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author glas blaidd
 */
public class TextClient {
     public static void main(String[] args) throws IOException {
        
        String line;
        String username;
        Scanner keyboard = new Scanner(System.in);
        username=keyboard.nextLine();
        Socket clientSocket = new Socket("localhost", 9000);
        ClientPeer peer = new ClientPeer(username, clientSocket);
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        while (true)
        {
            line = in.readLine();
            if (line.equals("/q")) break;
            if(line.startsWith("/w"))
            {
                
                Scanner input = new Scanner (line);
                String incepebine=input.next();
                String destinatar = input.next();
                line=line.replaceFirst("/w", "");
            line=line.replaceFirst(destinatar, "");
            String mesaj = line;
                //System.out.println(" trimitem catre " + destinatar + " mesajul: " + mesaj);
               peer.sendMessage(mesaj, destinatar);
            }
            
           else peer.sendMessage(line);
        }
        
        clientSocket.close();
    }
}
