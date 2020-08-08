package me.dhlee.springboot2.domain.exam;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "board")
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bno;
    private String title;
    private String writer;
    private String content;

    @CreationTimestamp
    private LocalDateTime regdate;
    @UpdateTimestamp
    private LocalDateTime updateDate;

    public void setBno(Long bno) {
        this.bno = bno;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setRegdate(LocalDateTime regdate) {
        this.regdate = regdate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public String toString() {
        return "Board{" +
                "bno=" + bno +
                ", title='" + title + '\'' +
                ", writer='" + writer + '\'' +
                ", content='" + content + '\'' +
                ", regdate=" + regdate +
                ", updateDate=" + updateDate +
                '}';
    }

    public Long getBno() {
        return bno;
    }

    public String getTitle() {
        return title;
    }

    public String getWriter() {
        return writer;
    }

    public String getContent() {
        return content;
    }

    public LocalDateTime getRegdate() {
        return regdate;
    }

    public LocalDateTime getUpdateDate() {
        return updateDate;
    }
}
