package com.cooksys.ftd.assignments.concurrency;

import java.io.File;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

import com.cooksys.ftd.assignments.concurrency.model.config.Config;
import com.cooksys.ftd.assignments.concurrency.model.config.ServerConfig;

public class Main {

    /**
     * First, load a {@link com.cooksys.ftd.assignments.concurrency.model.config.Config} object from
     * the <project-root>/config/config.xml file.
     *
     * If the embedded {@link com.cooksys.ftd.assignments.concurrency.model.config.ServerConfig} object
     * is not disabled, create a {@link Server} object with the server config and spin off a thread to run it.
     *
     * If the embedded {@link com.cooksys.ftd.assignments.concurrency.model.config.ClientConfig} object
     * is not disabled, create a {@link Client} object with the client config ans spin off a thread to run it.
     * @throws JAXBException 
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {
    	ServerSocket socket = new ServerSocket(80);
        while (true) {
        	Socket connection = socket.accept();
        	Runnable task = new Runnable() {
        		public void run() {
        			handleRequest(connection);}
        		};
        		new Thread(task).start();}
        
     }
}
