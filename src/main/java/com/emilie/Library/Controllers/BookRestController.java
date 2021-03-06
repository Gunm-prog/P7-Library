package com.emilie.Library.Controllers;


import com.emilie.Library.Model.Book;
import com.emilie.Library.Repositories.BookRepository;
import com.emilie.Library.Services.BookService;
import com.emilie.Library.Services.BookServiceImpl;
import com.emilie.Library.Services.LibraryService;
import io.swagger.annotations.Api;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/consult")
public class BookRestController {

    private final BookService bookService;
    private final LibraryService libraryService;

        @Autowired
        private BookRestController(BookService bookService){

            this.bookService = bookService;
    }

    @GetMapping("/book-catalog")
    public List<BookRepository> listAllBooks(){

            return bookService.getBookList();
    }

    @GetMapping("/new-books")
    public List<BookRepository> getNewRegisteredBook(){

            return bookService.getNewRegisteredBook();
    }



}
