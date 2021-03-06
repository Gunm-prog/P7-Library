package com.emilie.Library.Services;


import com.emilie.Library.Repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.awt.print.Book;
import java.util.List;

@Service("bookService")
@Transactional //?
public abstract class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;


    @Override
    public Book findBookById(Long bookId) {
        return null;
    }

    @Override
    public List<Book> findBookByTitle(String title) {
        return null;
    }

    @Override
    public Book findBookByIsbn(String isbn) {
        return bookRepository.findByIsbn(isbn);
    }

    @Override
    public List<Book> getBookByCategory(String nameCategory) {
        return bookRepository.findByCategory( nameCategory );
    }


}
