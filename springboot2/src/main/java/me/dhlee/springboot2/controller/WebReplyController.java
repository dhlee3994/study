package me.dhlee.springboot2.controller;

import me.dhlee.springboot2.domain.WebBoard;
import me.dhlee.springboot2.domain.WebReply;
import me.dhlee.springboot2.persistence.WebReplyRopository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/replies/")
public class WebReplyController {

    private final WebReplyRopository webReplyRopository;

    @Autowired
    public WebReplyController(WebReplyRopository webReplyRopository) {
        this.webReplyRopository = webReplyRopository;
    }

    @PostMapping("/{bno}")
    @Transactional
    public ResponseEntity<List<WebReply>> addReply(
            @PathVariable("bno") Long bno,
            @RequestBody WebReply reply) {
        System.out.println("addReply.............");
        System.out.println("BNO : " + bno);
        System.out.println("REPLY : " + reply);

        WebBoard board = new WebBoard();
        board.setBno(bno);

        reply.setBoard(board);
        webReplyRopository.save(reply);

        return new ResponseEntity<>(getListByBoard(board), HttpStatus.CREATED);
    }

    private List<WebReply> getListByBoard(WebBoard board) throws RuntimeException {
        System.out.println("getListByBoard..." + board);

        return webReplyRopository.getRepliesOfBoard(board);
    }

    @DeleteMapping("/{bno}/{rno}")
    @Transactional
    public ResponseEntity<List<WebReply>> remove(@PathVariable("bno") Long bno, @PathVariable("rno") Long rno) {
        System.out.println("delete reply : " + rno);

        webReplyRopository.deleteById(rno);

        WebBoard board = new WebBoard();
        board.setBno(bno);

        return new ResponseEntity<>(getListByBoard(board), HttpStatus.OK);
    }

    @PutMapping("/{bno}")
    @Transactional
    public ResponseEntity<List<WebReply>> modify(@PathVariable("bno") Long bno, @RequestBody WebReply reply) {

        System.out.println("modify reply : " + reply);

        webReplyRopository.findById(reply.getRno()).ifPresent(origin -> {
            origin.setReplyText(reply.getReplyText());

            webReplyRopository.save(origin);
        });

        WebBoard board = new WebBoard();
        board.setBno(bno);

        return new ResponseEntity<>(getListByBoard(board), HttpStatus.CREATED);
    }

    @GetMapping("/{bno}")
    public ResponseEntity<List<WebReply>> getReplies(@PathVariable("bno") Long bno) {

        System.out.println("get All Replies....");

        WebBoard board = new WebBoard();
        board.setBno(bno);
        return new ResponseEntity<>(getListByBoard(board), HttpStatus.OK);
    }
}
