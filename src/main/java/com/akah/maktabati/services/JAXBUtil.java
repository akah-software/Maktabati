package com.akah.maktabati.services;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.apache.log4j.Logger;

import com.akah.maktabati.model.jaxb.Library;

public class JAXBUtil {
	
	private static Logger log = Logger.getLogger("logging");
	
	public static Library getLibrary() {
		JAXBContext jc;
		Library library = null;
		try {
			jc = JAXBContext.newInstance("com.akah.maktabati.model.jaxb");
			Unmarshaller unmarshaller = jc.createUnmarshaller();
			library = (Library) unmarshaller.unmarshal(new File("src/main/resources/db.xml"));
		} catch (JAXBException e) {
			log.debug(e, e);
		}
		return library;
	}
	
	public static void setLibrary(Library library) {
		JAXBContext jc;
		try {
			jc = JAXBContext.newInstance("com.akah.maktabati.model.jaxb");
			Marshaller marshaller = jc.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(library, new File("src/main/resources/db.xml"));
		} catch (JAXBException e) {
			log.debug(e, e);
		}
	}
}
