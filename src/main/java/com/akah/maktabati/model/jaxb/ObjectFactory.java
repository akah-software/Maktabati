//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.7 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2014.03.24 à 06:53:08 AM CET 
//


package com.akah.maktabati.model.jaxb;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.akah.maktabati.model.jaxb package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.akah.maktabati.model.jaxb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Library }
     * 
     */
    public Library createLibrary() {
        return new Library();
    }

    /**
     * Create an instance of {@link Library.Books }
     * 
     */
    public Library.Books createLibraryBooks() {
        return new Library.Books();
    }

    /**
     * Create an instance of {@link Library.Authors }
     * 
     */
    public Library.Authors createLibraryAuthors() {
        return new Library.Authors();
    }

    /**
     * Create an instance of {@link Library.Types }
     * 
     */
    public Library.Types createLibraryTypes() {
        return new Library.Types();
    }

    /**
     * Create an instance of {@link Library.Books.Book }
     * 
     */
    public Library.Books.Book createLibraryBooksBook() {
        return new Library.Books.Book();
    }

    /**
     * Create an instance of {@link Library.Authors.Author }
     * 
     */
    public Library.Authors.Author createLibraryAuthorsAuthor() {
        return new Library.Authors.Author();
    }

}
