package com.emilie.Library.Services;

import com.emilie.Library.Repositories.BookRepository;
import com.emilie.Library.Repositories.LibraryRepository;
import org.apache.tomcat.jni.Library;

import java.util.List;

public interface LibraryService {

    List<LibraryRepository> getLibraryList();

    List<BookRepository> getBookList(Long libraryId);

    List<BookRepository> getSearchResultByLibrary(boolean available, String  String searchAttribute, String searchCriteria, int libraryId )

    Library findById(Long libraryId);
}
