package me.dhlee.springboot2.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tbl_profile")
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long fno;

    private String fname;

    private boolean current;

    @ManyToOne
    private Member member;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Profile profile = (Profile) o;
        return fname.equals(profile.fname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fname);
    }

    @Override
    public String toString() {
        return "Profile{" +
                "fno=" + fno +
                ", fname='" + fname + '\'' +
                ", current=" + current +
                ", member=" + member +
                '}';
    }

    public Long getFno() {
        return fno;
    }

    public void setFno(Long fno) {
        this.fno = fno;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public boolean isCurrent() {
        return current;
    }

    public void setCurrent(boolean current) {
        this.current = current;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }


}
