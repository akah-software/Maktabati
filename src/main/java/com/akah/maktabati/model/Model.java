package com.akah.maktabati.model;

import java.util.ArrayList;

import com.akah.maktabati.model.jaxb.Biblio;

public class Model implements Observable {
	
	Biblio biblio;

	private ArrayList<Observer> listObserver = new ArrayList<Observer>();
	
	public void addObserver(Observer obs) {
		this.listObserver.add(obs);
	}

	public void removeObserver() {
		listObserver = new ArrayList<Observer>();
	}

	public void notifyObserver(Model model) {
		for(Observer obs : listObserver)
		      obs.update(this);
	}

}
