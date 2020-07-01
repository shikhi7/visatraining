package com.visa.training.bookwithboot.dal;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.visa.training.bookwithboot.domain.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {
	public List<Book> findAll();
	public Book findById(int id);
}