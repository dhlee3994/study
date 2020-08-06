package me.dhlee.springboot2.persistence;

import me.dhlee.springboot2.domain.Board;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Collection;
import java.util.List;

public interface BoardRepository extends CrudRepository<Board, Long>, QuerydslPredicateExecutor<Board> {
    @Query("SELECT b FROM Board b WHERE b.title LIKE %?1% AND b.bno > 0 ORDER BY b.bno DESC")
    public List<Board> findBoardByTitle(String title);
    @Query("SELECT b FROM Board b WHERE b.content LIKE %:content% AND b.bno > 0 ORDER BY b.bno DESC")
    public List<Board> findbyContent(@Param("content") String content);
    public Collection<Board> findByWriter(String writer);
    public Collection<Board> findByWriterContaining(String writer);
    public List<Board> findByBnoGreaterThanOrderByBnoDesc(Long bno, Pageable paging);
    public Page<Board> findByBnoGreaterThan(Long bno, Pageable paging);



}
