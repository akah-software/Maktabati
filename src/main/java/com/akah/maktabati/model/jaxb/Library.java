//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.7 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2014.03.26 à 09:33:55 PM CET 
//


package com.akah.maktabati.model.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authors" type="{}authorsType"/>
 *         &lt;element name="types" type="{}typesType"/>
 *         &lt;element name="books" type="{}booksType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "authors",
    "types",
    "books"
})
@XmlRootElement(name = "library")
public class Library {

    @XmlElement(required = true)
    protected AuthorsType authors;
    @XmlElement(required = true)
    protected TypesType types;
    @XmlElement(required = true)
    protected BooksType books;

    /**
     * Obtient la valeur de la propriété authors.
     * 
     * @return
     *     possible object is
     *     {@link AuthorsType }
     *     
     */
    public AuthorsType getAuthors() {
        return authors;
    }

    /**
     * Définit la valeur de la propriété authors.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorsType }
     *     
     */
    public void setAuthors(AuthorsType value) {
        this.authors = value;
    }

    /**
     * Obtient la valeur de la propriété types.
     * 
     * @return
     *     possible object is
     *     {@link TypesType }
     *     
     */
    public TypesType getTypes() {
        return types;
    }

    /**
     * Définit la valeur de la propriété types.
     * 
     * @param value
     *     allowed object is
     *     {@link TypesType }
     *     
     */
    public void setTypes(TypesType value) {
        this.types = value;
    }

    /**
     * Obtient la valeur de la propriété books.
     * 
     * @return
     *     possible object is
     *     {@link BooksType }
     *     
     */
    public BooksType getBooks() {
        return books;
    }

    /**
     * Définit la valeur de la propriété books.
     * 
     * @param value
     *     allowed object is
     *     {@link BooksType }
     *     
     */
    public void setBooks(BooksType value) {
        this.books = value;
    }

}
