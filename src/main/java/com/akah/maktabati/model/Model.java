package com.akah.maktabati.model;

import java.util.ArrayList;

import org.apache.log4j.Logger;

import com.akah.maktabati.model.jaxb.AuthorType;
import com.akah.maktabati.model.jaxb.AuthorsType;
import com.akah.maktabati.model.jaxb.BookType;
import com.akah.maktabati.model.jaxb.Library;
import com.akah.maktabati.model.jaxb.TypeType;
import com.akah.maktabati.model.jaxb.TypesType;
import com.akah.maktabati.services.JAXBUtil;

public class Model implements Observable {
	
	private static Logger log = Logger.getLogger("logging");
	
	Library library;
	
	private ArrayList<Observer> listObserver = new ArrayList<Observer>();
	
	public Model() {
		library = JAXBUtil.getLibrary();
	}
	
	public void addBook(BookType book) {
		log.debug("Entering addBook("+book+")");
		library.getBooks().getBook().add(book);
		notifyObserver(this);
		log.debug("Leaving addBook()");
	}
	
	public void addBook(String name, AuthorsType authors, TypesType types) {
		log.debug("Entering addBook("+name+", "+authors+", "+types+")");
		BookType book = new BookType();
		book.setName(name);
		book.setAuthors(authors);
		book.setTypes(types);
		addBook(book);
		log.debug("Leaving addBook()");
	}
	
	public void editBook(BookType book) {
		log.debug("Entering editBook("+book+")");
		for(BookType bookIterator : library.getBooks().getBook()) {
			if(bookIterator.getName().equalsIgnoreCase(book.getName())) {
				bookIterator = book;
				break;
			}
		}
		notifyObserver(this);
		log.debug("Leaving editBook()");
	}
	
	public void deleteBook(BookType book) {
		log.debug("Entering removeBook("+book+")");
		library.getBooks().getBook().remove(book);
		notifyObserver(this);
		log.debug("Leaving removeBook()");
	}
	
	public void addAuthor(AuthorType author) {
		log.debug("Entering addAuthor("+author+")");
		library.getAuthors().getAuthor().add(author);
		notifyObserver(this);
		log.debug("Leaving addAuthor()");
	}
	
	public void editAuthor(AuthorType author) {
		log.debug("Entering editBook("+author+")");
		for(AuthorType authorIterator : library.getAuthors().getAuthor()) {
			if(authorIterator.getName().equalsIgnoreCase(author.getName())) {
				authorIterator = author;
				break;
			}
		}
		notifyObserver(this);
		log.debug("Leaving editBook()");
	}
	
	public void deleteAuthor(AuthorType author) {
		log.debug("Entering deleteAuthor("+author+")");
		library.getAuthors().getAuthor().remove(author);
		notifyObserver(this);
		log.debug("Leaving deleteAuthor()");
	}
	
	public void addType(TypeType type) {
		log.debug("Entering addType("+type+")");
		library.getTypes().getType().add(type);
		notifyObserver(this);
		log.debug("Leaving addType()");
	}
	
	public void deleteType(String type) {
		log.debug("Entering deleteType("+type+")");
		library.getTypes().getType().remove(type);
		notifyObserver(this);
		log.debug("Leaving deleteType()");
	}
	
	public void addObserver(Observer obs) {
		log.debug("Entering addObserver("+obs+")");
		this.listObserver.add(obs);
		log.debug("Leaving addObserver()");
	}

	public void removeObserver() {
		log.debug("Entering removeObserver()");
		listObserver = new ArrayList<Observer>();
		log.debug("Leaving removeObserver()");
	}

	public void notifyObserver(Model model) {
		log.debug("Entering notifyObserver("+model+")");
		for(Observer obs : listObserver)
		      obs.update(model);
		log.debug("Leaving notifyObserver()");
	}
}
