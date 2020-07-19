package me.dhlee.springboot2.persistence;

import me.dhlee.springboot2.domain.Board;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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
}