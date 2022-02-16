package edu.escuelaing.arep.server;

import java.io.IOException;
import java.net.URISyntaxException;

public class NanoServer {
    private static NanoServer singleton;
    private Server server = new Server();

    public static NanoServer getInstance() {
        if (singleton == null){
            singleton = new NanoServer();
        }
        return singleton;
    }

    public void start(){
        try{
            server.start();
        } catch (IOException | URISyntaxException e){
            e.printStackTrace();
        }
    }

    public static void main (String[] args) {
        NanoServer nanoServer = getInstance();
        nanoServer.start();
    }
}
