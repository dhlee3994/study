package me.dhlee.springboot2.persistence.exam;

import me.dhlee.springboot2.domain.exam.Member;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MemberRepository extends CrudRepository<Member, String> {
    @Query("SELECT m.uid, count(p) FROM Members m LEFT JOIN Profile p ON m.uid = p.member WHERE m.uid = ?1 GROUP BY m")
    public List<Object[]> getMemberWithProfileCount(String uid);

    @Query("SELECT m, p FROM Members m LEFT OUTER JOIN Profile p ON m.uid = p.member WHERE m.uid = ?1 AND p.current = true")
    public List<Object[]> getMemberWithProfile(String uid);
}
