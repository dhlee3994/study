package me.dhlee.springboot2.persistence.exam;

import me.dhlee.springboot2.domain.exam.PDSBoard;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PDSBoardRepository extends CrudRepository<PDSBoard, Long> {
    @Modifying
    @Query("UPDATE FROM PDSFile f set f.pdsfile = ?2 WHERE f.fno = ?1")
    public int udpatePDSFile(Long fno, String newFileName);

    @Modifying
    @Query("DELETE FROM PDSFile f WHERE f.fno = ?1")
    public int deletePDSFile(Long fno);

    @Query("SELECT p, count(f) FROM PDSBoard p LEFT OUTER JOIN p.files f " +
            "ON p.pid = f WHERE p.pid > 0 GROUP BY p ORDER BY p.pid DESC")
    public List<Object[]> getSummary();


}
