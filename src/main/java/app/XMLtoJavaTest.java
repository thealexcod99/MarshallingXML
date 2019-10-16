package app;
/*
import javax.xml.bind.JAXBContext;

import javax.xml.bind.JAXBException;

import javax.xml.bind.Marshaller;

import javax.xml.bind.Unmarshaller;

import java.io.File;

import java.io.FileNotFoundException;

import java.math.BigDecimal;
*/

import java.io.File;

import javax.xml.bind.JAXBContext;

public class XMLtoJavaTest {

    public void xmlToObject() {
        File file = new File("src/biblioteca.xml");

        JAXBContext jaxbContext = JAXBContext.newInstance(Usuario.class);
    }

}