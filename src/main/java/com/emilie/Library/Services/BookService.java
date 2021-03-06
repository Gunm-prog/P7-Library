package com.emilie.Library.Services;

import com.emilie.Library.Repositories.BookRepository;

import java.awt.print.Book;
import java.util.List;

public interface BookService {

    Book findBookById(Long bookId);

    public Book saveBook (Book book);

    public List<Book> findBookByTitle(String title);

    public Book findBookByIsbn(String Isbn);


    public List<Book> getBookByCategory(String category);


    List<BookRepository> getBookList();

    List<BookRepository> getNewRegisteredBook();
}
