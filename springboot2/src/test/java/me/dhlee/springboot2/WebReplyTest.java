package me.dhlee.springboot2;

import me.dhlee.springboot2.domain.WebBoard;
import me.dhlee.springboot2.domain.WebReply;
import me.dhlee.springboot2.persistence.WebReplyRopository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.stream.IntStream;

@RunWith(SpringRunner.class)
@SpringBootTest
@Commit
public class WebReplyTest {
    @Autowired
    WebReplyRopository webReplyRopository;

    @Test
    public void testInsertReplies() {
        Long[] arr = {104L, 103L, 100L};
        Arrays.stream(arr).forEach(num -> {
            WebBoard board = new WebBoard();
            board.setBno(num);

            IntStream.range(0, 10).forEach(i -> {
                WebReply reply = new WebReply();
                reply.setReplyText("REPLY ..." + i);
                reply.setReplyer("replyer" + i);
                reply.setBoard(board);

                webReplyRopository.save(reply);
            });
        });
    }
}
