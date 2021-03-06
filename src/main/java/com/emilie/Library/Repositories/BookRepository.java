package com.emilie.Library.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.awt.print.Book;
import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long > {

    public Book findByIsbnIgnoreCase(String isbn);

    public List<Book> findByTitleLikeIgnoreCase(String title);

    @Query("SELECT b"
         + "FROM Book b"
         + "INNER JOIN b.category cat"
         + "WHERE cat.name = :name"
        )

    public List<Book> findByCategory(@Param("name") String nameCategory);

    Book findByIsbn(String isbn);
  /*  Book findByBookId(Long bookId);
    Book findByIsbn(String isbn);*/
}
