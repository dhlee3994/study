package me.dhlee.springboot2.domain.exam;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "tbl_free_repies", indexes = {@Index(unique = false, columnList = "board_bno")})
public class FreeBoardReply {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rno;
    private String reply;
    private String replyer;

    @CreationTimestamp
    private Timestamp replydate;
    @UpdateTimestamp
    private Timestamp updatedate;

    @ManyToOne
    private FreeBoard board;

    @Override
    public String toString() {
        return "FreeBoardReply{" +
                "rno=" + rno +
                ", reply='" + reply + '\'' +
                ", replyer='" + replyer + '\'' +
                ", replydate=" + replydate +
                ", updatedate=" + updatedate +
                ", board=" + board +
                '}';
    }

    public FreeBoard getBoard() {
        return board;
    }

    public void setBoard(FreeBoard board) {
        this.board = board;
    }

    public Long getRno() {
        return rno;
    }

    public void setRno(Long rno) {
        this.rno = rno;
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }

    public String getReplyer() {
        return replyer;
    }

    public void setReplyer(String replyer) {
        this.replyer = replyer;
    }

    public Timestamp getReplydate() {
        return replydate;
    }

    public void setReplydate(Timestamp replydate) {
        this.replydate = replydate;
    }

    public Timestamp getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Timestamp updatedate) {
        this.updatedate = updatedate;
    }
}

