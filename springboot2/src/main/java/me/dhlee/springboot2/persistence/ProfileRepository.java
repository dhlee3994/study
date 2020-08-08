package me.dhlee.springboot2.persistence;

import me.dhlee.springboot2.domain.Profile;
import org.springframework.data.repository.CrudRepository;

public interface ProfileRepository extends CrudRepository<Profile, Long> {

}
