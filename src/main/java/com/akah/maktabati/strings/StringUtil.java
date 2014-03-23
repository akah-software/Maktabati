package com.akah.maktabati.strings;

import java.io.IOException;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

public class StringUtil {
	
	private static String langChoice = "en";
	
	public static String get(String name) {
		String toReturn = "Cannot find element !";
		SAXBuilder builder = new SAXBuilder();
		try {
			Document doc = builder.build("strings.xml");
			Element root = doc.getRootElement();
			for(Element lang : root.getChildren("lang")) {
				if(lang.getAttribute("name").equals(langChoice)) {
					for(Element seq : lang.getChildren("seq")) {
						if(seq.getAttribute("name").equals(name)) {
							toReturn = seq.getText();
						}
					}
				}
			}
		} catch (JDOMException e) {
			// TODO log
			e.printStackTrace();
		} catch (IOException e) {
			// TODO log
			e.printStackTrace();
		}
		return toReturn;
	}
}
