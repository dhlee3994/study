package me.dhlee.springboot2.persistence;

import me.dhlee.springboot2.domain.Board;
import org.springframework.data.repository.CrudRepository;

public interface BoardRepository extends CrudRepository<Board, Long> {
}
