/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverConfig;

import exceptions.MissingKeyException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author glas blaidd
 */
public class ServerConfig {
    int x, y;
    public ServerConfig(String Path) throws Exception, MissingKeyException{
        FileReader fr = null;
        try
        {
        fr = new FileReader(Path);
        }
        catch (IOException e)
        {
            throw new IOException("nu l-am gasit");
        }       
        BufferedReader br = new BufferedReader(fr);
        String line = null;
        boolean t1=false, t2=false;

        while ((line = br.readLine()) != null){
            line=line.trim();
            //System.out.println(line);
            if(line.startsWith("#"))
                continue;
            if(line.startsWith("MAX_CLIENTS="))
            {
                t1=true;
                line=line.replaceFirst("MAX_CLIENTS=", "");
                x=Integer.parseInt(line);}
                //System.out.println("MAX_CLIENTS este " +x);}

            if(line.startsWith("TCP_PORT"))
            {
                t2=true;
                line=line.replaceFirst("TCP_PORT=", "");
                y=Integer.parseInt(line);
                //System.out.println("TCP_PORT este " + y);}   
                //System.out.println(line.split("="));
        }}
          if(t2==false)
            throw new MissingKeyException("lipseste TCP_PORT");        
           if(t1==false)
            throw new MissingKeyException("lipseste MAX_CLIENTS");         
      
    
    br.close();}
    public int getTcpPort()
    {
        return y;
    }
    public int getMaxClients(){   
        return x;
    }   
    
}
