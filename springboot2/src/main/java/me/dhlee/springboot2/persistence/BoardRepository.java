package me.dhlee.springboot2.persistence;

import me.dhlee.springboot2.domain.Board;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.List;

public interface BoardRepository extends CrudRepository<Board, Long> {
    public List<Board> findBoardByTitle(String title);

    public Collection<Board> findByWriter(String writer);

    public Collection<Board> findByWriterContaining(String writer);

    public List<Board> findByBnoGreaterThanOrderByBnoDesc(Long bno, Pageable paging);

    public Page<Board> findByBnoGreaterThan(Long bno, Pageable paging);

}
