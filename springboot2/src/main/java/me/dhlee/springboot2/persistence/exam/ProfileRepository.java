package me.dhlee.springboot2.persistence.exam;

import me.dhlee.springboot2.domain.exam.Profile;
import org.springframework.data.repository.CrudRepository;

public interface ProfileRepository extends CrudRepository<Profile, Long> {

}
