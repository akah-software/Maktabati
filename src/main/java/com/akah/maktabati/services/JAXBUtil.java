package com.akah.maktabati.services;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.akah.maktabati.model.jaxb.Biblio;

public class JAXBUtil {
	
	public static Biblio getBiblio() {
		JAXBContext jc;
		Biblio biblio = null;
		try {
			jc = JAXBContext.newInstance("com.akah.maktabati.model.jaxb");
			Unmarshaller unmarshaller = jc.createUnmarshaller();
			biblio = (Biblio) unmarshaller.unmarshal(new File("src/main/java/com/akah/maktabati/resources/db.xml"));
		} catch (JAXBException e) {
			//TODO log
			e.printStackTrace();
		}
		return biblio;
	}
	
	public static void setBiblio(Biblio biblio) {
		JAXBContext jc;
		try {
			jc = JAXBContext.newInstance("com.akah.maktabati.model.jaxb");
			Marshaller marshaller = jc.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(biblio, new File("src/main/java/com/akah/maktabati/resources/db.xml"));
		} catch (JAXBException e) {
			//TODO log
			e.printStackTrace();
		}
	}
}
