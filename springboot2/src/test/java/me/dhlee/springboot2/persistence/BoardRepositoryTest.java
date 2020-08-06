package me.dhlee.springboot2.persistence;

import com.querydsl.core.BooleanBuilder;
import me.dhlee.springboot2.domain.Board;
import me.dhlee.springboot2.domain.QBoard;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import javax.swing.*;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class BoardRepositoryTest {
    @Autowired
    private BoardRepository repository;

    @Test
    public void inspect() {
        Class<?> clazz = repository.getClass();
        System.out.println("BoardRepository : " + clazz.getName());

        Class<?>[] interfaces = clazz.getInterfaces();
        Stream.of(interfaces).forEach(inter -> System.out.println("Interfaces : " + inter.getName()));

        Class<?> superClass = clazz.getSuperclass();
        System.out.println("SuperClass : " + superClass.getName());
    }

    @Test
    public void testInsert() {
        Board board = new Board();
        board.setTitle("제목");
        board.setWriter("지은이");
        board.setContent("내용");
        repository.save(board);
    }

    @Test
    public void testInsert200() {
        for (int i = 1; i <= 200; i++) {
            Board board = new Board();
            board.setTitle("제목" + i);
            board.setWriter("지은이" + i);
            board.setContent("내용"+ i);
            repository.save(board);
            System.out.println(repository.count());
        }
    }

    @Test
    public void testRead() throws Exception{
        Optional<Board> optionalBoard = repository.findById(1L);
        if (optionalBoard.isPresent()){
            Board board = optionalBoard.get();
            System.out.println(board);
        }
        else
            System.out.println("asdf");
    }

    @Test
    public void testFindByTitle() {
        repository.findBoardByTitle("제목200").forEach(board -> System.out.println(board));
    }

    @Test
    public void testFindByTitle2() {
        repository.findBoardByTitle("17").forEach(board -> System.out.println(board));
    }

    @Test
    public void testFindByContent() {
        repository.findBoardByTitle("17").forEach(board -> System.out.println(board));
    }

    @Test
    public void testFindByWriter() {
        repository.findByWriter("지은이10").forEach(board -> System.out.println(board));
    }

    @Test
    public void testFindByWriterContaining() {
        repository.findByWriterContaining("5").forEach(board -> System.out.println(board));
    }

    @Test
    public void testBnoOrderByPaging() {
        PageRequest pageRequest = PageRequest.of(0, 10);
        Collection<Board> result = repository.findByBnoGreaterThanOrderByBnoDesc(1L, pageRequest);
        result.forEach(board -> System.out.println(board));
    }

    @Test
    public void testBnoPagingSort() {
        PageRequest pageRequest = PageRequest.of(0, 10);
        Page<Board> result = repository.findByBnoGreaterThan(0L, pageRequest);

        System.out.println("PAGE SIZE   : " + result.getSize());
        System.out.println("TOTAL PAGES : " + result.getTotalPages());
        System.out.println("TOTAL COUNT : " + result.getTotalElements());
        System.out.println("NEXT        : " + result.nextPageable());

        List<Board> list = result.getContent();
        list.forEach(board -> System.out.println(board));
    }

    @Test
    public void testUpdate() {
        Optional<Board> optionalBoard = repository.findById(1L);
        if (optionalBoard.isPresent()) {
            Board board = optionalBoard.get();
            board.setTitle("제목 수정123");
            repository.save(board);
            System.out.println(board);
        } else {
            System.out.println("asdf");
        }
    }

    @Test
    public void testDelete() {
        repository.deleteById(1L);
    }

    // querydsl
    @Test
    public void testPredicate() {
        String type = "t";
        String keyword = "17";
        BooleanBuilder builder = new BooleanBuilder();

        QBoard qBoard = QBoard.board;
        if (type.equals("t")) {
            builder.and(qBoard.title.like("%" + keyword + "%"));
        }

        builder.and(qBoard.bno.gt(0L));

        // Pageable pageable = PageRequest.of(0, 10);
        Page<Board> result = repository.findAll(builder, new PageRequest(0, 10));

        System.out.println("PAGE SIZE : " + result.getSize());
        System.out.println("TOTAL PAGES : " + result.getTotalPages());
        System.out.println("TOTAL COUNT : " + result.getTotalElements());
        System.out.println("NEXT : " + result.nextPageable());

        List<Board> list = result.getContent();
        list.forEach(board -> System.out.println(board));
    }

}