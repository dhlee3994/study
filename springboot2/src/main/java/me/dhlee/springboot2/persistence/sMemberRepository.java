package me.dhlee.springboot2.persistence;

import me.dhlee.springboot2.domain.Members;
import org.springframework.data.repository.CrudRepository;

public interface sMemberRepository extends CrudRepository<Members, String> {

}
