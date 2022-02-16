package edu.escuelaing.arep.server;

import edu.escuelaing.arep.handler.Handler;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static edu.escuelaing.arep.utils.Constants.TYPE;

public class Server {
    private PrintWriter output;
    private BufferedReader input;
    private ServerSocket serverSocket;
    private Socket clientSocket;

    public final static Map<String, String> types = new HashMap<String, String>();

    public Server(){
        prepareTypes();
    }

    public void prepareTypes(){
        for (String[] t : TYPE){
            types.put(t[0], t[1]);
        }
    }

    public void start() throws IOException, URISyntaxException {
        int port = 36000;
        serverSocket = null;
        try{
            serverSocket = new ServerSocket(port);
        }catch(IOException e){
            System.exit(1);
        }
        clientSocket = serverSocket.accept();
        serverConnect(clientSocket);
        closeConnect();
    }

    public void serverConnect(Socket socket) throws IOException, URISyntaxException{
        this.clientSocket = socket;
        serverConnect();
    }

    public void serverConnect() throws IOException, URISyntaxException{
        OutputStream outputStream = clientSocket.getOutputStream();
        output = new PrintWriter(clientSocket.getOutputStream(), true);
        input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        String outLine, inLine;
        ArrayList<String> req = new ArrayList<>();

        while ((inLine = input.readLine()) != null){
            System.out.println("Got: " + inLine);
            req.add(inLine);
            if (!input.ready()){break;}
        }
        outLine = Handler.get(req, outputStream);
        output.println(outLine);
    }
    
    public void closeConnect() throws IOException{
        output.close();
        input.close();
        clientSocket.close();
        serverSocket.close();
    }
}
