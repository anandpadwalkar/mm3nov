package com.swapnil.bookapp.service;

import java.util.List;
import java.util.UUID;

import com.swapnil.bookapp.vo.Author;

public interface AuthorService {
	public void addAuthor(Author author);
	public void addAuthorS(List<Author> books);
	public Author getAuthor(UUID authorId);
	public List<Author> getAuthors();

}
