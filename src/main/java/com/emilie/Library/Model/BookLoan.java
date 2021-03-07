/*
package com.emilie.Library.Model;


import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="book_loan")
public class BookLoan {

    @javax.persistence.Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(name="loan_date")
    private LocalDateTime loanDate;
    @Column(name="loan_status")
    private Boolean loanStatus;

    @ManyToOne(targetEntity=Member.class)
    @JoinColumn(name="user_id")
    private Member member;

    public BookLoan(Long id) {
        this.id=id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id=id;
    }

    public LocalDateTime getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(LocalDateTime loanDate) {
        this.loanDate=loanDate;
    }

    public Boolean getLoanStatus() {
        return loanStatus;
    }

    public void setLoanStatus(Boolean loanStatus) {
        this.loanStatus=loanStatus;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member=member;
    }
}
*/
