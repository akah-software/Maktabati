package com.akah.maktabati.services;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.akah.maktabati.model.jaxb.Library;

public class JAXBUtil {
	
	public static Library getBiblio() {
		JAXBContext jc;
		Library biblio = null;
		try {
			jc = JAXBContext.newInstance("com.akah.maktabati.model.jaxb");
			Unmarshaller unmarshaller = jc.createUnmarshaller();
			biblio = (Library) unmarshaller.unmarshal(new File("src/main/java/com/akah/maktabati/resources/db.xml"));
		} catch (JAXBException e) {
			//TODO log
			e.printStackTrace();
		}
		return biblio;
	}
	
	public static void setBiblio(Library library) {
		JAXBContext jc;
		try {
			jc = JAXBContext.newInstance("com.akah.maktabati.model.jaxb");
			Marshaller marshaller = jc.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(library, new File("src/main/java/com/akah/maktabati/resources/db.xml"));
		} catch (JAXBException e) {
			//TODO log
			e.printStackTrace();
		}
	}
}
