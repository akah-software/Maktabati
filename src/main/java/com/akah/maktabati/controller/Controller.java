package com.akah.maktabati.controller;

import org.apache.log4j.Logger;

import com.akah.maktabati.model.Model;

public class Controller {
	
	private static Logger log = Logger.getLogger("logging");
	
	private Model model;
	
	public Controller(Model model) {
		this.model = model;
	}

}
