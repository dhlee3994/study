package me.dhlee.springboot2;

import me.dhlee.springboot2.domain.exam.FreeBoard;
import me.dhlee.springboot2.domain.exam.FreeBoardReply;
import me.dhlee.springboot2.persistence.exam.FreeBoardReplyRepository;
import me.dhlee.springboot2.persistence.exam.FreeBoardRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

@RunWith(SpringRunner.class)
@SpringBootTest
@Commit
public class FreeBoardTest {
    @Autowired
    FreeBoardRepository boardRepository;
    @Autowired
    FreeBoardReplyRepository replyRepository;

    @Test
    public void insertDummy() {
        IntStream.range(1, 200).forEach(i -> {

            FreeBoard board = new FreeBoard();
            board.setTitle("Free Board .. " + i);
            board.setContent("Free Content .. " + i);
            board.setWriter("user" + (i % 10));

            boardRepository.save(board);
        });
    }

    @Test
    @Transactional
    public void testInsertReply2Way() {
        Optional<FreeBoard> result = boardRepository.findById(199L);

        result.ifPresent(board -> {
            List<FreeBoardReply> replies = board.getReplies();
            FreeBoardReply reply = new FreeBoardReply();
            reply.setReply("REPLY..................");
            reply.setReplyer("replayer00");
            reply.setBoard(board);

            replies.add(reply);
            board.setReplies(replies);
            boardRepository.save(board);
        });
    }

    @Test
    @Transactional
    public void testInsertReply1Way() {
        FreeBoard board = new FreeBoard();
        board.setBno(199L);

        FreeBoardReply reply = new FreeBoardReply();
        reply.setReply("REPLY...............");
        reply.setReplyer("replayer00");
        reply.setBoard(board);

        replyRepository.save(reply);
    }

    @Test
    public void testList1() {
        Pageable page = PageRequest.of(0, 10, Sort.Direction.DESC, "bno");
        boardRepository.findByBnoGreaterThan(0L, page).forEach(board -> {
            System.out.println(board.getBno() + " : " + board.getTitle());
        });
    }

    @Test
    @Transactional
    public void testList2() {
        Pageable p = PageRequest.of(0, 10, Sort.Direction.DESC, "bno");
        boardRepository.findByBnoGreaterThan(0L, p).forEach(board -> {
            System.out.println(board.getBno() + " : " + board.getTitle() + "(" + board.getReplies().size() + ")");
        });
    }

    @Test
    public void testList3() {
        Pageable p = PageRequest.of(0, 10, Sort.Direction.DESC, "bno");
        boardRepository.getPage(p).forEach(arr -> System.out.println(Arrays.toString(arr)));
    }
}
