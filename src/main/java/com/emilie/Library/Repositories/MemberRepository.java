package com.emilie.Library.Repositories;


import com.emilie.Library.Model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

    @Override

    Optional<Member> findById(Long id);

    Optional<Member> findByEmail(String email);

}
