package com.visa.training.bookwithboot.service;

import java.util.List;

import com.visa.training.bookwithboot.domain.Book;

public interface BookService {
	public Book findById(int id);
	public int addNewBook(Book b);
	public List<Book> findAll();
	public void remove(int id);
}