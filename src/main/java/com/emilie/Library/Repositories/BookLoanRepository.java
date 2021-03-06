package com.emilie.Library.Repositories;


import com.emilie.Library.Model.BookLoan;
import com.emilie.Library.Model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.Optional;
import java.util.Set;


@Repository
public interface BookLoanRepository extends JpaRepository<BookLoan, Long> {

    @Override
    Optional<BookLoan> findById(Long id);

    Optional<BookLoan> findByMember(Member member);

    Set<BookLoan> findByBook(BookLoan bookLoan);

    void deleteById(Long id);
}
