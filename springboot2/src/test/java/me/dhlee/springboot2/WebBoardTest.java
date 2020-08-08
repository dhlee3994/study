package me.dhlee.springboot2;


import me.dhlee.springboot2.domain.WebBoard;
import me.dhlee.springboot2.persistence.WebBoardRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.stream.IntStream;

@RunWith(SpringRunner.class)
@SpringBootTest
@Commit
public class WebBoardTest {
    @Autowired
    WebBoardRepository repository;

    @Test
    public void insertBoardDummies() {
        IntStream.range(0, 300).forEach(i -> {
            WebBoard board = new WebBoard();

            board.setTitle("Sample Board Title " + i);
            board.setContent("Content Sample .. " + i + " of Board");
            board.setWriter("user0" + (i % 10));

            repository.save(board);
        });
    }

    @Test
    public void testList1() {
        Pageable pageable = PageRequest.of(0, 20, Sort.Direction.DESC, "bno");

        Page<WebBoard> result = repository.findAll(
                repository.makePredicate(null, null), pageable);

        System.out.println("PAGE : " + result.getPageable());
        System.out.println("------------------------------");
        result.getContent().forEach(board -> System.out.println(board));
    }

    @Test
    public void testList2() {
        Pageable pageable = PageRequest.of(0, 20, Sort.Direction.DESC, "bno");
        Page<WebBoard> result = repository.findAll(repository.makePredicate("t", "10"), pageable);

        System.out.println("PAGE : " + result.getPageable());
        System.out.println("------------------------------");
        result.getContent().forEach(board -> System.out.println(board));
    }
}
