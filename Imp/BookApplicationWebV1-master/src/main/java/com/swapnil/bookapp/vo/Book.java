package com.swapnil.bookapp.vo;

import java.util.List;
import java.util.UUID;

/**
 * @author 			: swapnil-developer 
 * @version 		: 1.1
 * @description     : use to handle book object
 * 
 *  
 */
public class Book {
	private UUID bookId;
	private String bookName;
	private List<Author> listAutor;

	
	/**
	 * @param bookId
	 * @param bookName
	 * @param listAutor
	 */
	public Book(UUID bookId, String bookName, List<Author> listAutor) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.listAutor = listAutor;
	}


	/**
	 * @return the bookId
	 */
	public UUID getBookId() {
		return bookId;
	}


	/**
	 * Sets the book-ID
	 * @param bookId the bookId to set
	 */
	public void setBookId(UUID bookId) {
		this.bookId = bookId;
	}


	/**
	 * @return the bookName
	 */
	public String getBookName() {
		return bookName;
	}


	/**
	 * @param bookName the bookName to set
	 */
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	/**
	 * @return the listAutor
	 */
	public List<Author> getListAutor() {
		return listAutor;
	}


	/**
	 * @param listAutor the listAutor to set
	 */
	public void setListAutor(List<Author> listAutor) {
		this.listAutor = listAutor;
	}


	@Override
	public String toString() {
		return "Book [bookName=" + bookName + "]";
	}

}
