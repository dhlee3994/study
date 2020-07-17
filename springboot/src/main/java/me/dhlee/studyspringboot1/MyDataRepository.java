package me.dhlee.studyspringboot1;

import me.dhlee.studyspringboot1.MyData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MyDataRepository extends JpaRepository<MyData, Long> {
    Optional<MyData> findById(Long name);
}
