package com.cooksys.ftd.assignments.concurrency.model.config;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.*;

import java.io.File;
import java.nio.file.Path;
import java.util.List;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Config {

    /**
     * Loads a {@link Config} object from the given xml file path
     *
     * @param path the path at which an xml configuration can be found
     * @return the unmarshalled {@link Config} object
     * @throws JAXBException 
     */
    public static Config load(Path path) throws JAXBException {
    	JAXBContext jaxbContext = JAXBContext.newInstance(Config.class);
    	Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
    	jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
    	jaxbMarshaller.marshal(path, new File("/6-concurrency/config/config.xml"));
    	jaxbMarshaller.marshal(path, System.out);
		return (Config) path;
    }

    /**
     * server configuration
     */
    private ServerConfig server;

    /**
     * client configuration
     */
    private ClientConfig client;

    public ServerConfig getServer() {
        return server;
    }

    public void setServer(ServerConfig server) {
        this.server = server;
    }

    public ClientConfig getClient() {
        return client;
    }

    public void setClient(ClientConfig client) {
        this.client = client;
    }
}
