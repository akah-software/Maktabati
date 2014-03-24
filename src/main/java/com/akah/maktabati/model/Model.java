package com.akah.maktabati.model;

import java.util.ArrayList;

import com.akah.maktabati.model.jaxb.Library;
import com.akah.maktabati.model.jaxb.Library.Authors.Author;
import com.akah.maktabati.model.jaxb.Library.Books.Book;
import com.akah.maktabati.services.JAXBUtil;

public class Model implements Observable {
	
	Library library;

	private ArrayList<Observer> listObserver = new ArrayList<Observer>();
	
	public Model() {
		library = JAXBUtil.getBiblio();
	}
	
	public void addBook(Book book) {
		
	}
	
	public void editBook(Book book) {
		
	}
	
	public void deleteBook(Book book) {
		
	}
	
	public void addAuthor(Author author) {
		
	}
	
	public void editAuthor(Author author) {
		
	}
	
	public void deleteAuthor(Author author) {
		
	}
	
	public void addType(String type) {
		
	}
	
	public void deleteType(String type) {
		
	}
	
	public void addObserver(Observer obs) {
		this.listObserver.add(obs);
	}

	public void removeObserver() {
		listObserver = new ArrayList<Observer>();
	}

	public void notifyObserver(Model model) {
		for(Observer obs : listObserver)
		      obs.update(model);
	}

}
