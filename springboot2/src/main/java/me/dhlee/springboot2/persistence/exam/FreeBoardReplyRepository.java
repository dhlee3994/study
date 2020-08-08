package me.dhlee.springboot2.persistence.exam;

import me.dhlee.springboot2.domain.exam.FreeBoardReply;
import org.springframework.data.repository.CrudRepository;

public interface FreeBoardReplyRepository extends CrudRepository<FreeBoardReply, Long> {

}
