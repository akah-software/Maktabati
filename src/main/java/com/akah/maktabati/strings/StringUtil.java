package com.akah.maktabati.strings;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

public class StringUtil {
	
	private static Logger log = Logger.getLogger("logging");
	
	private static String langChoice = "en";
	
	public static String get(String name) {
		String toReturn = "Cannot find element !";
		SAXBuilder builder = new SAXBuilder();
		try {
			Document doc = builder.build("src/main/resources/strings.xml");
			Element root = doc.getRootElement();
			for(Element lang : root.getChildren("lang")) {
				if(lang.getAttributeValue("name").equals(langChoice)) {
					for(Element seq : lang.getChildren("seq")) {
						if(seq.getAttributeValue("name").equals(name)) {
							toReturn = seq.getText();
						}
					}
				}
			}
		} catch (JDOMException e) {
			log.error(e, e);
		} catch (IOException e) {
			log.error(e, e);
		}
		return toReturn;
	}
}
